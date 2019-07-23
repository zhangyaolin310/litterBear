package com.zhang.mgc.service;

import java.util.List;

import com.zhang.mgc.model.User;

public interface UserService {
    
    User selectByName(String userName);
    
    List<User> getXiaoshou();
}
