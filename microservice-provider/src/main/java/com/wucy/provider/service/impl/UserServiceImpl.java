package com.wucy.provider.service.impl;

import com.wucy.provider.dao.UserDao;
import com.wucy.provider.entity.User;
import com.wucy.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author wucy
 * Date: 2017-10-27 13:19:00
 * Descript:
 */
@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User,Integer> implements UserService {

	@Autowired
	private UserDao userDao;


}
