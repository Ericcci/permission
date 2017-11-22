package com.eric.dao;

import com.eric.model.SysAcl;

public interface SysAclMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(SysAcl record);

    int insertSelective(SysAcl record);

    SysAcl selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(SysAcl record);

    int updateByPrimaryKey(SysAcl record);
}