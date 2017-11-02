package com.wucy.provider.service.impl;

import com.wucy.provider.dao.JedisDao;
import com.wucy.provider.entity.Jedis;
import com.wucy.provider.service.JedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author wucy
 * Date: 2017-10-27 13:33:00
 */
@Service
@Transactional
public class JedisServiceImpl extends BaseServiceImpl<Jedis,Integer> implements JedisService {

	@Autowired
	private JedisDao jedisDao;

}
