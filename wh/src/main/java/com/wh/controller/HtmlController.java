package com.wh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.wh.service.JobService;
import com.wh.service.UserService;

/** 
* @author 作者 : 一天不喝大力 浑身难受 
* @version 创建时间：2019年2月23日 下午4:19:07 
*
* 类说明 
* ps:
*/
@Controller
@RequestMapping("/views")
public class HtmlController {
	
	@Autowired
	UserService user_service;
	@Autowired
	JobService job_service;
	@RequestMapping("/test")
	public String html(Model model) {
		model.addAttribute("user", user_service.findAll());
		return "index";
	}
	
	@RequestMapping("/fuck")
	@ResponseBody
	public List htmls(Model model) {
		return job_service.findAll();
	}
}
