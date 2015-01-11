package com.collection.Util;

import java.util.Date;

public class DateUtil {
	
	private static final String formatYMD = "YYYY-MM-DD HH:mm:SS";
	
	
	public static Date getSysDate(){
		return new Date();
	}
	
	public static java.sql.Date getDbSysDate(){
		return new java.sql.Date(getSysDate().getTime());
	}
}
