package com.wh.controller.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 前台入口
 * @author li-master
 *
 */
@Controller
public class FrontController {
	
	@RequestMapping("")
	public String front() {
		return "index";
	}
	
	@RequestMapping("/front")
	public String front1() {
		return "index";
	}
	
}
