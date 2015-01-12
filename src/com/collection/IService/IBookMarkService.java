package com.collection.IService;

import java.util.List;

import com.collection.Bean.BookMark;

public interface IBookMarkService {
	
	// 画面初期化
	public List<BookMark> init();
	
	// 网址追加
	public Integer addBookMark(String website);
	
}
