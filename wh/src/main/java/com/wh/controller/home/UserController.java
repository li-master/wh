package com.wh.controller.home;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wh.entity.User;
import com.wh.service.UserService;


/**
 * 用户管理-数据接口
 * @author li-master
 *
 */
@RestController
@RequestMapping("/home/user")
public class UserController {
	
	@Autowired
	UserService user_service;
	
	@RequestMapping("/all")
	public List<User> findAll(){
		return user_service.findAll();
	}
	
	@RequestMapping("/pageAll")
	public Page<User> findAll(User user){
		return user_service.findAll(user);
	}
}
