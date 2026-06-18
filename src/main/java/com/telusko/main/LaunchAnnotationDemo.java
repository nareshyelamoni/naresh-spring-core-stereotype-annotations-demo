package com.telusko.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.telusko.main.service.Password;

public class LaunchAnnotationDemo {
	public static void main(String[] args) {
		ApplicationContext iocContainer = new ClassPathXmlApplicationContext("applicationconfig.xml");
		Password p=iocContainer.getBean(Password.class);
		p.passwordAlgo();
	}

}
