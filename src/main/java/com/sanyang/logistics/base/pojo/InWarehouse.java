package com.sanyang.logistics.base.pojo;

public class InWarehouse {
    private Integer inWarehouseId;

    private Integer rcptProdId;

    private Integer rcptId;

    private Integer posnId;

    private String posnCode;

    private Integer storeAmt;

    private String memo;

    private String backupAreaCode;

    private Integer prodId;

    private String packageName;

    public Integer getInWarehouseId() {
        return inWarehouseId;
    }

    public void setInWarehouseId(Integer inWarehouseId) {
        this.inWarehouseId = inWarehouseId;
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

    public String getPosnCode() {
        return posnCode;
    }

    public void setPosnCode(String posnCode) {
        this.posnCode = posnCode == null ? null : posnCode.trim();
    }

    public Integer getStoreAmt() {
        return storeAmt;
    }

    public void setStoreAmt(Integer storeAmt) {
        this.storeAmt = storeAmt;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getBackupAreaCode() {
        return backupAreaCode;
    }

    public void setBackupAreaCode(String backupAreaCode) {
        this.backupAreaCode = backupAreaCode == null ? null : backupAreaCode.trim();
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
}