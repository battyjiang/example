package com.easy136.demo.dao;

import com.easy136.demo.model.EasyMenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jiangqingen on 16/5/27.
 */
@Repository
public interface EasyMenuDao extends JpaRepository<EasyMenuEntity,Long> {
}
