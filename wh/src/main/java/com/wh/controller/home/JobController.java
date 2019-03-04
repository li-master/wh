package com.wh.controller.home;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wh.entity.Job;
import com.wh.service.JobService;


/**
 * 职位-数据接口
 * @author li-master
 *
 */
@RestController
@RequestMapping("/home/job")
public class JobController {
	
	@Autowired
	JobService job_service;
	
	@RequestMapping("/all")
	public List<Job> findAll(){
		return job_service.findAll();
	}
	
	/**
	 *
	 * @return
	 */
	@RequestMapping("/edit")
	public String edit(){
		return "home/job/edit";
	}
}
