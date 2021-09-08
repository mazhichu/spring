package com.mazhichu.message;

/**
 * 类或接口功能描述
 *
 * @author: Moore
 * @date: 2021/9/8 10:00
 * @version: 1.0.0
 */
public interface MessageRenderer {
	void render();
	void setMessageProvider(MessageProvider messageProvider);
	MessageProvider getMessageProvider();
}
