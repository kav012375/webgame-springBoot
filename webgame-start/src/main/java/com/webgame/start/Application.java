package com.webgame.start;

import com.webgame.dal.User.dao.UserDAO;
import com.webgame.service.ServiceTest;
import com.webgame.web.Example;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * Created by zeusw on 2017/2/9.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.webgame.service","com.webgame.dal","com.webgame.web"})
@MapperScan(basePackages = {"com.webgame.dal"})
public class Application {
    public static void main(String[] args) throws Exception {
        //传递的类类型将告诉启动器谁是主要的spring组件
        //也就是请求的入口
        //参数第一个必须使用object数组，并且参数一定要包含父类：Application.class,否则会出现无法autoconfig的情况
        //设置需要初始化加载的类
        SpringApplication application = new SpringApplication(Application.class);
        application.run(args);
    }
}
