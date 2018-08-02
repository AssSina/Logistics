package com.sanyang.logistics.base.pojo;

import java.util.Date;

public class TruckDim {
    private Integer truckId;

    private String license;

    private String carryCapcty;

    private Integer ownerTypeId;

    private Date createDate;

    private Date updateDate;

    private String trucktype;

    private String truckstatus;

    private String trucklocation;

    private Integer truckage;

    public Integer getTruckId() {
        return truckId;
    }

    public void setTruckId(Integer truckId) {
        this.truckId = truckId;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license == null ? null : license.trim();
    }

    public String getCarryCapcty() {
        return carryCapcty;
    }

    public void setCarryCapcty(String carryCapcty) {
        this.carryCapcty = carryCapcty == null ? null : carryCapcty.trim();
    }

    public Integer getOwnerTypeId() {
        return ownerTypeId;
    }

    public void setOwnerTypeId(Integer ownerTypeId) {
        this.ownerTypeId = ownerTypeId;
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

    public String getTrucktype() {
        return trucktype;
    }

    public void setTrucktype(String trucktype) {
        this.trucktype = trucktype == null ? null : trucktype.trim();
    }

    public String getTruckstatus() {
        return truckstatus;
    }

    public void setTruckstatus(String truckstatus) {
        this.truckstatus = truckstatus == null ? null : truckstatus.trim();
    }

    public String getTrucklocation() {
        return trucklocation;
    }

    public void setTrucklocation(String trucklocation) {
        this.trucklocation = trucklocation == null ? null : trucklocation.trim();
    }

    public Integer getTruckage() {
        return truckage;
    }

    public void setTruckage(Integer truckage) {
        this.truckage = truckage;
    }
}