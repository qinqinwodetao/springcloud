package com.wucy.consumer.client.impl;

import com.wucy.consumer.output.User;
import com.wucy.consumer.client.UserFeignClient;
import org.springframework.stereotype.Component;


/**
 * @author wucy
 */
@Component
public class UserFeignClientFallbackImpl implements UserFeignClient {

    @Override
    public User findUserById(Integer id) {
        User user = new User();
        user.setId(-1);
        user.setUserName("fallback");
        user.setPassword("88888888");
        return user;
    }
}
