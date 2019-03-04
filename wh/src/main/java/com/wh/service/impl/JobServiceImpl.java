package com.wh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wh.entity.Job;
import com.wh.repository.JobRepository;
import com.wh.service.JobService;

/**
 * 
 * @author li-master
 *
 */
@Service
public class JobServiceImpl implements JobService {
	
	@Autowired
	JobRepository dao;

	@Override
	public List<Job> findAll() {
		return dao.findAll();
	}

	@Override
	public Job findOne(int job_id) {
		return dao.findOne(job_id);
	}
	
}
