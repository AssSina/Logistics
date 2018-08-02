package com.sanyang.logistics.base.pojo;

public class RcptProdBridge {
    private Integer rcptProdId;

    private Integer rcptId;

    private Integer workOrderId;

    private Integer prodId;

    private String pname;

    private String ptype;

    private String pcode;

    private String packageName;

    private Integer planAmt;

    private Integer incount;

    private Integer lostcount;

    private Integer destorycount;

    private Integer backupAreaId;

    private Integer preinAmt;

    private Integer inAmt;

    public Integer getRcptProdId() {
        return rcptProdId;
    }

    public void setRcptProdId(Integer rcptProdId) {
        this.rcptProdId = rcptProdId;
    }

    public Integer getRcptId() {
        return rcptId;
    }

    public void setRcptId(Integer rcptId) {
        this.rcptId = rcptId;
    }

    public Integer getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(Integer workOrderId) {
        this.workOrderId = workOrderId;
    }

    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype == null ? null : ptype.trim();
    }

    public String getPcode() {
        return pcode;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode == null ? null : pcode.trim();
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName == null ? null : packageName.trim();
    }

    public Integer getPlanAmt() {
        return planAmt;
    }

    public void setPlanAmt(Integer planAmt) {
        this.planAmt = planAmt;
    }

    public Integer getIncount() {
        return incount;
    }

    public void setIncount(Integer incount) {
        this.incount = incount;
    }

    public Integer getLostcount() {
        return lostcount;
    }

    public void setLostcount(Integer lostcount) {
        this.lostcount = lostcount;
    }

    public Integer getDestorycount() {
        return destorycount;
    }

    public void setDestorycount(Integer destorycount) {
        this.destorycount = destorycount;
    }

    public Integer getBackupAreaId() {
        return backupAreaId;
    }

    public void setBackupAreaId(Integer backupAreaId) {
        this.backupAreaId = backupAreaId;
    }

    public Integer getPreinAmt() {
        return preinAmt;
    }

    public void setPreinAmt(Integer preinAmt) {
        this.preinAmt = preinAmt;
    }

    public Integer getInAmt() {
        return inAmt;
    }

    public void setInAmt(Integer inAmt) {
        this.inAmt = inAmt;
    }
}