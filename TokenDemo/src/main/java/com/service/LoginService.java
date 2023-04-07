package com.service;

import com.entity.User;
import com.utils.ResponseResult;


public interface LoginService {
    ResponseResult login(User user);

    ResponseResult logout();
}
