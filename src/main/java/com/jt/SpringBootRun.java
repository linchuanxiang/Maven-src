package com.jt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jt.mapper")	//动态扫描mapper接口
public class SpringBootRun {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRun.class, args);
	}

}
