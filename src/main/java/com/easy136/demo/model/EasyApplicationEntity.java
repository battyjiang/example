package com.easy136.demo.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by jiangqingen on 16/5/27.
 */
@Entity
@Table(name = "easy_application", schema = "my_user_sys", catalog = "")
public class EasyApplicationEntity {
    private long id;
    private String applicationCode;
    private String applicationName;
    private String applicationDesc;
    private boolean showInMenu;
    private Collection<EasyMenuEntity> menusByApplicationCode;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "application_code", nullable = false, length = 100)
    public String getApplicationCode() {
        return applicationCode;
    }

    public void setApplicationCode(String applicationCode) {
        this.applicationCode = applicationCode;
    }

    @Basic
    @Column(name = "application_name", nullable = false, length = 150)
    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    @Basic
    @Column(name = "application_desc", nullable = false, length = 150)
    public String getApplicationDesc() {
        return applicationDesc;
    }

    public void setApplicationDesc(String applicationDesc) {
        this.applicationDesc = applicationDesc;
    }

    @Basic
    @Column(name = "show_in_menu", nullable = false)
    public boolean isShowInMenu() {
        return showInMenu;
    }

    public void setShowInMenu(boolean showInMenu) {
        this.showInMenu = showInMenu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EasyApplicationEntity that = (EasyApplicationEntity) o;

        if (id != that.id) return false;
        if (showInMenu != that.showInMenu) return false;
        if (applicationCode != null ? !applicationCode.equals(that.applicationCode) : that.applicationCode != null)
            return false;
        if (applicationName != null ? !applicationName.equals(that.applicationName) : that.applicationName != null)
            return false;
        if (applicationDesc != null ? !applicationDesc.equals(that.applicationDesc) : that.applicationDesc != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (applicationCode != null ? applicationCode.hashCode() : 0);
        result = 31 * result + (applicationName != null ? applicationName.hashCode() : 0);
        result = 31 * result + (applicationDesc != null ? applicationDesc.hashCode() : 0);
        result = 31 * result + (showInMenu ? 1 : 0);
        return result;
    }

    @OneToMany(mappedBy = "applicationByApplicationCode")
    public Collection<EasyMenuEntity> getMenusByApplicationCode() {
        return menusByApplicationCode;
    }

    public void setMenusByApplicationCode(Collection<EasyMenuEntity> menusByApplicationCode) {
        this.menusByApplicationCode = menusByApplicationCode;
    }
}
