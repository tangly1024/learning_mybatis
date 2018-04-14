package com.troy1024.bean;

/**
 * @since 2017-07-15
 * @author queen 
 * 定义一个Java类
 *
 */
public class User {
    // ID，唯一性
	private int id;
	// 用户名
	private String userName;

	//备注
	private String note;

    public User() {
    }

    public User(String userName, String note) {
        this.userName = userName;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}