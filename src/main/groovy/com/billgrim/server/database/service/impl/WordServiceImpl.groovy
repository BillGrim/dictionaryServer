package com.billgrim.server.database.service.impl

import com.billgrim.server.database.mapper.CategoryMapper
import com.billgrim.server.database.mapper.DegreeMapper
import com.billgrim.server.database.mapper.ImageMapper
import com.billgrim.server.database.mapper.MeaningMapper
import com.billgrim.server.database.mapper.PrefixMapper
import com.billgrim.server.database.mapper.RootMapper
import com.billgrim.server.database.mapper.SortMapper
import com.billgrim.server.database.mapper.SpellCategoryGroupMapper
import com.billgrim.server.database.mapper.SpellDegreeGroupMapper
import com.billgrim.server.database.mapper.SpellMapper
import com.billgrim.server.database.mapper.SpellPrefixGroupMapper
import com.billgrim.server.database.mapper.SpellSortGroupMapper
import com.billgrim.server.database.mapper.SpellSuffixGroupMapper
import com.billgrim.server.database.mapper.SuffixMapper
import com.billgrim.server.database.model.Category
import com.billgrim.server.database.model.Degree
import com.billgrim.server.database.model.Image
import com.billgrim.server.database.model.Meaning
import com.billgrim.server.database.model.Prefix
import com.billgrim.server.database.model.Root
import com.billgrim.server.database.model.Sort
import com.billgrim.server.database.model.Spell
import com.billgrim.server.database.model.SpellCategoryGroup
import com.billgrim.server.database.model.SpellDegreeGroup
import com.billgrim.server.database.model.SpellPrefixGroup
import com.billgrim.server.database.model.SpellRootGroup
import com.billgrim.server.database.model.SpellSortGroup
import com.billgrim.server.database.model.SpellSuffixGroup
import com.billgrim.server.database.model.Suffix
import com.billgrim.server.database.resultObject.MeaningAndImage
import com.billgrim.server.database.resultObject.More
import com.billgrim.server.database.resultObject.Word
import com.billgrim.server.database.service.WordService
import org.apache.commons.lang.StringUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

import java.util.stream.Collectors

@Service
class WordServiceImpl implements WordService {

    @Autowired
    SpellMapper spellMapper

    @Autowired
    RootMapper rootMapper

    @Autowired
    DegreeMapper degreeMapper

    @Autowired
    SpellDegreeGroupMapper spellDegreeGroupMapper

    @Autowired
    CategoryMapper categoryMapper

    @Autowired
    SpellCategoryGroupMapper spellCategoryGroupMapper

    @Autowired
    MeaningMapper meaningMapper

    @Autowired
    SortMapper sortMapper

    @Autowired
    SpellSortGroupMapper spellSortGroupMapper

    @Autowired
    SuffixMapper suffixMapper

    @Autowired
    SpellSuffixGroupMapper spellSuffixGroupMapper

    @Autowired
    PrefixMapper prefixMapper

    @Autowired
    SpellPrefixGroupMapper spellPrefixGroupMapper

    @Autowired
    ImageMapper imageMapper

    @Override
    Word getWordBySpellId(Integer id) {
        Spell spell = spellMapper.selectByPrimaryKey(id)
        if (spell != null) {
            return getWordFromSpell(spell)
        }
        return new Word()
    }

