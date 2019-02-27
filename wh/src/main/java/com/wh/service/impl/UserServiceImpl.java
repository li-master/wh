package com.wh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wh.entity.User;
import com.wh.repository.UserRepository;
import com.wh.service.UserService;

/** 
* @author 作者 : 一天不喝大力 浑身难受 
* @version 创建时间：2019年2月23日 下午3:38:35 
*
* 类说明 
* ps:
*/
@Service
public class UserServiceImpl implements UserService {
	
	//dao
	@Autowired
	UserRepository dao;

	@Override
	public List<User> findAll() {
		return dao.findAll();
	}

	@Override
	public User findOne(int u_id) {
		return dao.findOne(u_id);
	}

}
