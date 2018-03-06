package com.billgrim.server.database.mapper;

import com.billgrim.server.database.model.SpellSortGroup;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SpellSortGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spell_sort_group
     *
     * @mbg.generated Mon Nov 27 23:38:33 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spell_sort_group
     *
     * @mbg.generated Mon Nov 27 23:38:33 CST 2017
     */
    int insert(SpellSortGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spell_sort_group
     *
     * @mbg.generated Mon Nov 27 23:38:33 CST 2017
     */
    int insertSelective(SpellSortGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spell_sort_group
     *
     * @mbg.generated Mon Nov 27 23:38:33 CST 2017
     */
    SpellSortGroup selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spell_sort_group
     *
     * @mbg.generated Mon Nov 27 23:38:33 CST 2017
     */
    int updateByPrimaryKeySelective(SpellSortGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spell_sort_group
     *
     * @mbg.generated Mon Nov 27 23:38:33 CST 2017
     */
    int updateByPrimaryKey(SpellSortGroup record);

    List<SpellSortGroup> selectBySpellId(@Param(value = "spellId") Integer spellId);
}