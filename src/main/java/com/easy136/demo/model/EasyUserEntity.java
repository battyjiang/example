package com.easy136.demo.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by jiangqingen on 16/5/27.
 */
@Entity
@Table(name = "easy_user", schema = "my_user_sys", catalog = "")
public class EasyUserEntity {
    private long id;
    private String loginName;
    private String loginPassword;
    private String email;
    private Collection<EasyRoleEntity> rolesCreatedByMe;
    private Collection<EasyRoleEntity> rolesModifyByMe;
    private Collection<EasyUserRoleEntity> userRoleRelatations;
    private Collection<EasyUserRoleEntity> userRoleRelationsCreateByMe;
    private Collection<EasyUserRoleEntity> roleUserRelationModifyByMe;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "login_name", nullable = false, length = 50)
    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    @Basic
    @Column(name = "login_password", nullable = false, length = 50)
    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 50)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EasyUserEntity that = (EasyUserEntity) o;

        if (id != that.id) return false;
        if (loginName != null ? !loginName.equals(that.loginName) : that.loginName != null) return false;
        if (loginPassword != null ? !loginPassword.equals(that.loginPassword) : that.loginPassword != null)
            return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (loginName != null ? loginName.hashCode() : 0);
        result = 31 * result + (loginPassword != null ? loginPassword.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "creater")
    public Collection<EasyRoleEntity> getRolesCreatedByMe() {
        return rolesCreatedByMe;
    }

    public void setRolesCreatedByMe(Collection<EasyRoleEntity> rolesCreatedByMe) {
        this.rolesCreatedByMe = rolesCreatedByMe;
    }

    @OneToMany(mappedBy = "modifier")
    public Collection<EasyRoleEntity> getRolesModifyByMe() {
        return rolesModifyByMe;
    }

    public void setRolesModifyByMe(Collection<EasyRoleEntity> rolesModifyByMe) {
        this.rolesModifyByMe = rolesModifyByMe;
    }

    @OneToMany(mappedBy = "user")
    public Collection<EasyUserRoleEntity> getUserRoleRelatations() {
        return userRoleRelatations;
    }

    public void setUserRoleRelatations(Collection<EasyUserRoleEntity> userRoleRelatations) {
        this.userRoleRelatations = userRoleRelatations;
    }

    @OneToMany(mappedBy = "creater")
    public Collection<EasyUserRoleEntity> getUserRoleRelationsCreateByMe() {
        return userRoleRelationsCreateByMe;
    }

    public void setUserRoleRelationsCreateByMe(Collection<EasyUserRoleEntity> userRoleRelationsCreateByMe) {
        this.userRoleRelationsCreateByMe = userRoleRelationsCreateByMe;
    }

    @OneToMany(mappedBy = "modifier")
    public Collection<EasyUserRoleEntity> getRoleUserRelationModifyByMe() {
        return roleUserRelationModifyByMe;
    }

    public void setRoleUserRelationModifyByMe(Collection<EasyUserRoleEntity> roleUserRelationModifyByMe) {
        this.roleUserRelationModifyByMe = roleUserRelationModifyByMe;
    }
}
