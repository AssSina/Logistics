package com.sanyang.logistics.base.pojo;

import java.util.Date;

public class CustomizedPackage {
    private Integer pid;

    private String pname;

    private String rules;

    private String ruleDescription;

    private Double unitWeight;

    private Float unitVolume;

    private Float unitLength;

    private Float unitWidth;

    private Float unitHeight;

    private String unitFlag;

    private Date createDate;

    private Date updateDate;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules == null ? null : rules.trim();
    }

    public String getRuleDescription() {
        return ruleDescription;
    }

    public void setRuleDescription(String ruleDescription) {
        this.ruleDescription = ruleDescription == null ? null : ruleDescription.trim();
    }

    public Double getUnitWeight() {
        return unitWeight;
    }

    public void setUnitWeight(Double unitWeight) {
        this.unitWeight = unitWeight;
    }

    public Float getUnitVolume() {
        return unitVolume;
    }

    public void setUnitVolume(Float unitVolume) {
        this.unitVolume = unitVolume;
    }

    public Float getUnitLength() {
        return unitLength;
    }

    public void setUnitLength(Float unitLength) {
        this.unitLength = unitLength;
    }

    public Float getUnitWidth() {
        return unitWidth;
    }

    public void setUnitWidth(Float unitWidth) {
        this.unitWidth = unitWidth;
    }

    public Float getUnitHeight() {
        return unitHeight;
    }

    public void setUnitHeight(Float unitHeight) {
        this.unitHeight = unitHeight;
    }

    public String getUnitFlag() {
        return unitFlag;
    }

    public void setUnitFlag(String unitFlag) {
        this.unitFlag = unitFlag == null ? null : unitFlag.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}