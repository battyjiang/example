package com.easy136.demo.dao;

import com.easy136.demo.base.Base;
import com.easy136.demo.model.EasyUserEntity;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * Created by jiangqingen on 16/5/28.
 */
public class EasyUserDaoTest extends Base {

    @Resource
    EasyUserDao easyUserDao;

    @Test
    public void testSave(){
        EasyUserEntity user = new EasyUserEntity();
        user.setEmail("test@mail.com");
        user.setLoginName("test");
        user.setLoginPassword("1213144213ds12335dfd232");
        Assert.assertNotNull(easyUserDao.save(user));
    }

    @Test
    public void testFindAndUpdate(){
        EasyUserEntity user = easyUserDao.findByLoginName("test");
        user.setLoginName("testByTestUnit");
        user = easyUserDao.save(user);
        Assert.assertEquals(user.getLoginName(),"testByTestUnit");
    }

    @Test
    public void testDelete(){
        EasyUserEntity user = easyUserDao.findByLoginName("testByTestUnit");
        easyUserDao.delete(user);
        Assert.assertNull(easyUserDao.findOne(user.getId()));
    }

}
