package com.jt.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data	//生成get/set/toString/equals
@Accessors(chain=true)	//表示链式加载  重写set方法,将对象返回
@NoArgsConstructor		//添加无参构造   为以后框架的使用做准备
@AllArgsConstructor		//全部参数的构造方法.
@TableName		//(value="user")//定义对象与表映射关系 编辑表名
						//如果表名与对象的名称一致,则可以省略不写.
public class User {
	@TableId(type=IdType.AUTO)	//标识主键 主键自增.
	private Integer id;
	//@TableField(value="name")	//如果字段的名称与属性名称一致(包含驼峰规则),则可以省略
	private String name;		//字段与属性一一映射
	private Integer age;		//user_name  userName
	private String sex;
	
}
