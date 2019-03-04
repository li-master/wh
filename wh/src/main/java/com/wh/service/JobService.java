package com.wh.service;

import java.util.List;

import com.wh.entity.Job;

/**
 * 
 * @author li-master
 *
 */
public interface JobService {
	
	List<Job> findAll();
	
	Job findOne(int job_id);

}
