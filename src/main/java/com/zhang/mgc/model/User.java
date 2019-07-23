package com.zhang.mgc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long userId;// ID自增长主键

    @Column
    private String userName;// 用户名,不为空，不能重复
    
    @Column
    private String password;// 密码,不为空
    
    @Column
    private String permission;// 性别,不为空
    
    public User() {
        
    }
    
    public User(String userName, String password, String permission) {
        this.userName = userName;
        this.password = password;
        this.permission= permission;
    }

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", permission="
				+ permission + "]";
	}
    
    
    
}