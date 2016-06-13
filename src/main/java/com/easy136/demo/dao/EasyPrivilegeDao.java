package com.easy136.demo.dao;

import com.easy136.demo.model.EasyPrivilegeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jiangqingen on 16/5/27.
 */
@Repository
public interface EasyPrivilegeDao extends JpaRepository<EasyPrivilegeEntity,Long> {

}
