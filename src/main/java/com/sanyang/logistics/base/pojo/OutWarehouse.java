package com.sanyang.logistics.base.pojo;

public class OutWarehouse {
    private Integer outWarehouseId;

    private Integer pickoutProdId;

    private Integer pickoutId;

    private Integer posnId;

    private String posnCode;

    private Integer prodId;

    private String packageName;

    private Integer outAmt;

    private String backupAreaCode;

    public Integer getOutWarehouseId() {
        return outWarehouseId;
    }

    public void setOutWarehouseId(Integer outWarehouseId) {
        this.outWarehouseId = outWarehouseId;
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

    public String getPosnCode() {
        return posnCode;
    }

    public void setPosnCode(String posnCode) {
        this.posnCode = posnCode == null ? null : posnCode.trim();
    }

    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName == null ? null : packageName.trim();
    }

    public Integer getOutAmt() {
        return outAmt;
    }

    public void setOutAmt(Integer outAmt) {
        this.outAmt = outAmt;
    }

    public String getBackupAreaCode() {
        return backupAreaCode;
    }

    public void setBackupAreaCode(String backupAreaCode) {
        this.backupAreaCode = backupAreaCode == null ? null : backupAreaCode.trim();
    }
}