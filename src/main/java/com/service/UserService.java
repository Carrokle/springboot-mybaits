package com.service;

import com.common.IService;
import com.domain.User;

import java.util.List;
import java.util.Map;

public interface UserService extends IService<User>{
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> getUserList(Map<String,Object> params);
}
