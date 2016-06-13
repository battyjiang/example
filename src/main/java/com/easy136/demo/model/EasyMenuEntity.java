package com.easy136.demo.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by jiangqingen on 16/5/27.
 */
@Entity
@Table(name = "easy_menu", schema = "my_user_sys", catalog = "")
public class EasyMenuEntity {
    private long id;
    private int menuNo;
    private int menuParentNo;
    private int menuOrder;
    private String menuName;
    private String menuUrl;
    private String menuIcon;
    private boolean isVisiable;
    private boolean isLeaf;
    private Collection<EasyButtonEntity> buttonsByMenuNo;
    private EasyApplicationEntity applicationByApplicationCode;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "menu_no", nullable = false)
    public int getMenuNo() {
        return menuNo;
    }

    public void setMenuNo(int menuNo) {
        this.menuNo = menuNo;
    }

    @Basic
    @Column(name = "menu_parent_no", nullable = false)
    public int getMenuParentNo() {
        return menuParentNo;
    }

    public void setMenuParentNo(int menuParentNo) {
        this.menuParentNo = menuParentNo;
    }

    @Basic
    @Column(name = "menu_order", nullable = false)
    public int getMenuOrder() {
        return menuOrder;
    }

    public void setMenuOrder(int menuOrder) {
        this.menuOrder = menuOrder;
    }

    @Basic
    @Column(name = "menu_name", nullable = false, length = 100)
    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    @Basic
    @Column(name = "menu_url", nullable = false, length = 150)
    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    @Basic
    @Column(name = "menu_icon", nullable = false, length = 150)
    public String getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon;
    }

    @Basic
    @Column(name = "is_visiable", nullable = false)
    public boolean isVisiable() {
        return isVisiable;
    }

    public void setVisiable(boolean visiable) {
        isVisiable = visiable;
    }

    @Basic
    @Column(name = "is_leaf", nullable = false)
    public boolean isLeaf() {
        return isLeaf;
    }

    public void setLeaf(boolean leaf) {
        isLeaf = leaf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EasyMenuEntity that = (EasyMenuEntity) o;

        if (id != that.id) return false;
        if (menuNo != that.menuNo) return false;
        if (menuParentNo != that.menuParentNo) return false;
        if (menuOrder != that.menuOrder) return false;
        if (isVisiable != that.isVisiable) return false;
        if (isLeaf != that.isLeaf) return false;
        if (menuName != null ? !menuName.equals(that.menuName) : that.menuName != null) return false;
        if (menuUrl != null ? !menuUrl.equals(that.menuUrl) : that.menuUrl != null) return false;
        if (menuIcon != null ? !menuIcon.equals(that.menuIcon) : that.menuIcon != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + menuNo;
        result = 31 * result + menuParentNo;
        result = 31 * result + menuOrder;
        result = 31 * result + (menuName != null ? menuName.hashCode() : 0);
        result = 31 * result + (menuUrl != null ? menuUrl.hashCode() : 0);
        result = 31 * result + (menuIcon != null ? menuIcon.hashCode() : 0);
        result = 31 * result + (isVisiable ? 1 : 0);
        result = 31 * result + (isLeaf ? 1 : 0);
        return result;
    }

    @OneToMany(mappedBy = "menuByMenuNo")
    public Collection<EasyButtonEntity> getButtonsByMenuNo() {
        return buttonsByMenuNo;
    }

    public void setButtonsByMenuNo(Collection<EasyButtonEntity> buttonsByMenuNo) {
        this.buttonsByMenuNo = buttonsByMenuNo;
    }

    @ManyToOne
    @JoinColumn(name = "application_code", referencedColumnName = "application_code", nullable = false)
    public EasyApplicationEntity getApplicationByApplicationCode() {
        return applicationByApplicationCode;
    }

    public void setApplicationByApplicationCode(EasyApplicationEntity applicationByApplicationCode) {
        this.applicationByApplicationCode = applicationByApplicationCode;
    }
}
