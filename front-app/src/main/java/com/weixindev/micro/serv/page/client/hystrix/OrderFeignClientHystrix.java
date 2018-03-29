package com.weixindev.micro.serv.page.client.hystrix;

import org.springframework.stereotype.Component;

import com.weixindev.micro.serv.page.client.OrderFeignClient;

@Component
public class OrderFeignClientHystrix implements OrderFeignClient {

	@Override
	public String createOrder(String orderJsonStr) {
		return "create failed!";
	}

}
