package com.jt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jt.pojo.User;
//该接口需要交给Spring容器管理
//BaseMapper中的泛型标识操作的具体的表 千万不要写错.
public interface UserMapper extends BaseMapper<User>{
	
	//准备查询全部用户信息的方法
	List<User> findAll();
	
	//手写入库操作
	int insertUser(User user);
}
