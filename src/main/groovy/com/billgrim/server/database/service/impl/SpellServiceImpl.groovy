package com.billgrim.server.database.service.impl

import com.billgrim.server.database.mapper.ImageMapper
import com.billgrim.server.database.mapper.MeaningMapper
import com.billgrim.server.database.mapper.RootMapper
import com.billgrim.server.database.mapper.SortMapper
import com.billgrim.server.database.mapper.SpellMapper
import com.billgrim.server.database.model.Root
import com.billgrim.server.database.model.Spell
import com.billgrim.server.database.service.SpellService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SpellServiceImpl implements SpellService {
    @Autowired
    SpellMapper spellMapper
    @Autowired
    RootMapper rootMapper
    @Autowired
    MeaningMapper meaningMapper

    @Autowired
    SortMapper sortMapper

    @Autowired
    ImageMapper imageMapper

    @Override
    Spell getSpellBySpell(String spell) {
        return spellMapper.selectBySpell(spell)
    }

    @Override
    Spell getSpellById(Integer id) {
        Spell spell = spellMapper.selectByPrimaryKey(id)
        if (spell.rootId != null) {
            Root root = rootMapper.selectByPrimaryKey(spell.rootId)
        }
        return spell
    }

    @Override
    List<Spell> getSpellListByRoot(String root) {
        return null
    }

    @Override
    List<Spell> getSpellListByCategory(String category) {
        return null
    }

    @Override
    List<Spell> getSpellList() {
        return null
    }
}
