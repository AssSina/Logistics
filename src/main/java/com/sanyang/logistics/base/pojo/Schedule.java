package com.sanyang.logistics.base.pojo;

import java.util.Date;

public class Schedule {
    private Integer schedId;

    private Integer regionId;

    private Date createDate;

    private Date updateDate;

    private String execDoneFlag;

    private Integer schedTypeId;

    private Integer driverType;

    private Integer truckId;

    private Integer driverId;

    private Integer thirdPartyId;

    private Date endDate;

    private Integer hacount;

    private Integer pcount;

    private String schstatus;

    private String fromaddress;

    private String toaddress;

    private String cuname;

    private String cuphone;

    public Integer getSchedId() {
        return schedId;
    }

    public void setSchedId(Integer schedId) {
        this.schedId = schedId;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
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

    public String getExecDoneFlag() {
        return execDoneFlag;
    }

    public void setExecDoneFlag(String execDoneFlag) {
        this.execDoneFlag = execDoneFlag == null ? null : execDoneFlag.trim();
    }

    public Integer getSchedTypeId() {
        return schedTypeId;
    }

    public void setSchedTypeId(Integer schedTypeId) {
        this.schedTypeId = schedTypeId;
    }

    public Integer getDriverType() {
        return driverType;
    }

    public void setDriverType(Integer driverType) {
        this.driverType = driverType;
    }

    public Integer getTruckId() {
        return truckId;
    }

    public void setTruckId(Integer truckId) {
        this.truckId = truckId;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public Integer getThirdPartyId() {
        return thirdPartyId;
    }

    public void setThirdPartyId(Integer thirdPartyId) {
        this.thirdPartyId = thirdPartyId;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getHacount() {
        return hacount;
    }

    public void setHacount(Integer hacount) {
        this.hacount = hacount;
    }

    public Integer getPcount() {
        return pcount;
    }

    public void setPcount(Integer pcount) {
        this.pcount = pcount;
    }

    public String getSchstatus() {
        return schstatus;
    }

    public void setSchstatus(String schstatus) {
        this.schstatus = schstatus == null ? null : schstatus.trim();
    }

    public String getFromaddress() {
        return fromaddress;
    }

    public void setFromaddress(String fromaddress) {
        this.fromaddress = fromaddress == null ? null : fromaddress.trim();
    }

    public String getToaddress() {
        return toaddress;
    }

    public void setToaddress(String toaddress) {
        this.toaddress = toaddress == null ? null : toaddress.trim();
    }

    public String getCuname() {
        return cuname;
    }

    public void setCuname(String cuname) {
        this.cuname = cuname == null ? null : cuname.trim();
    }

    public String getCuphone() {
        return cuphone;
    }

    public void setCuphone(String cuphone) {
        this.cuphone = cuphone == null ? null : cuphone.trim();
    }
}