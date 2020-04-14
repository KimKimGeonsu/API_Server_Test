package com.test.API_test.service;

import java.util.List;
import java.util.Map;

import com.test.API_test.model.User;

public interface Rest_Service {
	
	//모든 유저정보
	public List<User> selectUser();
	
	public User selectUserOne(Map<String, Object> param);
	
	public int insertUser(User user);
	
	public int updateUSer(User user);
	
	public int delete_user(Map<String, Object> param);

}
