package com.wh.service.impl;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.wh.entity.User;
import com.wh.repository.UserRepository;
import com.wh.service.UserService;

/**
 * 
 * @author li-master
 *
 */
@Service
public class UserServiceImpl implements UserService {
	
	//dao
	@Autowired
	UserRepository dao;

	@Override
	public List<User> findAll() {
		return dao.findAll();
	}

	@Override
	public User findOne(int u_id) {
		return dao.findOne(u_id);
	}

	/**
	 * 分页查询
	 */
	@Override
	public Page<User> findAll(User user) {
		
		Pageable pageable=new PageRequest(user.getPage()-1, user.getLimit());
		
		Page<User> page_list=dao.findAll(new Specification<User>() {
			
			@Override
			public Predicate toPredicate(Root<User> root, CriteriaQuery<?> cq, CriteriaBuilder cb) {
				
				List<Predicate> list=new ArrayList<Predicate>();
				
				/**
				 * 参数
				 */
				Class cls=user.getClass();
				Field[] fields=cls.getDeclaredFields();
				for (Field f : fields) {
					f.setAccessible(true);
					Object o;
					try {
						o = f.get(user);
						if(!StringUtils.isEmpty(o)) {
							list.add(cb.equal(root.get(f.getName()).as(f.getType()), o));
						}
					} catch (IllegalArgumentException | IllegalAccessException e) {
						e.printStackTrace();
					}
				}
				
				Predicate[] predicates=new Predicate[list.size()];
				
				return cb.and(list.toArray(predicates));
			}
		},pageable);
		
		return page_list;
	}

}
