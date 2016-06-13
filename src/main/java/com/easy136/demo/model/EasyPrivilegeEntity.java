package com.easy136.demo.model;

import javax.persistence.*;

/**
 * Created by jiangqingen on 16/5/27.
 */
@Entity
@Table(name = "easy_privilege", schema = "my_user_sys", catalog = "")
public class EasyPrivilegeEntity {
    private long id;
    private int privilegeMaster;
    private long privilegeMasterValue;
    private int privilegeAccess;
    private long privilegeAccessValue;
    private int privilegeOperation;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "privilege_master", nullable = false)
    public int getPrivilegeMaster() {
        return privilegeMaster;
    }

    public void setPrivilegeMaster(int privilegeMaster) {
        this.privilegeMaster = privilegeMaster;
    }

    @Basic
    @Column(name = "privilege_master_value", nullable = false)
    public long getPrivilegeMasterValue() {
        return privilegeMasterValue;
    }

    public void setPrivilegeMasterValue(long privilegeMasterValue) {
        this.privilegeMasterValue = privilegeMasterValue;
    }

    @Basic
    @Column(name = "privilege_access", nullable = false)
    public int getPrivilegeAccess() {
        return privilegeAccess;
    }

    public void setPrivilegeAccess(int privilegeAccess) {
        this.privilegeAccess = privilegeAccess;
    }

    @Basic
    @Column(name = "privilege_access_value", nullable = false)
    public long getPrivilegeAccessValue() {
        return privilegeAccessValue;
    }

    public void setPrivilegeAccessValue(long privilegeAccessValue) {
        this.privilegeAccessValue = privilegeAccessValue;
    }

    @Basic
    @Column(name = "privilege_operation", nullable = false)
    public int getPrivilegeOperation() {
        return privilegeOperation;
    }

    public void setPrivilegeOperation(int privilegeOperation) {
        this.privilegeOperation = privilegeOperation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EasyPrivilegeEntity that = (EasyPrivilegeEntity) o;

        if (id != that.id) return false;
        if (privilegeMaster != that.privilegeMaster) return false;
        if (privilegeMasterValue != that.privilegeMasterValue) return false;
        if (privilegeAccess != that.privilegeAccess) return false;
        if (privilegeAccessValue != that.privilegeAccessValue) return false;
        if (privilegeOperation != that.privilegeOperation) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + privilegeMaster;
        result = 31 * result + (int) (privilegeMasterValue ^ (privilegeMasterValue >>> 32));
        result = 31 * result + privilegeAccess;
        result = 31 * result + (int) (privilegeAccessValue ^ (privilegeAccessValue >>> 32));
        result = 31 * result + privilegeOperation;
        return result;
    }
}
