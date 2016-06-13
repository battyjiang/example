package com.easy136.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by jiangqingen on 16/5/17.
 */

@Controller
public class MainController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(){
        return "login";
    }

    @RequestMapping(value = "/login")
    public ModelAndView login() {
        ModelAndView result = new ModelAndView();
        result.setViewName("login");
        result.addObject("msg","login success");
        return result;
    }

    @RequestMapping(value="/reg")
    public ModelAndView reg(){
        ModelAndView result = new ModelAndView();
        result.setViewName("reg");
        result.addObject("msg","");
        return result;
    }

}
