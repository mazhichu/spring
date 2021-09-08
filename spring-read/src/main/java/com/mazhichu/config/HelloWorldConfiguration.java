package com.mazhichu.config;

import com.mazhichu.message.HelloWorldMessageProvider;
import com.mazhichu.message.MessageProvider;
import com.mazhichu.message.MessageRenderer;
import com.mazhichu.message.StandardOutMessageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 类或接口功能描述
 *
 * @author: Moore
 * @date: 2021/9/8 10:31
 * @version: 1.0.0
 */
@Configuration
@ComponentScan("com.mazhichu")
public class HelloWorldConfiguration {

	@Bean
	public MessageProvider provider(){
		return new HelloWorldMessageProvider();
	}

	@Bean
	public MessageRenderer renderer(){
		MessageRenderer renderer = new StandardOutMessageRenderer();
		renderer.setMessageProvider(provider());
		return renderer;
	}
}
