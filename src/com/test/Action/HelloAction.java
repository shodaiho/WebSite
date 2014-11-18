package com.test.Action;

public class HelloAction {
	private String userName;
	private String password;
	
	/**
	 * Struts 启动excute方法
	 * @return
	 * @throws Exception
	 */
	public String execute() throws Exception{
		this.setUserName("jiangdp");
		return "success";
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

}
