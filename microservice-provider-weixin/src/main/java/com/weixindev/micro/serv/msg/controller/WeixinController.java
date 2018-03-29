package com.weixindev.micro.serv.msg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.weixindev.micro.serv.common.bean.RestAPIResult;
import com.weixindev.micro.serv.msg.service.IMsgService;

@RestController
@RequestMapping("/weixin")
public class WeixinController {

	@Autowired
	IMsgService msgService;
	
	@Autowired
	private DiscoveryClient discoveryClient;

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
	public RestAPIResult<Integer> addMsg(String serialNo, String msgType, String target, String content) {
		RestAPIResult<Integer> apiResult = new RestAPIResult<Integer>();
		int result = msgService.addMsg(serialNo, msgType, target, content);
		apiResult.setRespData(result);
		return apiResult;
	}
	
	@GetMapping("/instance-info")
	public ServiceInstance showInfo() {
		ServiceInstance serviceInstance = this.discoveryClient.getLocalServiceInstance();
				
	  return serviceInstance;
	}
}
