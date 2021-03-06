package com.weixindev.micro.serv.prd.service;

import java.util.List;

import com.weixindev.micro.serv.common.bean.product.PrdInfo;

public interface IPrdService {

	/**
	 * 商品详情
	 * 
	 * @param prdId
	 * @return
	 */
	PrdInfo getProductById(String prdId);

	/**
	 * 获取商品列表
	 * 
	 * @return
	 */
	List<PrdInfo> queryPrdList();
}
