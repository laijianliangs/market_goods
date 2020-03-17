package com.fujian.marketgoods.service;

import com.fujian.marketgoods.pojo.entity.User;

public interface UserService {

    Boolean login(User user);

    User getUseIdByPhone(String phone);
}
