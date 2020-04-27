package com.capg.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capg.springcore.bean.MessageBean;

public class App {
	public static void main(String[] args) {
		 ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		 MessageBean msgBean=context.getBean(MessageBean.class);
		 msgBean.print();
		
	}
   
}
