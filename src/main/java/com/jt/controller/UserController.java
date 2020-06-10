package com.jt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jt.pojo.User;
import com.jt.service.UserService;

//需要跳转页面
//@RestController //返回的数据都是JSON
@Controller
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	
	
	 /* 交互方式:
	 * 	1.同步  刷新页面同时,需要携带数据    JSP  动态页面独有的方式  
	 * 	2.异步  ajax交互方式.
	 **/
	
	
	/**
	 * 需求:
	 * 	1.用户通过http://localhost:8090/findAll请求跳转到userList.jsp页面中
	 * 	2.同时在页面中展现全部的用户数据. 要求使用MP方式查询.
	 * 	取值方法:${userList}
	 * 
	 */
	@RequestMapping("/findAll")
	public String findAll(Model model) {
		
		List<User> userList = userService.findAll();
		//model一般操作的都是request域
		model.addAttribute("userList", userList);
		return "userList";	//返回页面逻辑名称
	}
	
	
	/**
	 * 异步实现:
	 * 	1.跳转到userList-ajax页面
	 * 	2.实现数据的异步响应
	 */
	
	@RequestMapping("/ajax")
	public String ajax() {
		
		return "userList-ajax";
	}
	
	
}
