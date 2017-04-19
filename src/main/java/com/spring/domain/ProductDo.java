package com.spring.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_product")
public class ProductDo {
    @Id
    @Column(name = "pro_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer proId;

    @Column(name = "pro_name")
    private String proName;

    @Column(name = "pro_real_price")
    private Double proRealPrice;

    @Column(name = "pro_now_price")
    private Double proNowPrice;

    @Column(name = "is_stock")
    private String isStock;

    @Column(name = "pro_desc")
    private String proDesc;

    @Column(name = "pro_size")
    private String proSize;

    @Column(name = "pro_color")
    private String proColor;

    @Column(name = "pro_score")
    private Double proScore;

    @Column(name = "pro_type_id")
    private String proTypeId;

    @Column(name = "pro_pic_id")
    private Integer proPicId;

    @Column(name = "pro_pic_uri")
    private String proPicUri;

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
     * @return pro_id
     */
    public Integer getProId() {
        return proId;
    }

    /**
     * @param proId
     */
    public void setProId(Integer proId) {
        this.proId = proId;
    }

    /**
     * @return pro_name
     */
    public String getProName() {
        return proName;
    }

    /**
     * @param proName
     */
    public void setProName(String proName) {
        this.proName = proName;
    }

    /**
     * @return pro_real_price
     */
    public Double getProRealPrice() {
        return proRealPrice;
    }

    /**
     * @param proRealPrice
     */
    public void setProRealPrice(Double proRealPrice) {
        this.proRealPrice = proRealPrice;
    }

    /**
     * @return pro_now_price
     */
    public Double getProNowPrice() {
        return proNowPrice;
    }

    /**
     * @param proNowPrice
     */
    public void setProNowPrice(Double proNowPrice) {
        this.proNowPrice = proNowPrice;
    }

    /**
     * @return is_stock
     */
    public String getIsStock() {
        return isStock;
    }

    /**
     * @param isStock
     */
    public void setIsStock(String isStock) {
        this.isStock = isStock;
    }

    /**
     * @return pro_desc
     */
    public String getProDesc() {
        return proDesc;
    }

    /**
     * @param proDesc
     */
    public void setProDesc(String proDesc) {
        this.proDesc = proDesc;
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
     * @return pro_score
     */
    public Double getProScore() {
        return proScore;
    }

    /**
     * @param proScore
     */
    public void setProScore(Double proScore) {
        this.proScore = proScore;
    }

    /**
     * @return pro_type_id
     */
    public String getProTypeId() {
        return proTypeId;
    }

    /**
     * @param proTypeId
     */
    public void setProTypeId(String proTypeId) {
        this.proTypeId = proTypeId;
    }

    /**
     * @return pro_pic_id
     */
    public Integer getProPicId() {
        return proPicId;
    }

    /**
     * @param proPicId
     */
    public void setProPicId(Integer proPicId) {
        this.proPicId = proPicId;
    }

    /**
     * @return pro_pic_uri
     */
    public String getProPicUri() {
        return proPicUri;
    }

    /**
     * @param proPicUri
     */
    public void setProPicUri(String proPicUri) {
        this.proPicUri = proPicUri;
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