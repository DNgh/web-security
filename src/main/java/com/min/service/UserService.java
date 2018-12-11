package com.min.service;

import com.min.entity.TsUser;

public interface UserService {
	public TsUser findUserByUsername(String username);
}
