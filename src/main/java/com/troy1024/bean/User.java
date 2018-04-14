package com.troy1024.bean;

/**
 * @since 2017-07-15
 * @author queen 
 * 定义一个Java类
 *
 */
public class User {
    // ID，唯一性
	private String id;
	// 登录ID
	private String loginId;
	// 用户名
	private String userName;
	// 角色
	private String role;
	// 备注
	private String note;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", loginId=" + loginId + ", userName="
				+ userName + ", role=" + role + ", note=" + note + "]";
	}

}