    private Word getWordFromSpell(Spell spell) {
        Word word = new Word()
        List<SpellCategoryGroup> spellCategoryGroupList = spellCategoryGroupMapper.selectBySpellId(spell.id)
        if (spellCategoryGroupList != null) {
            List<String> categories = new ArrayList<>()
            spellCategoryGroupList.forEach({ group ->
                Category category = categoryMapper.selectByPrimaryKey(group.categoryId)
                categories.add(category.category)
            })
            spell.categoryList = categories
        }
        word.spell = spell

        List<SpellDegreeGroup> spellDegreeGroupList = spellDegreeGroupMapper.selectBySpellId(spell.id)
        if (spellDegreeGroupList != null) {
            List<String> degreeList = new ArrayList<>()
            spellDegreeGroupList.forEach({ group ->
                Degree degree = degreeMapper.selectByPrimaryKey(group.degreeId)
                degreeList.add(degree.degree)
            })
            word.degreeList = degreeList
        }
        Integer rootId = spell.rootId
        if (rootId != null) {
            Root root = rootMapper.selectByPrimaryKey(rootId)
            word.root = root
        }

        List<SpellPrefixGroup> spellPrefixGroupList = spellPrefixGroupMapper.selectBySpellId(spell.id)
        if (spellPrefixGroupList != null && spellCategoryGroupList.size() > 0) {
            Prefix prefix = prefixMapper.selectByPrimaryKey(spellPrefixGroupList.get(0).prefixId)
            word.prefix = prefix
        }

        List<SpellSuffixGroup> spellSuffixGroupList = spellSuffixGroupMapper.selectBySpellId(spell.id)
        if (spellSuffixGroupList != null && spellSuffixGroupList.size() > 0) {
            Suffix suffix = suffixMapper.selectByPrimaryKey(spellSuffixGroupList.get(0).suffixId)
            word.suffix = suffix
        }


        List<SpellSortGroup> spellSortGroupList = spellSortGroupMapper.selectBySpellId(spell.id)
        if (spellSortGroupList != null) {
            ArrayList<More> toChinese = new ArrayList<>()
            spellSortGroupList.forEach({ group ->
                Sort sort = sortMapper.selectByPrimaryKey(group.sortId)
                More more = new More()
                more.sort = sort
                List<Meaning> meanings = meaningMapper.selectBySpellAndSortGroupId(group.id)
                if (meanings != null) {
                    ArrayList<MeaningAndImage> meaningAndImageArrayList = new ArrayList<>()
                    meanings.forEach({ meaning ->
                        MeaningAndImage meaningAndImage = new MeaningAndImage()
                        meaningAndImage.meaning = meaning
                        List<Image> image = imageMapper.selectByMeaningId(meaning.id)
                        if (image != null && image.size() > 0) {
                            meaningAndImage.url = image[0]
                        }
                        meaningAndImageArrayList.add(meaningAndImage)
                    })
                    more.meanings = meaningAndImageArrayList
                }

                toChinese.add(more)
            })
            word.toChinese = toChinese
        }
        return word
    }

    @Override
    Word getWordBySpell(String spell) {
        Spell spellObject = spellMapper.selectBySpell(spell)
        if (spell != null) {
            return getWordFromSpell(spellObject)
        }
        return new Word()
    }

    @Override
    List<Word> getWordList() {
        List<Spell> spellList = spellMapper.getSpellList()
        return spellList.stream().map({ spell -> getWordFromSpell(spell) }).collect(Collectors.toList())
    }

    @Override
    List<Word> getWordListByFeature(String prefix, String suffix, String root) {
        boolean hasPrefix, hasSuffix, hasRoot
        List<Integer> spellIdListByPrefix = new ArrayList<>(), spellIdListBySuffix = new ArrayList<>(), spellIdListByRoot = new ArrayList<>()
        List<Spell> spellListByRoot
        if (StringUtils.isNotBlank(prefix)) {
            hasPrefix = true
            Prefix prefixItem = prefixMapper.selectByPrefix(prefix.trim())
            if (prefixItem != null) {
                List<SpellPrefixGroup> spellPrefixGroupList = spellPrefixGroupMapper.selectByPrefixId(prefixItem.id)
                spellIdListByPrefix = spellPrefixGroupList.stream().map({ group -> group.spellId }).collect(Collectors.toList())
            }
        }
        if (StringUtils.isNotBlank(suffix)) {
            hasSuffix = true
            Suffix suffixItem = suffixMapper.selectBySuffix(suffix.trim())
            if (suffixItem != null) {
                List<SpellSuffixGroup> spellSuffixGroupList = spellSuffixGroupMapper.selectBySuffixId(suffixItem.id)
                spellIdListBySuffix = spellSuffixGroupList.stream().map({ group -> group.spellId }).collect(Collectors.toList())
            }
        }
        if (StringUtils.isNotBlank(root)) {
            hasRoot = true
            Root rootItem = rootMapper.selectByRoot(root.trim())
            if (rootItem != null) {
                spellListByRoot = spellMapper.selectByRootId(rootItem.id)
                spellIdListByRoot = spellListByRoot.stream().map({ spell -> spell.id }).collect(Collectors.toList())
            }
        }
        List<Integer> spellIdList = new ArrayList<>()
        if (hasPrefix) {
            spellIdList.addAll(spellIdListByPrefix)
        }
        if (hasSuffix) {
            if (spellIdList.isEmpty()) {
                spellIdList.addAll(spellIdListBySuffix)
            } else {
                spellIdList = spellIdList.stream().filter({ spellId -> spellIdListBySuffix.contains(spellId) }).collect(Collectors.toList())
            }
        }
        if (hasRoot) {
            if (spellIdList.isEmpty()) {
                spellIdList.addAll(spellIdListByRoot)
            } else {
                spellIdList = spellIdList.stream().filter({ spellId -> spellIdListByRoot.contains(spellId) }).collect(Collectors.toList())
            }
        }
        if (spellIdList.size() > 0) {
            def spellList = spellMapper.selectByPrimaryKeyList(spellIdList)
            return spellList.stream().map({ spell -> getWordFromSpell(spell) }).collect(Collectors.toList())
        } else {
            return new ArrayList<Word>()
        }
    }
}
