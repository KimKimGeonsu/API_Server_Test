package com.test.API_test.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.API_test.dao.Rest_DAO;
import com.test.API_test.model.User;

@Service
public class Rest_ServiceImpl implements Rest_Service{
	
	
	@Autowired
	Rest_DAO dao;

	@Override
	public List<User> selectUser() {
		// TODO Auto-generated method stub
		return dao.selectUser();
	}

	@Override
	public User selectUserOne(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return dao.selectUserOne(param);
	}

	@Override
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		return dao.insertUser(user);
	}

	@Override
	public int updateUSer(User user) {
		// TODO Auto-generated method stub
		return dao.updateUser(user);
	}

	@Override
	public int delete_user(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return dao.delte_user(param);
	}
	
	
	

}
