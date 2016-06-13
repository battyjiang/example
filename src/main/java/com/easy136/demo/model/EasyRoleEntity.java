package com.easy136.demo.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

/**
 * Created by jiangqingen on 16/5/27.
 */
@Entity
@Table(name = "easy_role", schema = "my_user_sys", catalog = "")
public class EasyRoleEntity {
    private long id;
    private String roleName;
    private String roleDesc;
    private Date createDate;
    private Date modifyDate;
    private EasyUserEntity creater;
    private EasyUserEntity modifier;
    private Collection<EasyUserRoleEntity> roleUserRelatations;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "role_name", nullable = false, length = 50)
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Basic
    @Column(name = "role_desc", nullable = false, length = 50)
    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    @Basic
    @Column(name = "create_date", nullable = false)
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "modify_date", nullable = false)
    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EasyRoleEntity that = (EasyRoleEntity) o;

        if (id != that.id) return false;
        if (roleName != null ? !roleName.equals(that.roleName) : that.roleName != null) return false;
        if (roleDesc != null ? !roleDesc.equals(that.roleDesc) : that.roleDesc != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (modifyDate != null ? !modifyDate.equals(that.modifyDate) : that.modifyDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (roleName != null ? roleName.hashCode() : 0);
        result = 31 * result + (roleDesc != null ? roleDesc.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (modifyDate != null ? modifyDate.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "create_user_id", referencedColumnName = "id", nullable = false)
    public EasyUserEntity getCreater() {
        return creater;
    }

    public void setCreater(EasyUserEntity creater) {
        this.creater = creater;
    }

    @ManyToOne
    @JoinColumn(name = "modify_user_id", referencedColumnName = "id", nullable = false)
    public EasyUserEntity getModifier() {
        return modifier;
    }

    public void setModifier(EasyUserEntity modifier) {
        this.modifier = modifier;
    }

    @OneToMany(mappedBy = "role")
    public Collection<EasyUserRoleEntity> getRoleUserRelatations() {
        return roleUserRelatations;
    }

    public void setRoleUserRelatations(Collection<EasyUserRoleEntity> roleUserRelatations) {
        this.roleUserRelatations = roleUserRelatations;
    }
}
