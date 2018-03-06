package com.billgrim.server.controller

import com.billgrim.server.database.mapper.SpellMapper
import com.billgrim.server.database.resultObject.Word
import com.billgrim.server.database.service.SpellService
import com.billgrim.server.database.service.WordService
import com.github.pagehelper.Page
import com.github.pagehelper.PageHelper
import com.github.pagehelper.PageInfo
import net.sf.json.JSONArray
import net.sf.json.JSONObject
import org.apache.commons.lang.StringUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
class WordController {
    @Autowired
    WordService wordService


    @ResponseBody
    @RequestMapping(value = "/getWordList.json", produces = "application/json;charset=UTF-8")
    String getWordBySpell(@RequestParam(defaultValue = "1") Integer page,
                          @RequestParam(defaultValue = "10") Integer count) {
        Page<Word> pager = PageHelper.startPage(page, count)
        List<Word> wordList = wordService.getWordList()
        PageInfo<Word> info = new PageInfo(pager)
        JSONObject object = new JSONObject()
        object.put("count", wordList.size())
        object.put("totalCount", info.total)
        object.put("page", info.pageNum)
        object.put("totalPage", info.pages)
        JSONArray data = new JSONArray()
        wordList.forEach({ word -> data.add(parseWord2JSONObject(word)) })
        object.put("data", data)
        return object.toString()
    }

    @ResponseBody
    @RequestMapping(value = "/getWordBySpell.json", produces = "application/json;charset=UTF-8")
    String getWordBySpell(String word) {
        return parseWord2JSONObject(wordService.getWordBySpell(word)).toString()
    }

    @ResponseBody
    @RequestMapping(value = "/getWordListByFeature.json", produces = "application/json;charset=UTF-8")
    String getWordListByFeature(@RequestParam(defaultValue = "1") Integer page,
                                @RequestParam(defaultValue = "10") Integer count,
                                @RequestParam(required = false) String prefix,
                                @RequestParam(required = false) String suffix,
                                @RequestParam(required = false) String root
    ) {
        Page<Word> pager = PageHelper.startPage(page, count)
        List<Word> wordList = wordService.getWordListByFeature(prefix, suffix, root)
        PageInfo<Word> info = new PageInfo(pager)
        JSONObject object = new JSONObject()
        object.put("count", wordList.size())
        object.put("totalCount", info.total)
        object.put("page", info.pageNum)
        object.put("totalPage", info.pages)
        JSONArray data = new JSONArray()
        wordList.forEach({ word -> data.add(parseWord2JSONObject(word)) })
        object.put("data", data)
        return object.toString()
    }

    @ResponseBody
    @RequestMapping(value = "/getWordById.json", produces = "application/json;charset=UTF-8")
    String getWordById(Integer id) {
        return parseWord2JSONObject(wordService.getWordBySpellId(id)).toString()
//        return JSONObject.fromObject(wordService.getWordBySpellId(id)).toString()
    }

    public static JSONObject parseWord2JSONObject(Word word) {
        if (word == null || word.spell == null) {
            return null
        }
        JSONObject jsonObject = new JSONObject()
        jsonObject.put("english", word.spell.spell)
        jsonObject.put("pronounce", word.spell.pronounce)
        jsonObject.put("voice_url", word.spell.voiceUrl == null ? "" : word.spell.voiceUrl)
        if (word.root != null) {
            jsonObject.put("root", word.root.root)
        }
        jsonObject.put("degrees", word.degreeList == null ? new ArrayList<>() : word.degreeList)

//        if (word.suffix != null) {
        jsonObject.put("suffix", word.suffix == null ? "" : word.suffix.suffix)
//        }
//        if (word.prefix != null) {
        jsonObject.put("prefix", word.prefix == null ? "" : word.prefix.prefix)
//        }
        jsonObject.put("categoryList", word.spell.categoryList)
        jsonObject.put("toChinese", word.spell.voiceUrl)
        if (word.toChinese != null) {
            JSONArray jsonArray = new JSONArray()
            word.toChinese.forEach({ more ->
                JSONObject moreObject = new JSONObject()
                moreObject.put("sort", more.sort.sort)
                if (more.meanings != null) {
                    JSONArray meaningsObject = new JSONArray()
                    more.meanings.forEach({ meaningAndImage ->
                        JSONObject meaningAndImageObject = new JSONObject()
                        meaningAndImageObject.put("meaning", meaningAndImage.meaning.meaning)
                        meaningAndImageObject.put("url", meaningAndImage.url == null ? "" : meaningAndImage.url)
                        meaningsObject.add(meaningAndImageObject)
                    })
                    moreObject.put("meanings", meaningsObject)
                }
                jsonArray.add(moreObject)
            })

            jsonObject.put("toChinese", jsonArray)
        }

        return jsonObject
    }
}
