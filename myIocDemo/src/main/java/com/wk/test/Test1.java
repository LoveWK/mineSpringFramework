package com.wk.test;

import com.wk.service.IndexService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		IndexService service = (IndexService) context.getBean("service");
		service.query();
	}
}
