package com.spring.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_prod_type")
public class MenuDo {
    @Id
    @Column(name = "type_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer typeId;

    @Column(name = "type_name")
    private String typeName;

    @Column(name = "type_p_id")
    private Integer typePId;

    @Column(name = "menu_uri")
    private String menuUri;

    @Column(name = "menu_style")
    private String menuStyle;

    @Column(name = "is_menu")
    private String isMenu;

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
     * @return type_id
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * @param typeId
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**
     * @return type_name
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * @param typeName
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * @return type_p_id
     */
    public Integer getTypePId() {
        return typePId;
    }

    /**
     * @param typePId
     */
    public void setTypePId(Integer typePId) {
        this.typePId = typePId;
    }

    /**
     * @return menu_uri
     */
    public String getMenuUri() {
        return menuUri;
    }

    /**
     * @param menuUri
     */
    public void setMenuUri(String menuUri) {
        this.menuUri = menuUri;
    }

    /**
     * @return menu_style
     */
    public String getMenuStyle() {
        return menuStyle;
    }

    /**
     * @param menuStyle
     */
    public void setMenuStyle(String menuStyle) {
        this.menuStyle = menuStyle;
    }

    /**
     * @return is_menu
     */
    public String getIsMenu() {
        return isMenu;
    }

    /**
     * @param isMenu
     */
    public void setIsMenu(String isMenu) {
        this.isMenu = isMenu;
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