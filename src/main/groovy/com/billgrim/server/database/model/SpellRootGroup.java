package com.billgrim.server.database.model;

import java.io.Serializable;

public class SpellRootGroup implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spell_root_group.id
     *
     * @mbg.generated Mon Nov 27 23:40:18 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spell_root_group.spell_id
     *
     * @mbg.generated Mon Nov 27 23:40:18 CST 2017
     */
    private Integer spellId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spell_root_group.root_id
     *
     * @mbg.generated Mon Nov 27 23:40:18 CST 2017
     */
    private Integer rootId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table spell_root_group
     *
     * @mbg.generated Mon Nov 27 23:40:18 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spell_root_group.id
     *
     * @return the value of spell_root_group.id
     *
     * @mbg.generated Mon Nov 27 23:40:18 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spell_root_group.id
     *
     * @param id the value for spell_root_group.id
     *
     * @mbg.generated Mon Nov 27 23:40:18 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spell_root_group.spell_id
     *
     * @return the value of spell_root_group.spell_id
     *
     * @mbg.generated Mon Nov 27 23:40:18 CST 2017
     */
    public Integer getSpellId() {
        return spellId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spell_root_group.spell_id
     *
     * @param spellId the value for spell_root_group.spell_id
     *
     * @mbg.generated Mon Nov 27 23:40:18 CST 2017
     */
    public void setSpellId(Integer spellId) {
        this.spellId = spellId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spell_root_group.root_id
     *
     * @return the value of spell_root_group.root_id
     *
     * @mbg.generated Mon Nov 27 23:40:18 CST 2017
     */
    public Integer getRootId() {
        return rootId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spell_root_group.root_id
     *
     * @param rootId the value for spell_root_group.root_id
     *
     * @mbg.generated Mon Nov 27 23:40:18 CST 2017
     */
    public void setRootId(Integer rootId) {
        this.rootId = rootId;
    }
}