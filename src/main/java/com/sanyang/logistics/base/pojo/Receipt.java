package com.sanyang.logistics.base.pojo;

import java.util.Date;

public class Receipt {
    private Integer rcptId;

    private Integer schedId;

    private Integer whId;

    private Date planReceiptDate;

    private Integer statusId;

    private Date createDate;

    private Date updateDate;

    public Integer getRcptId() {
        return rcptId;
    }

    public void setRcptId(Integer rcptId) {
        this.rcptId = rcptId;
    }

    public Integer getSchedId() {
        return schedId;
    }

    public void setSchedId(Integer schedId) {
        this.schedId = schedId;
    }

    public Integer getWhId() {
        return whId;
    }

    public void setWhId(Integer whId) {
        this.whId = whId;
    }

    public Date getPlanReceiptDate() {
        return planReceiptDate;
    }

    public void setPlanReceiptDate(Date planReceiptDate) {
        this.planReceiptDate = planReceiptDate;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
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
}