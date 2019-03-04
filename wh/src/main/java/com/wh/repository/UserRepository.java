package com.wh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.wh.entity.User;

/** 
* @author 作者 : 一天不喝大力 浑身难受 
* @version 创建时间：2019年2月23日 下午3:39:28 
*
* 类说明 
* ps:
*/
public interface UserRepository extends JpaRepository<User, Integer>,JpaSpecificationExecutor<User>{

/*	@Query(value="select * from user where u_id=?1 and u_name=?2",nativeQuery=true)
	User findONe(int u_id);*/
}
