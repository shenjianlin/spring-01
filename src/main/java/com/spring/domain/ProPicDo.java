package com.spring.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_prod_pic")
public class ProPicDo {
    @Id
    @Column(name = "pic_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer picId;

    @Column(name = "pro_id")
    private Integer proId;

    @Column(name = "pic_uri")
    private String picUri;

    @Column(name = "is_order")
    private String isOrder;

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
     * @return pic_id
     */
    public Integer getPicId() {
        return picId;
    }

    /**
     * @param picId
     */
    public void setPicId(Integer picId) {
        this.picId = picId;
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
     * @return pic_uri
     */
    public String getPicUri() {
        return picUri;
    }

    /**
     * @param picUri
     */
    public void setPicUri(String picUri) {
        this.picUri = picUri;
    }

    /**
     * @return is_order
     */
    public String getIsOrder() {
        return isOrder;
    }

    /**
     * @param isOrder
     */
    public void setIsOrder(String isOrder) {
        this.isOrder = isOrder;
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