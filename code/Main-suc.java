package com.zjl.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    private final Logger LOG = LoggerFactory.getLogger(this.getClass());
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
        LOG.info("invoke----------/hello/index");
        return "index";
    }
}
