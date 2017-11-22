package com.eric.dao;

import com.eric.model.SysRoleUser;

public interface SysRoleUserMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(SysRoleUser record);

    int insertSelective(SysRoleUser record);

    SysRoleUser selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(SysRoleUser record);

    int updateByPrimaryKey(SysRoleUser record);
}