package com.wucy.consumer.client;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wucy.consumer.output.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author wucy
 * Date: 2017-12-18 15:02:00
 */
@Service
public class UserProviderClient extends AbstractClient {

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public String getServiceUrl(String subPath) {
		return "http://microservice-provider/provider" + subPath;
	}


	@HystrixCommand(fallbackMethod = "error")
	public User getUserById(Integer id){
		String url = getServiceUrl("/user/") + id;
		return restTemplate.getForObject(url, User.class);
	}

	/**
	 * fallbackMethod 入参出参与 getUserById() 一致
	 * @param id
	 * @return
	 */
	public User error(Integer id) {
		User user = new User();
		user.setId(-1);
		user.setUserName("fallback");
		user.setPassword("fallback");
		return user;
	}

}
