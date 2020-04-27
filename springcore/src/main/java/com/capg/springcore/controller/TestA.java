package com.capg.springcore.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capg.springcore.bean.MessageBean;
import com.capg.springcore.config.MessageConfig;

public class TestA {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MessageConfig.class);
		MessageBean messageBean=context.getBean(MessageBean.class);
		messageBean.print();
	}

}
