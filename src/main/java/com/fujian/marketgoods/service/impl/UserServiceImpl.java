package com.fujian.marketgoods.service.impl;

import com.fujian.marketgoods.dao.UserDao;
import com.fujian.marketgoods.pojo.entity.User;
import com.fujian.marketgoods.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {


    @Resource
    UserDao userDao;

    @Override
    public Boolean login(User user) {

        User dbuser=userDao.selectByPrimaryPhone(user.getPhone());
        if(dbuser==null)
        {
            return false;
        }else {
            if(dbuser.getPassword().equals(user.getPassword()))
            {
                return true;
            }else {
                return false;
            }
        }

    }

    @Override
    public User getUseIdByPhone(String phone) {
      return   userDao.selectByPrimaryPhone(phone);
    }
}
