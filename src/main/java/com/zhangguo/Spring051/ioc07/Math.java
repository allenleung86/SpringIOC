package com.zhangguo.Spring051.ioc07;

import org.springframework.stereotype.Service;

/**
 * 被代理的目标对象
 *真实主题
 */
@Service("math")
public class Math{
	//加
	public int add(int n1,int n2){
		int result=n1+n2;
		System.out.println(n1+"+"+n2+"="+result);
		return result;
	}
	
	//减
	public int sub(int n1,int n2){
		int result=n1-n2;
		System.out.println(n1+"-"+n2+"="+result);
		return result;
	}
	
	//乘
	public int mut(int n1,int n2){
		int result=n1*n2;
		System.out.println(n1+"X"+n2+"="+result);
		return result;
	}
	
	//除
	public int div(int n1,int n2){
		int result=n1/n2;
		System.out.println(n1+"/"+n2+"="+result);
		return result;
	}
}
