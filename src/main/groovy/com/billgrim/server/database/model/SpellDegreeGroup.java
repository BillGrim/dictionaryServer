package com.billgrim.server.database.model;

import java.io.Serializable;

public class SpellDegreeGroup implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spell_degree_group.id
     *
     * @mbg.generated Sat Dec 02 06:13:44 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spell_degree_group.spell_id
     *
     * @mbg.generated Sat Dec 02 06:13:44 CST 2017
     */
    private Integer spellId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spell_degree_group.degree_id
     *
     * @mbg.generated Sat Dec 02 06:13:44 CST 2017
     */
    private Integer degreeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table spell_degree_group
     *
     * @mbg.generated Sat Dec 02 06:13:44 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spell_degree_group.id
     *
     * @return the value of spell_degree_group.id
     *
     * @mbg.generated Sat Dec 02 06:13:44 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spell_degree_group.id
     *
     * @param id the value for spell_degree_group.id
     *
     * @mbg.generated Sat Dec 02 06:13:44 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spell_degree_group.spell_id
     *
     * @return the value of spell_degree_group.spell_id
     *
     * @mbg.generated Sat Dec 02 06:13:44 CST 2017
     */
    public Integer getSpellId() {
        return spellId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spell_degree_group.spell_id
     *
     * @param spellId the value for spell_degree_group.spell_id
     *
     * @mbg.generated Sat Dec 02 06:13:44 CST 2017
     */
    public void setSpellId(Integer spellId) {
        this.spellId = spellId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spell_degree_group.degree_id
     *
     * @return the value of spell_degree_group.degree_id
     *
     * @mbg.generated Sat Dec 02 06:13:44 CST 2017
     */
    public Integer getDegreeId() {
        return degreeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spell_degree_group.degree_id
     *
     * @param degreeId the value for spell_degree_group.degree_id
     *
     * @mbg.generated Sat Dec 02 06:13:44 CST 2017
     */
    public void setDegreeId(Integer degreeId) {
        this.degreeId = degreeId;
    }
}