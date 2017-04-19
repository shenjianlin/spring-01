package com.spring.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_prod_car")
public class ProCarDo {
    @Id
    @Column(name = "car_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer carId;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "prod_id")
    private Integer prodId;

    @Column(name = "pro_size")
    private String proSize;

    @Column(name = "pro_color")
    private String proColor;

    @Column(name = "pro_num")
    private Integer proNum;

    @Column(name = "pro_price")
    private Double proPrice;

    @Column(name = "tal_price")
    private Double talPrice;

    private String state;

    @Column(name = "create_by")
    private String createBy;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "update_by")
    private String updateBy;

    @Column(name = "update_date")
    private Date updateDate;

    /**
     * @return car_id
     */
    public Integer getCarId() {
        return carId;
    }

    /**
     * @param carId
     */
    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    /**
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return prod_id
     */
    public Integer getProdId() {
        return prodId;
    }

    /**
     * @param prodId
     */
    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    /**
     * @return pro_size
     */
    public String getProSize() {
        return proSize;
    }

    /**
     * @param proSize
     */
    public void setProSize(String proSize) {
        this.proSize = proSize;
    }

    /**
     * @return pro_color
     */
    public String getProColor() {
        return proColor;
    }

    /**
     * @param proColor
     */
    public void setProColor(String proColor) {
        this.proColor = proColor;
    }

    /**
     * @return pro_num
     */
    public Integer getProNum() {
        return proNum;
    }

    /**
     * @param proNum
     */
    public void setProNum(Integer proNum) {
        this.proNum = proNum;
    }

    /**
     * @return pro_price
     */
    public Double getProPrice() {
        return proPrice;
    }

    /**
     * @param proPrice
     */
    public void setProPrice(Double proPrice) {
        this.proPrice = proPrice;
    }

    /**
     * @return tal_price
     */
    public Double getTalPrice() {
        return talPrice;
    }

    /**
     * @param talPrice
     */
    public void setTalPrice(Double talPrice) {
        this.talPrice = talPrice;
    }

    /**
     * @return state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return create_by
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * @param createBy
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * @return create_date
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * @return update_by
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * @param updateBy
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * @return update_date
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * @param updateDate
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}