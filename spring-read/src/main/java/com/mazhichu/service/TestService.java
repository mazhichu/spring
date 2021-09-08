package com.mazhichu.service;

import com.mazhichu.config.ReadConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description: TODO
 * @Author: Moore
 * @Date: 2021/5/17 12:28
 * @Version: 1.0.0
 */
public class TestService {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ReadConfig.class);
        X x = context.getBean(X.class);
        System.out.println(x);
    }
}
