package com.jt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jt.mapper.UserMapper;
import com.jt.pojo.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	//如果需要条件则使用条件构造器编辑,如果不需要条件 则为null接口
	@Override
	public List<User> findAll() {
		//面向对象的方式操作数据库!!
		return userMapper.selectList(null);
	}
}
