package com.wucy.consumer.client;

import com.wucy.consumer.output.User;
import com.wucy.consumer.client.impl.UserFeignClientFallbackImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wucy on 2017/6/16.
 */
@FeignClient(name = "MICROSERVICE-PROVIDER", fallback = UserFeignClientFallbackImpl.class)
public interface UserFeignClient {
    /**
     * 负载查询
     * @param id
     * @return
     */
    @RequestMapping(value = "/user/{id}")
    User findUserById(@PathVariable("id") Integer id);
}
