package com.test.Action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	private String userName;
	private String password;
	private String errorInfo;
	
	public String login() {
		if ("jiangdp".equals(this.getUserName())
				&& "123456".equals(this.getPassword())) {
			return SUCCESS;
		}
		this.setErrorInfo("用户名密码不正，请重新输入！");
		return ERROR;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getErrorInfo() {
		return errorInfo;
	}

	public void setErrorInfo(String errorInfo) {
		this.errorInfo = errorInfo;
	}
	
	

}
