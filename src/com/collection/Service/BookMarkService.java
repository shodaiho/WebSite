package com.collection.Service;

import java.util.List;

import com.collection.Bean.BookMark;
import com.collection.Dao.BookMarkDao;
import com.collection.IService.IBookMarkService;
import com.collection.Util.StringUtil;

/**
 * 书签处理Service
 * 
 * @version 1.0
 * @author 蒋大鹏
 * 
 */
public class BookMarkService implements IBookMarkService {

	/**
	 * 
	 * 画面初期化
	 * 
	 * @return 书签一览
	 */
	@Override
	public List<BookMark> init() {
		BookMarkDao bookMarkDao = new BookMarkDao();
		List<BookMark> bookMarkList = bookMarkDao.getBookMarkList();
		return bookMarkList;
	}

	/**
	 * 追加网址
	 * 
	 * @param website
	 *            网址
	 * @return 网址番号
	 */
	@Override
	public Integer addBookMark(String website) {
		BookMarkDao bookMarkDao = new BookMarkDao();
		Integer webNo = 0;
		if (StringUtil.isNotEmpty(website)) {
			webNo = bookMarkDao.addBookMark(website);
		}
		return webNo;
	}

}
