package com.sanyang.logistics.base.pojo;

public class PrepareOutWarehouse {
    private Integer preoutId;

    private Integer pickoutProdId;

    private Integer pickoutId;

    private Integer posnId;

    private Integer prodId;

    private String pname;

    private String ptype;

    private String pcode;

    private String packageName;

    private String posnCode;

    private Integer preoutAmt;

    private String policyId;

    private String backupAreaCode;

    private Integer backupid;

    private String doneFlag;

    public Integer getPreoutId() {
        return preoutId;
    }

    public void setPreoutId(Integer preoutId) {
        this.preoutId = preoutId;
    }

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

    public Integer getPreoutAmt() {
        return preoutAmt;
    }

    public void setPreoutAmt(Integer preoutAmt) {
        this.preoutAmt = preoutAmt;
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

    public Integer getBackupid() {
        return backupid;
    }

    public void setBackupid(Integer backupid) {
        this.backupid = backupid;
    }

    public String getDoneFlag() {
        return doneFlag;
    }

    public void setDoneFlag(String doneFlag) {
        this.doneFlag = doneFlag == null ? null : doneFlag.trim();
    }
}