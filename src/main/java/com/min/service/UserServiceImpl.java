package com.min.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.min.dao.UserDao;
import com.min.entity.TsUser;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	
	@Override
	public TsUser findUserByUsername(String username) {
		return userDao.findByUsername(username);
	}

}
