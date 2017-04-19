package com.spring.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_prod_comment")
public class ProComDo {
    @Id
    @Column(name = "com_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer comId;

    @Column(name = "pro_id")
    private Integer proId;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "com_title")
    private String comTitle;

    @Column(name = "com_desc")
    private String comDesc;

    @Column(name = "pro_score")
    private Double proScore;

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
     * @return com_id
     */
    public Integer getComId() {
        return comId;
    }

    /**
     * @param comId
     */
    public void setComId(Integer comId) {
        this.comId = comId;
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
     * @return com_title
     */
    public String getComTitle() {
        return comTitle;
    }

    /**
     * @param comTitle
     */
    public void setComTitle(String comTitle) {
        this.comTitle = comTitle;
    }

    /**
     * @return com_desc
     */
    public String getComDesc() {
        return comDesc;
    }

    /**
     * @param comDesc
     */
    public void setComDesc(String comDesc) {
        this.comDesc = comDesc;
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