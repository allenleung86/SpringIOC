package com.zhangguo.Spring051.ioc02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02 {
	@org.junit.Test
	public void testStoreBook()
	{
		//容器
		ApplicationContext ctx=new ClassPathXmlApplicationContext("IOCBeans02.xml");
		BookService bookservice=ctx.getBean(BookService.class);
		bookservice.storeBook("《Spring MVC权威指南 第二版》");
	}
}
