package com.mazhichu.test;

import com.mazhichu.config.HelloWorldConfiguration;
import com.mazhichu.config.ReadConfig;
import com.mazhichu.message.MessageRenderer;
import com.mazhichu.service.X;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 类或接口功能描述
 *
 * @author: Moore
 * @date: 2021/9/8 10:35
 * @version: 1.0.0
 */
public class HelloWorldAnnotated {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		MessageRenderer renderer = context.getBean(MessageRenderer.class);
		System.out.println(renderer);
		renderer.render();
	}
}
