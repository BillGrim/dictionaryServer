package com.billgrim.server.database.service

import com.billgrim.server.database.resultObject.Word

interface WordService {
    Word getWordBySpellId(Integer id)

    Word getWordBySpell(String spell)

    List<Word> getWordList()

    List<Word> getWordListByFeature(String prefix, String suffix, String root)
}