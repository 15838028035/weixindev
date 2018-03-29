package com.weixindev.micro.serv.msg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class WeixinServApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeixinServApplication.class, args);
	}
}
