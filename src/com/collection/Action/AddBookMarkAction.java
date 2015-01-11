package com.collection.Action;


import java.util.List;

import com.collection.Bean.BookMark;
import com.collection.Dao.BookMarkDao;
import com.collection.Util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;

public class AddBookMarkAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private String website;
	private List<BookMark> bookMarkList;
	
	public String init(){
		BookMarkDao bookMarkDao = new BookMarkDao();
		bookMarkList = bookMarkDao.getBookMarkList();
		website = "122";
		return SUCCESS;
	}
	
	public String addWebsite(){
		BookMarkDao bookMarkDao = new BookMarkDao();
		if(StringUtil.isNotEmpty(website)){
			bookMarkDao.addBookMark(website);
		}
		bookMarkList = bookMarkDao.getBookMarkList();
		return SUCCESS;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public List<BookMark> getBookMarkList() {
		return bookMarkList;
	}

	public void setBookMarkList(List<BookMark> bookMarkList) {
		this.bookMarkList = bookMarkList;
	}

}
