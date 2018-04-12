package com.learn.fundamentalSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {

	@Autowired
	//@Qualifier("System")
	private Message userMessage;

	public void printMsg() {
		
		System.out.println("hello");
		System.out.println(userMessage.getMsg());
	}

}
