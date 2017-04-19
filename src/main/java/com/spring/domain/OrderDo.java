package com.spring.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_order")
public class OrderDo {
    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String orderId;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "order_price")
    private Double orderPrice;

    @Column(name = "order_name")
    private String orderName;

    @Column(name = "order_addr")
    private String orderAddr;

    @Column(name = "order_phone")
    private String orderPhone;

    @Column(name = "order_tel")
    private String orderTel;

    @Column(name = "order_desc")
    private String orderDesc;

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
     * @return order_price
     */
    public Double getOrderPrice() {
        return orderPrice;
    }

    /**
     * @param orderPrice
     */
    public void setOrderPrice(Double orderPrice) {
        this.orderPrice = orderPrice;
    }

    /**
     * @return order_name
     */
    public String getOrderName() {
        return orderName;
    }

    /**
     * @param orderName
     */
    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    /**
     * @return order_addr
     */
    public String getOrderAddr() {
        return orderAddr;
    }

    /**
     * @param orderAddr
     */
    public void setOrderAddr(String orderAddr) {
        this.orderAddr = orderAddr;
    }

    /**
     * @return order_phone
     */
    public String getOrderPhone() {
        return orderPhone;
    }

    /**
     * @param orderPhone
     */
    public void setOrderPhone(String orderPhone) {
        this.orderPhone = orderPhone;
    }

    /**
     * @return order_tel
     */
    public String getOrderTel() {
        return orderTel;
    }

    /**
     * @param orderTel
     */
    public void setOrderTel(String orderTel) {
        this.orderTel = orderTel;
    }

    /**
     * @return order_desc
     */
    public String getOrderDesc() {
        return orderDesc;
    }

    /**
     * @param orderDesc
     */
    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
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