package com.fujian.marketgoods.service;

import com.fujian.marketgoods.pojo.entity.Address;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AddressService {
    public List<Address> getAddressByUserId(Integer userId);
}
