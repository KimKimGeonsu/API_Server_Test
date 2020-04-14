package com.test.API_test.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.API_test.model.User;

@Repository
public class Rest_DAOImpl implements Rest_DAO{
	
	@Autowired
	SqlSession sql;

	@Override
	public List<User> selectUser() {
		// TODO Auto-generated method stub
		return sql.selectList("user.list");
	}

	@Override
	public User selectUserOne(Map<String, Object> param) {	
		return sql.selectOne("user.one",param);
	}

	@Override
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		return sql.insert("user.in",user);
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return sql.update("user.up",user);
	}

	@Override
	public int delte_user(Map<String, Object> userId) {
		// TODO Auto-generated method stub
		return sql.delete("user.del",userId);
	}
	
	

}
