package com.spring.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_prod_detail")
public class ProDetDo {
    @Id
    @Column(name = "det_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer detId;

    @Column(name = "prod_id")
    private Integer prodId;

    @Column(name = "det_length")
    private String detLength;

    @Column(name = "det_height")
    private String detHeight;

    @Column(name = "det_width")
    private String detWidth;

    @Column(name = "det_mate")
    private String detMate;

    @Column(name = "det_addr")
    private String detAddr;

    @Column(name = "det_date")
    private Date detDate;

    @Column(name = "det_desc")
    private String detDesc;

    private Integer state;

    @Column(name = "create_by")
    private String createBy;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "update_by")
    private String updateBy;

    @Column(name = "update_date")
    private Date updateDate;

    /**
     * @return det_id
     */
    public Integer getDetId() {
        return detId;
    }

    /**
     * @param detId
     */
    public void setDetId(Integer detId) {
        this.detId = detId;
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
     * @return det_length
     */
    public String getDetLength() {
        return detLength;
    }

    /**
     * @param detLength
     */
    public void setDetLength(String detLength) {
        this.detLength = detLength;
    }

    /**
     * @return det_height
     */
    public String getDetHeight() {
        return detHeight;
    }

    /**
     * @param detHeight
     */
    public void setDetHeight(String detHeight) {
        this.detHeight = detHeight;
    }

    /**
     * @return det_width
     */
    public String getDetWidth() {
        return detWidth;
    }

    /**
     * @param detWidth
     */
    public void setDetWidth(String detWidth) {
        this.detWidth = detWidth;
    }

    /**
     * @return det_mate
     */
    public String getDetMate() {
        return detMate;
    }

    /**
     * @param detMate
     */
    public void setDetMate(String detMate) {
        this.detMate = detMate;
    }

    /**
     * @return det_addr
     */
    public String getDetAddr() {
        return detAddr;
    }

    /**
     * @param detAddr
     */
    public void setDetAddr(String detAddr) {
        this.detAddr = detAddr;
    }

    /**
     * @return det_date
     */
    public Date getDetDate() {
        return detDate;
    }

    /**
     * @param detDate
     */
    public void setDetDate(Date detDate) {
        this.detDate = detDate;
    }

    /**
     * @return det_desc
     */
    public String getDetDesc() {
        return detDesc;
    }

    /**
     * @param detDesc
     */
    public void setDetDesc(String detDesc) {
        this.detDesc = detDesc;
    }

    /**
     * @return state
     */
    public Integer getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(Integer state) {
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