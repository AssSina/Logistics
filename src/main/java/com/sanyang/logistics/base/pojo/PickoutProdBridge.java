package com.sanyang.logistics.base.pojo;

public class PickoutProdBridge {
    private Integer pickoutProdId;

    private Integer pickoutId;

    private Integer workOrderId;

    private Integer prodId;

    private String pname;

    private String ptype;

    private String pcode;

    private String packageName;

    private Integer planAmt;

    private Integer preoutAmt;

    private Integer outAmt;

    public Integer getPickoutProdId() {
        return pickoutProdId;
    }

    public void setPickoutProdId(Integer pickoutProdId) {
        this.pickoutProdId = pickoutProdId;
    }

    public Integer getPickoutId() {
        return pickoutId;
    }

    public void setPickoutId(Integer pickoutId) {
        this.pickoutId = pickoutId;
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

    public Integer getPreoutAmt() {
        return preoutAmt;
    }

    public void setPreoutAmt(Integer preoutAmt) {
        this.preoutAmt = preoutAmt;
    }

    public Integer getOutAmt() {
        return outAmt;
    }

    public void setOutAmt(Integer outAmt) {
        this.outAmt = outAmt;
    }
}