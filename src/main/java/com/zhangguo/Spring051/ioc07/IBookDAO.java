package com.zhangguo.Spring051.ioc07;

/**
 * 图书数据访问接口
 */
public interface IBookDAO {
	/**
	 * 添加图书
	 */
	public String addBook(String bookname);
}
