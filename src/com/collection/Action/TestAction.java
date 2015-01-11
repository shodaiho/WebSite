package com.collection.Action;

import com.collection.Dao.BookMarkDao;

public class TestAction {

	public static void main(String[] args){
		BookMarkDao bookMarkDao = new BookMarkDao();
		bookMarkDao.addBookMark("www.baidu.com");
	}
	
	
}
