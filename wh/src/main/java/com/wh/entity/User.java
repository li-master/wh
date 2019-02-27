package com.wh.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/** 
* @author 作者 : 一天不喝大力 浑身难受 
* @version 创建时间：2019年2月23日 下午3:19:56 
*
* 类说明 
* ps:
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
