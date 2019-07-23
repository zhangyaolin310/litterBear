package com.zhang.mgc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhang.mgc.dao.UserDao;
import com.zhang.mgc.dao.mapper.UserMapper;
import com.zhang.mgc.model.Clue;
import com.zhang.mgc.model.User;
import com.zhang.mgc.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserMapper userMapper;

	@Override
	public User selectByName(String userName) {
		return userMapper.selectByName(userName);
	}

	@Override
	public List<User> getXiaoshou() {
		return userMapper.getXiaoshou();
	}

}
