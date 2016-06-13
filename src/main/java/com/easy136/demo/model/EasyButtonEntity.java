package com.easy136.demo.model;

import javax.persistence.*;

/**
 * Created by jiangqingen on 16/5/27.
 */
@Entity
@Table(name = "easy_button", schema = "my_user_sys", catalog = "")
public class EasyButtonEntity {
    private long id;
    private int buttonNo;
    private int buttonOrder;
    private String buttonName;
    private String buttonClass;
    private String buttonIcon;
    private String buttonScript;
    private int initStatus;
    private EasyMenuEntity menuByMenuNo;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "button_no", nullable = false)
    public int getButtonNo() {
        return buttonNo;
    }

    public void setButtonNo(int buttonNo) {
        this.buttonNo = buttonNo;
    }

    @Basic
    @Column(name = "button_order", nullable = false)
    public int getButtonOrder() {
        return buttonOrder;
    }

    public void setButtonOrder(int buttonOrder) {
        this.buttonOrder = buttonOrder;
    }

    @Basic
    @Column(name = "button_name", nullable = false, length = 100)
    public String getButtonName() {
        return buttonName;
    }

    public void setButtonName(String buttonName) {
        this.buttonName = buttonName;
    }

    @Basic
    @Column(name = "button_class", nullable = false, length = 150)
    public String getButtonClass() {
        return buttonClass;
    }

    public void setButtonClass(String buttonClass) {
        this.buttonClass = buttonClass;
    }

    @Basic
    @Column(name = "button_icon", nullable = false, length = 150)
    public String getButtonIcon() {
        return buttonIcon;
    }

    public void setButtonIcon(String buttonIcon) {
        this.buttonIcon = buttonIcon;
    }

    @Basic
    @Column(name = "button_script", nullable = false, length = 150)
    public String getButtonScript() {
        return buttonScript;
    }

    public void setButtonScript(String buttonScript) {
        this.buttonScript = buttonScript;
    }

    @Basic
    @Column(name = "init_status", nullable = false)
    public int getInitStatus() {
        return initStatus;
    }

    public void setInitStatus(int initStatus) {
        this.initStatus = initStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EasyButtonEntity that = (EasyButtonEntity) o;

        if (id != that.id) return false;
        if (buttonNo != that.buttonNo) return false;
        if (buttonOrder != that.buttonOrder) return false;
        if (initStatus != that.initStatus) return false;
        if (buttonName != null ? !buttonName.equals(that.buttonName) : that.buttonName != null) return false;
        if (buttonClass != null ? !buttonClass.equals(that.buttonClass) : that.buttonClass != null) return false;
        if (buttonIcon != null ? !buttonIcon.equals(that.buttonIcon) : that.buttonIcon != null) return false;
        if (buttonScript != null ? !buttonScript.equals(that.buttonScript) : that.buttonScript != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + buttonNo;
        result = 31 * result + buttonOrder;
        result = 31 * result + (buttonName != null ? buttonName.hashCode() : 0);
        result = 31 * result + (buttonClass != null ? buttonClass.hashCode() : 0);
        result = 31 * result + (buttonIcon != null ? buttonIcon.hashCode() : 0);
        result = 31 * result + (buttonScript != null ? buttonScript.hashCode() : 0);
        result = 31 * result + initStatus;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "menu_no", referencedColumnName = "menu_no", nullable = false)
    public EasyMenuEntity getMenuByMenuNo() {
        return menuByMenuNo;
    }

    public void setMenuByMenuNo(EasyMenuEntity menuByMenuNo) {
        this.menuByMenuNo = menuByMenuNo;
    }
}
