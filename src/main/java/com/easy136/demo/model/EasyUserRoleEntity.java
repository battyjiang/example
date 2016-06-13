package com.easy136.demo.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by jiangqingen on 16/5/27.
 */
@Entity
@Table(name = "easy_user_role", schema = "my_user_sys", catalog = "")
public class EasyUserRoleEntity {
    private long id;
    private Date createDate;
    private Date modifyDate;
    private EasyRoleEntity role;
    private EasyUserEntity user;
    private EasyUserEntity creater;
    private EasyUserEntity modifier;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

        EasyUserRoleEntity that = (EasyUserRoleEntity) o;

        if (id != that.id) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (modifyDate != null ? !modifyDate.equals(that.modifyDate) : that.modifyDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (modifyDate != null ? modifyDate.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "role_id", referencedColumnName = "id", nullable = false)
    public EasyRoleEntity getRole() {
        return role;
    }

    public void setRole(EasyRoleEntity role) {
        this.role = role;
    }

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    public EasyUserEntity getUser() {
        return user;
    }

    public void setUser(EasyUserEntity user) {
        this.user = user;
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
}
