package com.wh.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * 
 * @author li-master
 *
 */
@Data
@Entity
@Table(name="user")
public class User {
	
	@Id
	@Column()
	private Integer u_id;
	
	@Column()
	private String u_name;
}
