package com.wsl.working1227;

import com.wsl.working1227.controller.DengLucontroller;
import com.wsl.working1227.entity.ZhangHao;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
//@ComponentScan("com.wsl.working1227.dao")
@MapperScan("com.wsl.working1227.dao")
public class Working1227Application {

    @Autowired
    public static void main(String[] args) {
        SpringApplication.run(Working1227Application.class, args);


    }

}
