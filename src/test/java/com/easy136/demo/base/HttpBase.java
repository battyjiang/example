package com.easy136.demo.base;

import com.google.common.collect.Maps;
import org.apache.commons.lang3.StringUtils;
import static org.springframework.test.util.AssertionErrors.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.support.ResourcePropertySource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

/**
 * Created by jiangqingen on 16/5/28.
 */
@Ignore
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:/spring/*.xml"})
public class HttpBase extends AbstractJUnit4SpringContextTests {

    private static final Logger LOG = LoggerFactory.getLogger(HttpBase.class);

    public ResourcePropertySource source;

    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;


    @Before
    public void init(){
        this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
        try {
            source = new ResourcePropertySource("resource","classpath:httpbase.properties");
        }catch (IOException e){
            LOG.error("test class : base error when load properties ..."+e.getMessage());
        }
    }

    public ResultActions doPost(String uri, Map<String,String> params, HttpStatus status, HttpHeaders headers) throws Exception {
        try{
            MockHttpServletRequestBuilder builder = addParam(MockMvcRequestBuilders.post(uri),params).accept(MediaType.APPLICATION_JSON);
            if(null!=headers){
                builder.headers(headers);
            }
            ResultActions actions = this.mockMvc.perform(builder);
            actions.andDo(print());
            actions.andExpect(matcher(status));
            return actions;
        }catch (Exception e){
            LOG.error("test class : http base error when do post ..."+e.getMessage());
            throw e;
        }
    }

    public ResultActions doGet(String uri,Map<String,String> params,HttpStatus status,HttpHeaders headers) throws Exception {
        try{
            MockHttpServletRequestBuilder builder = addParam(MockMvcRequestBuilders.get(uri),params).accept(MediaType.APPLICATION_JSON);
            if(null!=headers){
                builder.headers(headers);
            }
            ResultActions actions = this.mockMvc.perform(builder);
            actions.andDo(print());
            actions.andExpect(matcher(status));
            return actions;
        }catch (Exception e){
            LOG.error("test class : http base error when do get ..."+e.getMessage());
            throw e;
        }

    }

    private MockHttpServletRequestBuilder addParam(MockHttpServletRequestBuilder builder,Map<String,String> params){
        if(null!=params && params.size()>0){
            Set<Map.Entry<String,String>> entrySet = params.entrySet();
            for(Map.Entry<String,String> entry:entrySet){
                builder.param(entry.getKey(),entry.getValue());
            }
        }
        return builder;
    }

    private ResultMatcher matcher(final HttpStatus status){
        return new ResultMatcher() {
            @Override
            public void match(MvcResult mvcResult) throws Exception {
                assertEquals("Status",status.value(), mvcResult.getResponse().getStatus());
            }
        };
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
