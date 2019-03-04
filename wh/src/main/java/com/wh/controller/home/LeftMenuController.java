package com.wh.controller.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 左侧菜单
 * @author li-master
 *
 */
@Controller
@RequestMapping("/home/left")
public class LeftMenuController {
	
	
	/**
	 * 用户管理
	 * @return
	 */
	@RequestMapping("/user")
	public String user() {
		return "home/user";
	}
	
	/**
	 * 职位管理
	 * @return
	 */
	@RequestMapping("/job")
	public String job() {
		return "home/job";
	}
	
}
