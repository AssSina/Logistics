package com.sanyang.logistics.base.pojo;

public class PrepareInWarehouse {
    private Integer preind;

    private Integer rcptProdId;

    private Integer rcptId;

    private Integer posnId;

    private Integer prodId;

    private String pname;

    private String ptype;

    private String pcode;

    private String packageName;

    private String posnCode;

    private String policyId;

    private String backupAreaCode;

    private Integer storeAmt;

    private String doneFlag;

    public Integer getPreind() {
        return preind;
    }

    public void setPreind(Integer preind) {
        this.preind = preind;
    }

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

    public Integer getPosnId() {
        return posnId;
    }

    public void setPosnId(Integer posnId) {
        this.posnId = posnId;
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

    public String getPosnCode() {
        return posnCode;
    }

    public void setPosnCode(String posnCode) {
        this.posnCode = posnCode == null ? null : posnCode.trim();
    }

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId == null ? null : policyId.trim();
    }

    public String getBackupAreaCode() {
        return backupAreaCode;
    }

    public void setBackupAreaCode(String backupAreaCode) {
        this.backupAreaCode = backupAreaCode == null ? null : backupAreaCode.trim();
    }

    public Integer getStoreAmt() {
        return storeAmt;
    }

    public void setStoreAmt(Integer storeAmt) {
        this.storeAmt = storeAmt;
    }

    public String getDoneFlag() {
        return doneFlag;
    }

    public void setDoneFlag(String doneFlag) {
        this.doneFlag = doneFlag == null ? null : doneFlag.trim();
    }
}