package com.wh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wh.entity.Job;

/**
 * job-repository
 * @author li-master
 *
 */
public interface JobRepository extends JpaRepository<Job, Integer>{


}
