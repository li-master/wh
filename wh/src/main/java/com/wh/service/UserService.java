package com.wh.service;

import java.util.List;

import com.wh.entity.User;

/** 
* @author 作者 : 一天不喝大力 浑身难受 
* @version 创建时间：2019年2月23日 下午3:37:27 
*
* 类说明 
* ps:
*/
public interface UserService {
	
	List<User> findAll();
	
	User findOne(int u_id);

}
