package com.eric.model;

import java.util.Date;

public class SysRoleAcl {
    private Integer uuid;

    private Integer roleUuid;

    private Integer aclUuid;

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

    public Integer getAclUuid() {
        return aclUuid;
    }

    public void setAclUuid(Integer aclUuid) {
        this.aclUuid = aclUuid;
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