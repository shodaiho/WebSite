package com.collection.Action;


import java.util.List;

import com.collection.Bean.BookMark;
import com.collection.IService.IBookMarkService;
import com.collection.Service.BookMarkService;
import com.opensymphony.xwork2.ActionSupport;

public class AddBookMarkAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private String website;
	private Integer webNo;
	private List<BookMark> bookMarkList;
	
	/**
	 * 画面初期化处理
	 */
	public String init(){
		IBookMarkService bookMarkService = new BookMarkService(); 
		this.setBookMarkList(bookMarkService.init());
		return SUCCESS;
	}

	/**
	 * 追加网址处理
	 */
	public String addWebsite(){
		IBookMarkService bookMarkService = new BookMarkService(); 
		this.setWebNo(bookMarkService.addBookMark(website));
		return "success_json";
	}

	public String getWebsite() {
		return website;
	}

	public Integer getWebNo() {
		return webNo;
	}

	public void setWebNo(Integer webNo) {
		this.webNo = webNo;
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
