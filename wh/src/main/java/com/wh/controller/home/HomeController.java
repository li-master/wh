package com.wh.controller.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 后台入口
 * @author li-master
 *
 */
@Controller
@RequestMapping("/home")
public class HomeController {
	
	@RequestMapping("")
	public String home() {
		return "home/index";
	}
	
}
