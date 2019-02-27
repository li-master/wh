package com.wh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wh.service.UserService;

/** 
* @author 作者 : 一天不喝大力 浑身难受 
* @version 创建时间：2019年2月23日 下午3:01:53 
*
* 类说明 
* ps:
*/
@Controller
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	UserService user_service;
	

	@RequestMapping("/index")
	@ResponseBody
	public List test() {
		return user_service.findAll();
	}
	
	
}
