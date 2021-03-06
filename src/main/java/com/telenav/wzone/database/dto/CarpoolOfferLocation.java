package com.telenav.wzone.database.dto;

import java.util.Date;

public class CarpoolOfferLocation {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ttx_carpool_offer_location.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ttx_carpool_offer_location.OFFER_ID
     *
     * @mbggenerated
     */
    private Long offerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ttx_carpool_offer_location.TYPE
     *
     * @mbggenerated
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ttx_carpool_offer_location.ADDRESS
     *
     * @mbggenerated
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ttx_carpool_offer_location.LAT
     *
     * @mbggenerated
     */
    private Double lat;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ttx_carpool_offer_location.LON
     *
     * @mbggenerated
     */
    private Double lon;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ttx_carpool_offer_location.CREATE_TIME
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ttx_carpool_offer_location.ID
     *
     * @return the value of ttx_carpool_offer_location.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ttx_carpool_offer_location.ID
     *
     * @param id the value for ttx_carpool_offer_location.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ttx_carpool_offer_location.OFFER_ID
     *
     * @return the value of ttx_carpool_offer_location.OFFER_ID
     *
     * @mbggenerated
     */
    public Long getOfferId() {
        return offerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ttx_carpool_offer_location.OFFER_ID
     *
     * @param offerId the value for ttx_carpool_offer_location.OFFER_ID
     *
     * @mbggenerated
     */
    public void setOfferId(Long offerId) {
        this.offerId = offerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ttx_carpool_offer_location.TYPE
     *
     * @return the value of ttx_carpool_offer_location.TYPE
     *
     * @mbggenerated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ttx_carpool_offer_location.TYPE
     *
     * @param type the value for ttx_carpool_offer_location.TYPE
     *
     * @mbggenerated
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ttx_carpool_offer_location.ADDRESS
     *
     * @return the value of ttx_carpool_offer_location.ADDRESS
     *
     * @mbggenerated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ttx_carpool_offer_location.ADDRESS
     *
     * @param address the value for ttx_carpool_offer_location.ADDRESS
     *
     * @mbggenerated
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ttx_carpool_offer_location.LAT
     *
     * @return the value of ttx_carpool_offer_location.LAT
     *
     * @mbggenerated
     */
    public Double getLat() {
        return lat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ttx_carpool_offer_location.LAT
     *
     * @param lat the value for ttx_carpool_offer_location.LAT
     *
     * @mbggenerated
     */
    public void setLat(Double lat) {
        this.lat = lat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ttx_carpool_offer_location.LON
     *
     * @return the value of ttx_carpool_offer_location.LON
     *
     * @mbggenerated
     */
    public Double getLon() {
        return lon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ttx_carpool_offer_location.LON
     *
     * @param lon the value for ttx_carpool_offer_location.LON
     *
     * @mbggenerated
     */
    public void setLon(Double lon) {
        this.lon = lon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ttx_carpool_offer_location.CREATE_TIME
     *
     * @return the value of ttx_carpool_offer_location.CREATE_TIME
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ttx_carpool_offer_location.CREATE_TIME
     *
     * @param createTime the value for ttx_carpool_offer_location.CREATE_TIME
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}