package com.mazhichu.message;

/**
 * 类或接口功能描述
 *
 * @author: Moore
 * @date: 2021/9/8 09:58
 * @version: 1.0.0
 */
public class HelloWorldMessageProvider implements MessageProvider{
	@Override
	public String getMessage() {
		return "Hello World";
	}
}
