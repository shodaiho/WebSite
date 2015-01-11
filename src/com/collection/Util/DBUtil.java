package com.collection.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	// 驱动程序名
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	// URL指向要访问的数据库名
	private static final String URL = "jdbc:mysql://localhost/website";
	// MySQL配置时的用户名
	private static final String USER = "root";
	// Java连接MySQL配置时的密码
	private static final String PASSWORD = "1234";
	// 数据库连接
	private static Connection conn = null;

	private DBUtil(){}
	
	static {
		try {
			// 加载驱动程序
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 连接数据库
	 * @return 数据库连接
	 */
	public static Connection getConnection() {
		// 连续数据库
		try {
			if (conn == null) {
				synchronized (DBUtil.class) {
					if (conn == null) {
						conn = DriverManager.getConnection(URL, USER, PASSWORD);
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
