package com.wh.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

/**
 * job
 * @author i-master
 *
 */
@Data
@Entity
@Table(name="job")
public class Job {
	
	@Id
	@Column
	@GeneratedValue
	private Integer job_id;
	
	@Column
	private String job_name;
	
	@Column
	private String job_salary;
	
	@Column
	private String job_address;
	
	@Column
	private String job_description;
	
	@Column
	@JsonFormat
	private Date job_create_date;
	
	@Column
	private Integer job_publish;
	
	@Column
	@JsonFormat
	private Date job_publish_date;
}
