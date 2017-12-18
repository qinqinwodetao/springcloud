package com.wucy.consumer.client;

import com.wucy.consumer.client.impl.UserFeignClientFallbackImpl;
import com.wucy.consumer.output.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by wucy on 2017/6/16.
 */
@FeignClient(name = "MICROSERVICE-PROVIDER", fallback = UserFeignClientFallbackImpl.class)
public interface UserFeignClient {
    /**
     * 负载查询by id
     * @param id
     * @return
     */
    @RequestMapping(value = "provider/user/{id}")
    User findUserById(@PathVariable("id") Integer id);

    /**
     * 负载查询all
     * @return
     */
    @RequestMapping(value = "provider/user/getAll")
    List<User> getAll();
}
