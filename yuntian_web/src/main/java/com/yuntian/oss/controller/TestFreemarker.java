package com.yuntian.oss.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.yuntian.oss.entity.User;



@Controller
@RequestMapping(value = "/Freemarker")
public class TestFreemarker {
    @RequestMapping(value = "/testFreemarker")
    @ResponseBody
    public ModelAndView testFreemarker(@RequestParam(value = "a", required = false) String a) throws Exception {
        ModelAndView mv = new ModelAndView();

        User user = new User("may", 21);

        List<String> list = new ArrayList<String>();
        list.add("Jack1");
        list.add("Jack2");
        list.add("Jack3");
        Map<String, Object> map1=new HashMap<>();
        map1.put("one", "one1");
        map1.put("two", "two2");
        mv.addAllObjects(map1);
        mv.addObject("list", list);
        mv.addObject("user", user);
        mv.setViewName("may");
        return mv;
    }
}