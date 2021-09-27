package com.covid.model;

import com.covid.user.UserDetail;

public class UserModel {
	Long userId;
	UserDetail userDetail;
	
	
	public UserModel(Long userId, UserDetail userDetail) {
		super();
		this.userId = userId;
		this.userDetail = userDetail;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public UserDetail getUserDetail() {
		return userDetail;
	}
	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}
	
}
