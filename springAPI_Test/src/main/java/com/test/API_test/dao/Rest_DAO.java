package com.test.API_test.dao;

import java.util.List;
import java.util.Map;

import com.test.API_test.model.User;

public interface Rest_DAO {

	public List<User> selectUser();

	public User selectUserOne(Map<String, Object> param);

	public int insertUser(User user);

	public int updateUser(User user);

	public int delte_user(Map<String, Object> userId);
}
