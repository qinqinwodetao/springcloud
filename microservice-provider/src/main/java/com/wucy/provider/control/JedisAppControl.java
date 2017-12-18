package com.wucy.provider.control;

import com.wucy.provider.dao.JedisDao;
import com.wucy.provider.entity.Jedis;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by wucy on 2017/6/15.
 */

@RestController
@RefreshScope //从Git服务刷新配置
@RequestMapping(value = "provider/jedisApp")
public class JedisAppControl {

    private static final Logger log = LoggerFactory.getLogger(JedisAppControl.class);

    @Autowired
    private JedisDao jedisDao;


    @Value("${jedis.ip}")
    private String jedisIp;

    @Value("${jedis.port}")
    private String jedisPort;

    @GetMapping(value = "/jedisHello")
    public String jedisHello(){
        String str = "jedisIp:" + jedisIp + "||" + "jedisPort：" + jedisPort;

        log.info(str);

        return str;

    }

    @GetMapping(value = "/jedis/{id}")
    public Jedis getJedisById(@PathVariable Integer id){
        return jedisDao.findOne(id);

    }


    @PostMapping(value = "getJedis")
    public List<Jedis> getJedis(){


        return  jedisDao.findAll();
    }


}
