package com.mazhichu.message;

/**
 * 类或接口功能描述
 *
 * @author: Moore
 * @date: 2021/9/8 10:02
 * @version: 1.0.0
 */
public class StandardOutMessageRenderer implements MessageRenderer{

	private MessageProvider messageProvider;

	@Override
	public void render() {
		if (null == messageProvider) {
			throw new RuntimeException("You must set the property messageProvider of class:" + StandardOutMessageRenderer.class.getName());
		}
		System.out.println("render ok");
	}

	@Override
	public void setMessageProvider(MessageProvider messageProvider) {
		this.messageProvider = messageProvider;
	}

	@Override
	public MessageProvider getMessageProvider() {
		return this.messageProvider;
	}
}
