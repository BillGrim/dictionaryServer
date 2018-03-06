package com.billgrim.server.database.model;

import java.io.Serializable;
import java.util.List;

public class Spell implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spell.id
     *
     * @mbg.generated Mon Nov 27 23:34:36 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spell.spell
     *
     * @mbg.generated Mon Nov 27 23:34:36 CST 2017
     */
    private String spell;

    private List<String> categoryList;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spell.root_id
     *
     * @mbg.generated Mon Nov 27 23:34:36 CST 2017
     */
    private Integer rootId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spell.pronounce
     *
     * @mbg.generated Mon Nov 27 23:34:36 CST 2017
     */
    private String pronounce;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spell.voice_url
     *
     * @mbg.generated Mon Nov 27 23:34:36 CST 2017
     */
    private String voiceUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table spell
     *
     * @mbg.generated Mon Nov 27 23:34:36 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spell.id
     *
     * @return the value of spell.id
     * @mbg.generated Mon Nov 27 23:34:36 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spell.id
     *
     * @param id the value for spell.id
     * @mbg.generated Mon Nov 27 23:34:36 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spell.spell
     *
     * @return the value of spell.spell
     * @mbg.generated Mon Nov 27 23:34:36 CST 2017
     */
    public String getSpell() {
        return spell;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spell.spell
     *
     * @param spell the value for spell.spell
     * @mbg.generated Mon Nov 27 23:34:36 CST 2017
     */
    public void setSpell(String spell) {
        this.spell = spell == null ? null : spell.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spell.root_id
     *
     * @return the value of spell.root_id
     * @mbg.generated Mon Nov 27 23:34:36 CST 2017
     */
    public Integer getRootId() {
        return rootId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spell.root_id
     *
     * @param rootId the value for spell.root_id
     * @mbg.generated Mon Nov 27 23:34:36 CST 2017
     */
    public void setRootId(Integer rootId) {
        this.rootId = rootId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spell.pronounce
     *
     * @return the value of spell.pronounce
     * @mbg.generated Mon Nov 27 23:34:36 CST 2017
     */
    public String getPronounce() {
        return pronounce;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spell.pronounce
     *
     * @param pronounce the value for spell.pronounce
     * @mbg.generated Mon Nov 27 23:34:36 CST 2017
     */
    public void setPronounce(String pronounce) {
        this.pronounce = pronounce == null ? null : pronounce.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spell.voice_url
     *
     * @return the value of spell.voice_url
     * @mbg.generated Mon Nov 27 23:34:36 CST 2017
     */
    public String getVoiceUrl() {
        return voiceUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spell.voice_url
     *
     * @param voiceUrl the value for spell.voice_url
     * @mbg.generated Mon Nov 27 23:34:36 CST 2017
     */
    public void setVoiceUrl(String voiceUrl) {
        this.voiceUrl = voiceUrl == null ? null : voiceUrl.trim();
    }

    public List<String> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<String> categoryList) {
        this.categoryList = categoryList;
    }
}