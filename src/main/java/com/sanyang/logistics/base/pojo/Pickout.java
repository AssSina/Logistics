package com.sanyang.logistics.base.pojo;

import java.util.Date;

public class Pickout {
    private Integer pickoutId;

    private Integer schedId;

    private Integer whId;

    private Date planPickoutDate;

    private String statusId;

    private Date createDate;

    private Date updateDate;

    private String doneFlag;

    public Integer getPickoutId() {
        return pickoutId;
    }

    public void setPickoutId(Integer pickoutId) {
        this.pickoutId = pickoutId;
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

    public Date getPlanPickoutDate() {
        return planPickoutDate;
    }

    public void setPlanPickoutDate(Date planPickoutDate) {
        this.planPickoutDate = planPickoutDate;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId == null ? null : statusId.trim();
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

    public String getDoneFlag() {
        return doneFlag;
    }

    public void setDoneFlag(String doneFlag) {
        this.doneFlag = doneFlag == null ? null : doneFlag.trim();
    }
}