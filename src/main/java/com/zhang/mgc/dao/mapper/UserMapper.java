package com.zhang.mgc.dao.mapper;


import java.util.List;

import com.zhang.mgc.model.User;


public interface UserMapper {
	
	User selectByName(String userName);
	
	List<User> getXiaoshou();
}
