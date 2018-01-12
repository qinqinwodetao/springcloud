package com.wucy.consumer.control;

import com.wucy.consumer.client.UserProviderClient;
import com.wucy.consumer.output.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by wucy on 2017/6/16.
 */
@RestController
@RequestMapping(value = "/user")
public class UserControl {


    @Autowired
    private UserProviderClient userProviderClient;


    @GetMapping(value = "/{id}")
    public User getUserById(@PathVariable("id") Integer id){
        return userProviderClient.getUserById(id);
    }


    @GetMapping(value = "/hello")
    public String hello(){
        return "hello";
    }




    @Autowired
    private DiscoveryClient discoveryClient;
    /**
     *
     * @return
     */
    @GetMapping(value = "/getServiceInstance")
    public List<ServiceInstance> getServiceInstance(){
        return discoveryClient.getInstances("MICROSERVICE-PROVIDER");

    }

}
