package com.webgame.web;

import com.webgame.service.ServiceTest;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zeusw on 2017/2/9.
 */
@RestController
@EnableAutoConfiguration
@EnableSwagger2
@ControllerAdvice
public class Example {

    @Autowired
    ServiceTest serviceTest;

    @ApiOperation(value = "测试任务",notes = "")
    @RequestMapping(value = "/")
    public String home(){
        return serviceTest.getString();
    }

    @RequestMapping(value = "/demo")
    public ModelAndView demo(HttpServletRequest httpServletRequest){
        String tt = httpServletRequest.getParameter("test");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("demo");
        modelAndView.addObject("tt",tt);
        return modelAndView;
    }
}
