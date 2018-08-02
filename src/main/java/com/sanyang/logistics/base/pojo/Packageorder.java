package com.sanyang.logistics.base.pojo;

public class Packageorder {
    private Integer orderId;

    private Integer directionId;

    private Integer whId;

    private Integer custPackageId;

    private Integer packageAmt;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getDirectionId() {
        return directionId;
    }

    public void setDirectionId(Integer directionId) {
        this.directionId = directionId;
    }

    public Integer getWhId() {
        return whId;
    }

    public void setWhId(Integer whId) {
        this.whId = whId;
    }

    public Integer getCustPackageId() {
        return custPackageId;
    }

    public void setCustPackageId(Integer custPackageId) {
        this.custPackageId = custPackageId;
    }

    public Integer getPackageAmt() {
        return packageAmt;
    }

    public void setPackageAmt(Integer packageAmt) {
        this.packageAmt = packageAmt;
    }
}