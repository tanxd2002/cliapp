package com.telenav.wzone.database.mapper;

import com.telenav.wzone.database.dto.CarpoolOffer;
import com.telenav.wzone.database.dto.CarpoolOfferExample;
import com.telenav.wzone.database.dto.CarpoolOfferWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarpoolOfferMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ttx_carpool_offer
     *
     * @mbggenerated
     */
    int countByExample(CarpoolOfferExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ttx_carpool_offer
     *
     * @mbggenerated
     */
    int deleteByExample(CarpoolOfferExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ttx_carpool_offer
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ttx_carpool_offer
     *
     * @mbggenerated
     */
    int insert(CarpoolOfferWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ttx_carpool_offer
     *
     * @mbggenerated
     */
    int insertSelective(CarpoolOfferWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ttx_carpool_offer
     *
     * @mbggenerated
     */
    List<CarpoolOfferWithBLOBs> selectByExampleWithBLOBs(CarpoolOfferExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ttx_carpool_offer
     *
     * @mbggenerated
     */
    List<CarpoolOffer> selectByExample(CarpoolOfferExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ttx_carpool_offer
     *
     * @mbggenerated
     */
    CarpoolOfferWithBLOBs selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ttx_carpool_offer
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") CarpoolOfferWithBLOBs record, @Param("example") CarpoolOfferExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ttx_carpool_offer
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") CarpoolOfferWithBLOBs record, @Param("example") CarpoolOfferExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ttx_carpool_offer
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") CarpoolOffer record, @Param("example") CarpoolOfferExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ttx_carpool_offer
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CarpoolOfferWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ttx_carpool_offer
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(CarpoolOfferWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ttx_carpool_offer
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CarpoolOffer record);
}