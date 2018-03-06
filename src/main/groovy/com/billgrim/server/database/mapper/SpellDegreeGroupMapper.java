package com.billgrim.server.database.mapper;

import com.billgrim.server.database.model.SpellDegreeGroup;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SpellDegreeGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spell_degree_group
     *
     * @mbg.generated Sat Dec 02 06:13:44 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spell_degree_group
     *
     * @mbg.generated Sat Dec 02 06:13:44 CST 2017
     */
    int insert(SpellDegreeGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spell_degree_group
     *
     * @mbg.generated Sat Dec 02 06:13:44 CST 2017
     */
    int insertSelective(SpellDegreeGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spell_degree_group
     *
     * @mbg.generated Sat Dec 02 06:13:44 CST 2017
     */
    SpellDegreeGroup selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spell_degree_group
     *
     * @mbg.generated Sat Dec 02 06:13:44 CST 2017
     */
    int updateByPrimaryKeySelective(SpellDegreeGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spell_degree_group
     *
     * @mbg.generated Sat Dec 02 06:13:44 CST 2017
     */
    int updateByPrimaryKey(SpellDegreeGroup record);

    List<SpellDegreeGroup> selectBySpellId(Integer spellId);
}