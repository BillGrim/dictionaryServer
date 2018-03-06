package com.billgrim.server.database.service

import com.billgrim.server.database.model.Spell

interface SpellService {
    Spell getSpellBySpell(String spell)

    Spell getSpellById(Integer id)

    List<Spell> getSpellListByRoot(String root)

    List<Spell> getSpellListByCategory(String category)

    List<Spell> getSpellList()
}
