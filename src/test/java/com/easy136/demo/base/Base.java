package com.easy136.demo.base;

import com.google.common.collect.Maps;
import org.apache.commons.lang3.StringUtils;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.support.ResourcePropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.util.Map;

/**
 * Created by jiangqingen on 16/5/28.
 */

@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/applicationContext*.xml"})
public class Base extends AbstractJUnit4SpringContextTests {

    private static final Logger LOG = LoggerFactory.getLogger(Base.class);

    public ResourcePropertySource source;
    @Before
    public void init(){
        try {
            source = new ResourcePropertySource("resource","classpath:base.properties");
        }catch (IOException e){
            LOG.error("test class : base error when load properties ...");
        }
    }

    public Map<String,String> getParam(String method){
        String field = ""+source.getProperty(method);
        Map<String,String> params = Maps.newHashMap();
        if(StringUtils.isNotEmpty(field)){
            String[] fields = field.split(",");
            for (String key:fields) {
                params.put(key,""+source.getProperty(method+"."+key));
            }
        }
        return params;
    }


}
