package com.eric.model;

import java.util.Date;

public class SysRoleUser {
    private Integer uuid;

    private Integer roleUuid;

    private Integer userUuid;

    private String operator;

    private Date operatorTime;

    private String operatorIp;

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public Integer getRoleUuid() {
        return roleUuid;
    }

    public void setRoleUuid(Integer roleUuid) {
        this.roleUuid = roleUuid;
    }

    public Integer getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(Integer userUuid) {
        this.userUuid = userUuid;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Date getOperatorTime() {
        return operatorTime;
    }

    public void setOperatorTime(Date operatorTime) {
        this.operatorTime = operatorTime;
    }

    public String getOperatorIp() {
        return operatorIp;
    }

    public void setOperatorIp(String operatorIp) {
        this.operatorIp = operatorIp == null ? null : operatorIp.trim();
    }
}