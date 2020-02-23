package com.lcx.service.impl;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 启动服务提供者
 * @ClassName: BootStart 
 * @Description: TODO
 * @author: LCX
 * @date: 2020年2月23日 下午6:53:44
 */
public class BootStart {
	public static void main(String[] args) throws Exception {
		//加载上下文件
		ClassPathXmlApplicationContext context=
		new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		//加载服务到容器
		context.start();
		
		//加一个阻塞
		System.in.read();
	
	}
}
