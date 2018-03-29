package com.weixindev.micro.serv.msg.client.hystrix;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.weixindev.micro.serv.common.bean.RestAPIResult;
import com.weixindev.micro.serv.msg.client.WeixinFeignClient;

@Component
public class WeixinrFeignClientHystrix implements WeixinFeignClient {

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
		return null;
	}
}
