package com.service;

import com.common.IService;
import com.domain.Resources;
import com.github.pagehelper.PageInfo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ResourcesService extends IService<Resources> {
    PageInfo<Resources> selectByPage(Resources resources,int startPage, int length);

    List<Resources> queryAll();


}
