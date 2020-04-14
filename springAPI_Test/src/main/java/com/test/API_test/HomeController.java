package com.test.API_test;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.API_test.constants.URIConstants;
import com.test.API_test.model.User;
import com.test.API_test.service.Rest_Service;

@Controller
public class HomeController {
	
	@Autowired
	private Rest_Service service;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
		
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	/*
	 * 모든유저
	 * 
	 */	
	@RequestMapping(value = URIConstants.GET_ALL_USER,method = RequestMethod.GET)
	public @ResponseBody List<User> get_all_user(){
		logger.info("#########get All");		
		List<User> user = service.selectUser();
	
		return user;
	}
	
	/*
	 * 특정유저
	 */
	@RequestMapping(value = URIConstants.GET_USER, method = RequestMethod.GET)
	public @ResponseBody User get_user(@PathVariable("id") String userId) {		
		logger.info("###########selectOne");
		
		Map<String, Object>  param = new HashMap<String, Object>();
		param.put("id", userId);
		User user = service.selectUserOne(param);
		return user;
	}
	
	/*
	 * 유저등록
	 * 
	 */
	@ResponseBody
	@RequestMapping(value = URIConstants.CREATE_USER, method = RequestMethod.POST)
	public int create_user(User user) {
		logger.info("##########유저생성");
		logger.info("###########"+user.getUser_id());
		logger.info("###########"+user.getRe());
		logger.info("###########"+user.getUser_mail());
		logger.info("###########"+user.getUser_Nm());
		
		int result = service.insertUser(user);
		
		return result;
	}
	
	
	/*
	 * 유저정보 변경
	 */
	@ResponseBody
	@RequestMapping(value = URIConstants.UPDATE_USER, method = RequestMethod.POST)
	public  int update_user(User user) {
		logger.info("##########유저업데이트");
		logger.info("###########"+user.getUser_id());
		logger.info("###########"+user.getRe());
		logger.info("###########"+user.getUser_mail());
		logger.info("###########"+user.getUser_Nm());
		int result = service.updateUSer(user);
		return result;
	}
	
	/*
	 * 특정 유저정보삭제
	 */
	@RequestMapping(value = URIConstants.DELTE_USER, method = RequestMethod.GET)
	public @ResponseBody int delete_user(@PathVariable("id") String userId) {		
		logger.info("유저삭제");
		Map<String, Object> param =new  HashMap<String,Object>();
		param.put("id", userId);
		int result = service.delete_user(param);
		return result;
		
	}
	
	
	
}
