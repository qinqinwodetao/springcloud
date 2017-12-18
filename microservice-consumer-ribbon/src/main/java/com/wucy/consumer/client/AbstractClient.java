package com.wucy.consumer.client;

/**
 * @author wucy
 * Date: 2017-12-18 15:01:00
 */
public abstract class AbstractClient {
	/**
	 * 获取service 的地址
	 * @return String
	 */
	public abstract String getServiceUrl(String subPath);
}
