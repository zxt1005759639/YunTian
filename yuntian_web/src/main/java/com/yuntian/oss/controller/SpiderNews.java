package com.yuntian.oss.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.client.HttpClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.yuntian.oss.entity.User;

@Controller
@RequestMapping(value = "/Spider")
public class SpiderNews{
    @RequestMapping(value = "/News")
    @ResponseBody
    public ModelAndView TestNews(@RequestParam(value = "a", required = false) String a) throws Exception {
        ModelAndView mv = new ModelAndView();
        
        return mv;
    }
}