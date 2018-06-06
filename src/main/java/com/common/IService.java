package com.common;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 通用接口
 * @param <T>
 */
@Service
public interface IService<T> {
    int insert(T entity);

    int insertSelective(T entity);

    T selectByKey(Object key);

    int updateByPrimaryKey(T entity);

    int updateByPrimaryKeySelective(T entity);

    int deleteByKey(Object key);

    List<T> selectByExample(Object example);




}
