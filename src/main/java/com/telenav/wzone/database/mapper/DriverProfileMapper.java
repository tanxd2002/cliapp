package com.telenav.wzone.database.mapper;

import com.telenav.wzone.database.dto.DriverProfile;
import com.telenav.wzone.database.dto.DriverProfileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DriverProfileMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ttx_driver_profile
     *
     * @mbggenerated
     */
    int countByExample(DriverProfileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ttx_driver_profile
     *
     * @mbggenerated
     */
    int deleteByExample(DriverProfileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ttx_driver_profile
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ttx_driver_profile
     *
     * @mbggenerated
     */
    int insert(DriverProfile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ttx_driver_profile
     *
     * @mbggenerated
     */
    int insertSelective(DriverProfile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ttx_driver_profile
     *
     * @mbggenerated
     */
    List<DriverProfile> selectByExample(DriverProfileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ttx_driver_profile
     *
     * @mbggenerated
     */
    DriverProfile selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ttx_driver_profile
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") DriverProfile record, @Param("example") DriverProfileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ttx_driver_profile
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") DriverProfile record, @Param("example") DriverProfileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ttx_driver_profile
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(DriverProfile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ttx_driver_profile
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(DriverProfile record);
}