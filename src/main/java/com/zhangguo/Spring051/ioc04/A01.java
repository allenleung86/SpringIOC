package com.zhangguo.Spring051.ioc04;

import org.springframework.stereotype.Service;

@Service
public class A01 {
	public A01() {
		System.out.println("A01");
	}
	public String msg="a";
}