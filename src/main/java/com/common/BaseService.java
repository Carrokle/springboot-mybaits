package com.common;

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
        return mapper.updateByPrimaryKey(entity);
    }

    @Override
    public int updateByPrimaryKeySelective(T entity) {
        return mapper.updateByPrimaryKeySelective(entity);
    }


    @Override
    public int deleteByKey(Object key) {
        return mapper.deleteByPrimaryKey(key);
    }
}
