package com.sanyang.logistics.base.pojo;

public class SplitedOrderProdBridge {
    private Integer oid;

    private Integer workOrderId;

    private Integer schedId;

    private Integer orderid;

    private Integer prodId;

    private String pname;

    private String ptype;

    private String pcode;

    private String packageid;

    private Integer planAmt;

    private Integer splitAmt;

    private Integer unallocAmt;

    private Integer realAmt;

    private Integer height;

    private String arear;

    private String toaddress;

    private String description;

    private String splitedstatus;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(Integer workOrderId) {
        this.workOrderId = workOrderId;
    }

    public Integer getSchedId() {
        return schedId;
    }

    public void setSchedId(Integer schedId) {
        this.schedId = schedId;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
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

    public String getPackageid() {
        return packageid;
    }

    public void setPackageid(String packageid) {
        this.packageid = packageid == null ? null : packageid.trim();
    }

    public Integer getPlanAmt() {
        return planAmt;
    }

    public void setPlanAmt(Integer planAmt) {
        this.planAmt = planAmt;
    }

    public Integer getSplitAmt() {
        return splitAmt;
    }

    public void setSplitAmt(Integer splitAmt) {
        this.splitAmt = splitAmt;
    }

    public Integer getUnallocAmt() {
        return unallocAmt;
    }

    public void setUnallocAmt(Integer unallocAmt) {
        this.unallocAmt = unallocAmt;
    }

    public Integer getRealAmt() {
        return realAmt;
    }

    public void setRealAmt(Integer realAmt) {
        this.realAmt = realAmt;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getArear() {
        return arear;
    }

    public void setArear(String arear) {
        this.arear = arear == null ? null : arear.trim();
    }

    public String getToaddress() {
        return toaddress;
    }

    public void setToaddress(String toaddress) {
        this.toaddress = toaddress == null ? null : toaddress.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getSplitedstatus() {
        return splitedstatus;
    }

    public void setSplitedstatus(String splitedstatus) {
        this.splitedstatus = splitedstatus == null ? null : splitedstatus.trim();
    }
}