package com.easy136.demo.dao;

import com.easy136.demo.model.EasyButtonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jiangqingen on 16/5/27.
 */
@Repository
public interface EasyButtonDao extends JpaRepository<EasyButtonEntity,Long> {


}
