package com.common;

import com.github.pagehelper.PageInfo;

import org.springframework.stereotype.Service;

import java.util.Map;

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

    PageInfo<T> getPageInfo(Map<String,Object> params);



    /**
     *  int deleteByPrimaryKey(Long id);
     *
     *     int insert(User record);
     *
     *     int insertSelective(User record);
     *
     *     User selectByPrimaryKey(Long id);
     *
     *     int updateByPrimaryKeySelective(User record);
     *
     *     int updateByPrimaryKey(User record);
     */

}
