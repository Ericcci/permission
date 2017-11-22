package com.eric.dao;

import com.eric.model.SysDept;

public interface SysDeptMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(SysDept record);

    int insertSelective(SysDept record);

    SysDept selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(SysDept record);

    int updateByPrimaryKey(SysDept record);
}