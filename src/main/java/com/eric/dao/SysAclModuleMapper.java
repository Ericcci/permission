package com.eric.dao;

import com.eric.model.SysAclModule;

public interface SysAclModuleMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(SysAclModule record);

    int insertSelective(SysAclModule record);

    SysAclModule selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(SysAclModule record);

    int updateByPrimaryKey(SysAclModule record);
}