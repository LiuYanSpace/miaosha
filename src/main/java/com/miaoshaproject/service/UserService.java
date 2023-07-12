package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.UserModel;

/**
 * @Auther:ZLY
 * @Date: 2023/7/1 - 07 - 01 - 18:10
 * @Description:
 * @version:1.0
 */

public interface UserService {
//通过用户id获取用户对象的方法
    UserModel getUserById(Integer id);

    void register(UserModel userModel) throws BusinessException;

    /*
   telphone:用户注册手机
   encrptPassowrd:用户加密后的密码
    */
    UserModel validateLogin(String telphone, String encrptPassword) throws BusinessException;
}
