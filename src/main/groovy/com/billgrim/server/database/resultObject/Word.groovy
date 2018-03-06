package com.billgrim.server.database.resultObject

import com.billgrim.server.database.model.Prefix
import com.billgrim.server.database.model.Root
import com.billgrim.server.database.model.Spell
import com.billgrim.server.database.model.Suffix

class Word {
    Spell spell
    ArrayList<String> degreeList
    Root root
    Prefix prefix
    Suffix suffix
    ArrayList<More> toChinese
}
