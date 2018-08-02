package com.sanyang.logistics.base.pojo;

import java.util.Date;

public class Sysorders {
    private Integer oid;

    private String cusOrderNo;

    private Integer parentOid;

    private Integer custId;

    private Integer sysOrderTypeId;

    private Integer custOrderTypeId;

    private String fromAddress;

    private String toAddress;

    private String toCustomer;

    private Integer fromWarehouse;

    private Integer toWarehouse;

    private Integer orderStatus;

    private Integer productCount;

    private String trucktype;

    private Date planTrsprtDate;

    private Date planArrivalDate;

    private Date planOutDate;

    private Date planInDate;

    private String contactPhone;

    private String contactPerson;

    private String takeMoneyFlag;

    private String truckflag;

    private Integer regionId;

    private Date createtime;

    private String description;

    private String createperson;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getCusOrderNo() {
        return cusOrderNo;
    }

    public void setCusOrderNo(String cusOrderNo) {
        this.cusOrderNo = cusOrderNo == null ? null : cusOrderNo.trim();
    }

    public Integer getParentOid() {
        return parentOid;
    }

    public void setParentOid(Integer parentOid) {
        this.parentOid = parentOid;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public Integer getSysOrderTypeId() {
        return sysOrderTypeId;
    }

    public void setSysOrderTypeId(Integer sysOrderTypeId) {
        this.sysOrderTypeId = sysOrderTypeId;
    }

    public Integer getCustOrderTypeId() {
        return custOrderTypeId;
    }

    public void setCustOrderTypeId(Integer custOrderTypeId) {
        this.custOrderTypeId = custOrderTypeId;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress == null ? null : fromAddress.trim();
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress == null ? null : toAddress.trim();
    }

    public String getToCustomer() {
        return toCustomer;
    }

    public void setToCustomer(String toCustomer) {
        this.toCustomer = toCustomer == null ? null : toCustomer.trim();
    }

    public Integer getFromWarehouse() {
        return fromWarehouse;
    }

    public void setFromWarehouse(Integer fromWarehouse) {
        this.fromWarehouse = fromWarehouse;
    }

    public Integer getToWarehouse() {
        return toWarehouse;
    }

    public void setToWarehouse(Integer toWarehouse) {
        this.toWarehouse = toWarehouse;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public String getTrucktype() {
        return trucktype;
    }

    public void setTrucktype(String trucktype) {
        this.trucktype = trucktype == null ? null : trucktype.trim();
    }

    public Date getPlanTrsprtDate() {
        return planTrsprtDate;
    }

    public void setPlanTrsprtDate(Date planTrsprtDate) {
        this.planTrsprtDate = planTrsprtDate;
    }

    public Date getPlanArrivalDate() {
        return planArrivalDate;
    }

    public void setPlanArrivalDate(Date planArrivalDate) {
        this.planArrivalDate = planArrivalDate;
    }

    public Date getPlanOutDate() {
        return planOutDate;
    }

    public void setPlanOutDate(Date planOutDate) {
        this.planOutDate = planOutDate;
    }

    public Date getPlanInDate() {
        return planInDate;
    }

    public void setPlanInDate(Date planInDate) {
        this.planInDate = planInDate;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone == null ? null : contactPhone.trim();
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson == null ? null : contactPerson.trim();
    }

    public String getTakeMoneyFlag() {
        return takeMoneyFlag;
    }

    public void setTakeMoneyFlag(String takeMoneyFlag) {
        this.takeMoneyFlag = takeMoneyFlag == null ? null : takeMoneyFlag.trim();
    }

    public String getTruckflag() {
        return truckflag;
    }

    public void setTruckflag(String truckflag) {
        this.truckflag = truckflag == null ? null : truckflag.trim();
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getCreateperson() {
        return createperson;
    }

    public void setCreateperson(String createperson) {
        this.createperson = createperson == null ? null : createperson.trim();
    }
}