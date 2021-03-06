package com.billgrim.server.database.model;

import java.io.Serializable;

public class Category implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.id
     *
     * @mbg.generated Mon Nov 27 23:37:33 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.category
     *
     * @mbg.generated Mon Nov 27 23:37:33 CST 2017
     */
    private String category;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table category
     *
     * @mbg.generated Mon Nov 27 23:37:33 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.id
     *
     * @return the value of category.id
     *
     * @mbg.generated Mon Nov 27 23:37:33 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.id
     *
     * @param id the value for category.id
     *
     * @mbg.generated Mon Nov 27 23:37:33 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.category
     *
     * @return the value of category.category
     *
     * @mbg.generated Mon Nov 27 23:37:33 CST 2017
     */
    public String getCategory() {
        return category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.category
     *
     * @param category the value for category.category
     *
     * @mbg.generated Mon Nov 27 23:37:33 CST 2017
     */
    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }
}