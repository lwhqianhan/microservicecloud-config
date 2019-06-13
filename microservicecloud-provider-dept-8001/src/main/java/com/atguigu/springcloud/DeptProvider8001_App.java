package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient//本服务启动之后会自动注册进eureka服务中
@EnableDiscoveryClient//发现服务
public class DeptProvider8001_App {

	public static void main(String[] args) {

		SpringApplication.run(DeptProvider8001_App.class, args);
	}	

}
