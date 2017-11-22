package com.eric.dao;

import com.eric.model.SysRole;

public interface SysRoleMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);
}