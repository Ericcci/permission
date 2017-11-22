package com.eric.dao;

import com.eric.model.SysUser;

public interface SysUserMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
}