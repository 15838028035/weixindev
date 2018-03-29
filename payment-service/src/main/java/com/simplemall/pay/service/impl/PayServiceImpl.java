package com.weixindev.pay.service.impl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weixindev.micro.serv.common.constant.SystemConstants;
import com.weixindev.pay.bean.PayRecord;
import com.weixindev.pay.dal.PayRecordMapper;
import com.weixindev.pay.service.IPayService;

@Service
public class PayServiceImpl implements IPayService {

	@Autowired
	PayRecordMapper recordMapper;
	
	@Override
	public int pay(String serialNo, String payType,BigDecimal price) {
		PayRecord record = new PayRecord();
		record.setPrice(Float.valueOf(String.valueOf(price)));
		record.setSerialNo(serialNo);
		record.setType(payType);
		record.setStatus(SystemConstants.PAY_STATUS.PAID);
		return recordMapper.insertSelective(record);
	}

}
