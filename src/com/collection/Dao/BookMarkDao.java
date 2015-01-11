package com.collection.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.collection.Bean.BookMark;
import com.collection.Util.DBUtil;

public class BookMarkDao {
	/**
	 * 收藏网址
	 * 
	 * @param website 网址
	 */
	public void addBookMark(String website) {
		// 获得数据库连接
		Connection conn = DBUtil.getConnection();
		String insertSql = "insert into web_site(webNo,userId,website,createDate,updateDate) values (?,?,?,?,?)";
		PreparedStatement sta = null;
		try {
			// 取得最大网址番号
			int maxWebNo = getMaxWebNo();
			// 建立SQL陈述式对象
			sta = conn.prepareStatement(insertSql);
			sta.setInt(1,maxWebNo+1);
			sta.setString(2,"jiangdp");
			sta.setString(3, website);
			sta.setTimestamp(4, new Timestamp(System.currentTimeMillis()));
			sta.setTimestamp(5, new Timestamp(System.currentTimeMillis()));
			sta.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {
				sta.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 获取最大网址番号
	 */
	public int getMaxWebNo(){
		Connection conn = DBUtil.getConnection();
		Statement sta = null;
		int maxWebNo = 0;
		try {
			sta = conn.createStatement();
			String searchSql = "select max(webNo) as webNo from web_site";
			ResultSet result = sta.executeQuery(searchSql);
			if(result.next()){
				 maxWebNo = result.getInt("webNo");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try{
				sta.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return maxWebNo;
	}
	
	public List<BookMark> getBookMarkList(){
		Connection conn = DBUtil.getConnection();
		Statement sta = null;
		List<BookMark> bookMarkList = new ArrayList<BookMark>();
		try {
			sta = conn.createStatement();
			String searchSql = "select webNo,website from web_site";
			ResultSet result = sta.executeQuery(searchSql);
			while(result.next()){
				BookMark bookMark = new BookMark();
				bookMark.setWebNo(result.getInt("webNo"));
				bookMark.setWebsite(result.getString("website"));
				bookMarkList.add(bookMark);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try{
				sta.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return bookMarkList;
	
	} 
}
