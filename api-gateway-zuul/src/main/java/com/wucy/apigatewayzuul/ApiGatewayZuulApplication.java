package com.wucy.apigatewayzuul;

import com.wucy.apigatewayzuul.filter.AccessFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * @author wucy
 */
@SpringBootApplication
@EnableZuulProxy
public class ApiGatewayZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayZuulApplication.class, args);
	}


	/*@Bean
	public AccessFilter accessFilter() {
		return new AccessFilter();
	}*/

}
