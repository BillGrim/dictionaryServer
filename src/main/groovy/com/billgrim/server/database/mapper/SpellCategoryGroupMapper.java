package com.billgrim.server.database.mapper;

import com.billgrim.server.database.model.SpellCategoryGroup;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SpellCategoryGroupMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(SpellCategoryGroup record);

    int insertSelective(SpellCategoryGroup record);

    SpellCategoryGroup selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SpellCategoryGroup record);

    int updateByPrimaryKey(SpellCategoryGroup record);

    List<SpellCategoryGroup> selectBySpellId(Integer spellId);
}