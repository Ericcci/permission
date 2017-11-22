package com.eric.dao;

import com.eric.model.SysRoleAcl;

public interface SysRoleAclMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(SysRoleAcl record);

    int insertSelective(SysRoleAcl record);

    SysRoleAcl selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(SysRoleAcl record);

    int updateByPrimaryKey(SysRoleAcl record);
}