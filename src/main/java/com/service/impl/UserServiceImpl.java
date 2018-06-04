package com.service.impl;

import com.dao.UserMapper;
import com.domain.User;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserMapper userMapper;
    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return 0;
    }

    @Override
    public User selectByPrimaryKey(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return 0;
    }

    @Override
    public List<User> getUserList(Map<String,Object> params) {
        Integer pageIndex = Integer.parseInt(params.get("page").toString());
        Integer rows = Integer.parseInt(params.get("rows").toString());
        Page<User> page = PageHelper.startPage(pageIndex,rows).doSelectPage(() -> userMapper.getUserList());
        logger.info("分页查询page：" + page);
        PageInfo<User> pageInfo = PageHelper.startPage(pageIndex,rows).doSelectPageInfo(() -> userMapper.getUserList());
        logger.info("分页查询pageInfo：" + pageInfo);
        long total = PageHelper.count(() -> userMapper.getUserList());
        logger.info("分页查询total1：" + total);
        PageHelper.startPage(pageIndex,rows);
        return userMapper.getUserList();
    }
}
