package com.learn.fundamentalSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FundamentalSpringBootApplication {

	public static void main(String[] args) {
		
		ApplicationContext app = SpringApplication.run(FundamentalSpringBootApplication.class, args);
		MessagePrinter printMsg = app.getBean(MessagePrinter.class);
		printMsg.printMsg();
		
	}
}
