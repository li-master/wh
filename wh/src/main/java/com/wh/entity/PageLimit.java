package com.wh.entity;

import java.io.Serializable;

import lombok.Data;

/**
 * job
 * @author i-master
 *
 */
@Data
public class PageLimit implements Serializable {
	
	/**
	 * 当前页
	 */
	private Integer page;
	
	/**
	 * 每页多少条
	 */
	private Integer limit;
}
