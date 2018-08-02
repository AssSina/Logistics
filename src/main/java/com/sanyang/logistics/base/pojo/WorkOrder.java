package com.sanyang.logistics.base.pojo;

import java.util.Date;

public class WorkOrder {
    private Integer workid;

    private Integer orderid;

    private Integer fromWhId;

    private Integer toWhId;

    private String trnsptFlag;

    private Integer trnsptTypeId;

    private Date createDate;

    private Date updateDate;

    private String fromAddress;

    private String toAddress;

    private Date sendtime;

    private Date arrivetime;

    private Integer productcount;

    private Integer sendcount;

    private Date planOutDate;

    private Date planInDate;

    private String heightflag;

    private String heigtharear;

    private String scheduletype;

    private String productname;

    private String pcode;

    private String ptype;

    private String ppackage;

    private String workstatus;

    private String ordertype;

    public Integer getWorkid() {
        return workid;
    }

    public void setWorkid(Integer workid) {
        this.workid = workid;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getFromWhId() {
        return fromWhId;
    }

    public void setFromWhId(Integer fromWhId) {
        this.fromWhId = fromWhId;
    }

    public Integer getToWhId() {
        return toWhId;
    }

    public void setToWhId(Integer toWhId) {
        this.toWhId = toWhId;
    }

    public String getTrnsptFlag() {
        return trnsptFlag;
    }

    public void setTrnsptFlag(String trnsptFlag) {
        this.trnsptFlag = trnsptFlag == null ? null : trnsptFlag.trim();
    }

    public Integer getTrnsptTypeId() {
        return trnsptTypeId;
    }

    public void setTrnsptTypeId(Integer trnsptTypeId) {
        this.trnsptTypeId = trnsptTypeId;
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

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public Date getArrivetime() {
        return arrivetime;
    }

    public void setArrivetime(Date arrivetime) {
        this.arrivetime = arrivetime;
    }

    public Integer getProductcount() {
        return productcount;
    }

    public void setProductcount(Integer productcount) {
        this.productcount = productcount;
    }

    public Integer getSendcount() {
        return sendcount;
    }

    public void setSendcount(Integer sendcount) {
        this.sendcount = sendcount;
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

    public String getHeightflag() {
        return heightflag;
    }

    public void setHeightflag(String heightflag) {
        this.heightflag = heightflag == null ? null : heightflag.trim();
    }

    public String getHeigtharear() {
        return heigtharear;
    }

    public void setHeigtharear(String heigtharear) {
        this.heigtharear = heigtharear == null ? null : heigtharear.trim();
    }

    public String getScheduletype() {
        return scheduletype;
    }

    public void setScheduletype(String scheduletype) {
        this.scheduletype = scheduletype == null ? null : scheduletype.trim();
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public String getPcode() {
        return pcode;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode == null ? null : pcode.trim();
    }

    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype == null ? null : ptype.trim();
    }

    public String getPpackage() {
        return ppackage;
    }

    public void setPpackage(String ppackage) {
        this.ppackage = ppackage == null ? null : ppackage.trim();
    }

    public String getWorkstatus() {
        return workstatus;
    }

    public void setWorkstatus(String workstatus) {
        this.workstatus = workstatus == null ? null : workstatus.trim();
    }

    public String getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(String ordertype) {
        this.ordertype = ordertype == null ? null : ordertype.trim();
    }
}