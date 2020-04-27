package com.capg.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.capg.springcore.bean.MessageBean;
import com.capg.springcore.bean.UserBean;

public class MessageConfig {

	@Bean
	public MessageBean getMessageBean() {
		MessageBean msgBean= new MessageBean();
		msgBean.setId(101);
		return msgBean;
	}

	@Bean
	public UserBean getUserBean() {
		UserBean userBean=new UserBean();
		userBean.setId(102);
		userBean.setName("srinithi");
		return userBean;
	}
	
	@Bean
	@Primary
	public UserBean getUserBean1() {
		UserBean userBean1=new UserBean();
		userBean1.setId(103);
		userBean1.setName("Shiva");
		return userBean1;
	}
	

}
