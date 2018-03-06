package com.billgrim.server.database.mapper;

import com.billgrim.server.database.model.Degree;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DegreeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table degree
     *
     * @mbg.generated Mon Nov 27 23:36:15 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table degree
     *
     * @mbg.generated Mon Nov 27 23:36:15 CST 2017
     */
    int insert(Degree record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table degree
     *
     * @mbg.generated Mon Nov 27 23:36:15 CST 2017
     */
    int insertSelective(Degree record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table degree
     *
     * @mbg.generated Mon Nov 27 23:36:15 CST 2017
     */
    Degree selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table degree
     *
     * @mbg.generated Mon Nov 27 23:36:15 CST 2017
     */
    int updateByPrimaryKeySelective(Degree record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table degree
     *
     * @mbg.generated Mon Nov 27 23:36:15 CST 2017
     */
    int updateByPrimaryKey(Degree record);
}