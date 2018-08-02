package com.sanyang.logistics.base.pojo;

public class Position {
    private Integer posnId;

    private String posnCode;

    private Integer shelfId;

    private Integer whId;

    private String posnNo;

    private Integer capacity;

    private Integer availableCapacity;

    private Integer occupyAmt;

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

    public Integer getShelfId() {
        return shelfId;
    }

    public void setShelfId(Integer shelfId) {
        this.shelfId = shelfId;
    }

    public Integer getWhId() {
        return whId;
    }

    public void setWhId(Integer whId) {
        this.whId = whId;
    }

    public String getPosnNo() {
        return posnNo;
    }

    public void setPosnNo(String posnNo) {
        this.posnNo = posnNo == null ? null : posnNo.trim();
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getAvailableCapacity() {
        return availableCapacity;
    }

    public void setAvailableCapacity(Integer availableCapacity) {
        this.availableCapacity = availableCapacity;
    }

    public Integer getOccupyAmt() {
        return occupyAmt;
    }

    public void setOccupyAmt(Integer occupyAmt) {
        this.occupyAmt = occupyAmt;
    }
}