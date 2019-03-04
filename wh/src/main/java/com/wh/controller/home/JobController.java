package com.wh.controller.home;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping("/edit")
	public ModelAndView edit(ModelAndView vm){
		return new ModelAndView("home/job/edit");
	}
	
	@RequestMapping("/save")
	public void save(Job job){
		//设置发布时间
		if(job.getJob_publish()==1) {
			job.setJob_publish_date(new Date());
		}else {
			job.setJob_publish_date(null);
		}
		
		job_service.save(job);
	}
	
	@RequestMapping("/remove")
	public void remove(Integer id){
		job_service.delete(id);
	}
}
