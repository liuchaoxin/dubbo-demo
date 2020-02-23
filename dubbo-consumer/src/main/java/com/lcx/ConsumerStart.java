package com.lcx;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.lcx.service.SuanService;

public class ConsumerStart {
	
	private static ClassPathXmlApplicationContext context;
	
	public static void main(String[] args) {
		 context=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		 
		SuanService suanService = context.getBean(SuanService.class);
		
		int i = suanService.add(5,8); 
		System.err.println("加法的结果是"+i);
		
		int j = suanService.multiply(5, 8);
		
		System.out.println("乘法的结果是"+j);
	
	}
}
