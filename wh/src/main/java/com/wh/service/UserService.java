package com.wh.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.wh.entity.User;

/**
 * 
 * @author li-master
 *
 */
public interface UserService {
	
	List<User> findAll();
	
	User findOne(int u_id);

	Page<User> findAll(User user);

}
