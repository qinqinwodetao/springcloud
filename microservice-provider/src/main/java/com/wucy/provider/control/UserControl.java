package com.wucy.provider.control;

import com.wucy.provider.entity.User;
import com.wucy.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by wucy on 2017/6/16.
 */
@RestController
@RequestMapping(value = "provider/user")
public class UserControl {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/{id}")
    public User getUserById(@PathVariable Integer id){
        return userService.get(id);
    }

    @GetMapping(value = "/getAll")
    public List<User> getAll(){
        return userService.listAll();
    }


    @PutMapping(value = "/add")
    public void add(@RequestBody User user){

        userService.save(user);
    }

}
