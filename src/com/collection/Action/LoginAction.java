package com.collection.Action;

import com.collection.Bean.UserDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	private UserDTO user;

	public String login() {
		if ("jiangdp".equals(this.getUser().getUserName())
				&& "123456".equals(this.getUser().getPassword())) {
			return SUCCESS;
		}
		this.getUser().setErrorInfo("用户名密码不正，请重新输入！");
		return ERROR;
	}

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	
}
