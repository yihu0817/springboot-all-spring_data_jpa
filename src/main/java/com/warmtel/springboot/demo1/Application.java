package com.warmtel.springboot.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 
 * @author viktor.zhou
 * 创建时间: 2017年6月4日
 * 
 * SpringBoot启动类Applicaton必须放在根目录下,否则扫描不到Dao类
 */
@SpringBootApplication
public class Application {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}

}