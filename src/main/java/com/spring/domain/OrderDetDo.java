package com.spring.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_order_detail")
public class OrderDetDo {
    @Id
    @Column(name = "detail_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer detailId;

    @Column(name = "order_id")
    private String orderId;

    @Column(name = "pro_id")
    private Integer proId;

    @Column(name = "pro_name")
    private String proName;

    @Column(name = "pro_desc")
    private String proDesc;

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
     * @return detail_id
     */
    public Integer getDetailId() {
        return detailId;
    }

    /**
     * @param detailId
     */
    public void setDetailId(Integer detailId) {
        this.detailId = detailId;
    }

    /**
     * @return order_id
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

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