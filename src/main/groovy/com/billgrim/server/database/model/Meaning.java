package com.billgrim.server.database.model;

import java.io.Serializable;

public class Meaning implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column meaning.id
     *
     * @mbg.generated Mon Nov 27 23:37:15 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column meaning.spell_sort_group_id
     *
     * @mbg.generated Mon Nov 27 23:37:15 CST 2017
     */
    private Integer spellSortGroupId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column meaning.meaning
     *
     * @mbg.generated Mon Nov 27 23:37:15 CST 2017
     */
    private String meaning;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table meaning
     *
     * @mbg.generated Mon Nov 27 23:37:15 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column meaning.id
     *
     * @return the value of meaning.id
     *
     * @mbg.generated Mon Nov 27 23:37:15 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column meaning.id
     *
     * @param id the value for meaning.id
     *
     * @mbg.generated Mon Nov 27 23:37:15 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column meaning.spell_sort_group_id
     *
     * @return the value of meaning.spell_sort_group_id
     *
     * @mbg.generated Mon Nov 27 23:37:15 CST 2017
     */
    public Integer getSpellSortGroupId() {
        return spellSortGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column meaning.spell_sort_group_id
     *
     * @param spellSortGroupId the value for meaning.spell_sort_group_id
     *
     * @mbg.generated Mon Nov 27 23:37:15 CST 2017
     */
    public void setSpellSortGroupId(Integer spellSortGroupId) {
        this.spellSortGroupId = spellSortGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column meaning.meaning
     *
     * @return the value of meaning.meaning
     *
     * @mbg.generated Mon Nov 27 23:37:15 CST 2017
     */
    public String getMeaning() {
        return meaning;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column meaning.meaning
     *
     * @param meaning the value for meaning.meaning
     *
     * @mbg.generated Mon Nov 27 23:37:15 CST 2017
     */
    public void setMeaning(String meaning) {
        this.meaning = meaning == null ? null : meaning.trim();
    }
}