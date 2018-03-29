package com.weixindev.micro.serv.msg.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.weixindev.micro.serv.common.bean.RestAPIResult;
import com.weixindev.micro.serv.msg.client.hystrix.WeixinrFeignClientHystrix;

@FeignClient(name = "microservice-provider-weixin" ,fallback = WeixinrFeignClientHystrix.class)
public interface WeixinFeignClient {
	
	/**
	 * 添加一条消息
	 * 
	 * @param serialNo
	 * @param msgType
	 * @param target
	 * @param content
	 * @return
	 */
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public RestAPIResult<Integer> addMsg(String serialNo, String msgType, String target, String content);
}
