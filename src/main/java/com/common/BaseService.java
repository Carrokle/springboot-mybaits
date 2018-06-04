package com.common;

import com.github.pagehelper.PageInfo;

import java.util.Map;

import tk.mybatis.mapper.common.Mapper;

public abstract class BaseService<T> implements IService<T>{
    protected Mapper<T> mapper;

    public Mapper<T> getMapper(){
        return mapper;
    }
    @Override
    public int insert(T entity) {
        return mapper.insert(entity);
    }

    @Override
    public int insertSelective(T entity) {
        return mapper.insertSelective(entity);
    }

    @Override
    public T selectByKey(Object key) {
        return mapper.selectByPrimaryKey(key);
    }

    @Override
    public int updateByPrimaryKey(T entity) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(T entity) {
        return 0;
    }

    @Override
    public PageInfo<T> getPageInfo(Map<String, Object> params) {
        return null;
    }

    @Override
    public int deleteByKey(Object key) {
        return 0;
    }
}
