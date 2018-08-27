package com.sanyang.logistics.base.pojo;

import java.util.Date;

public class Pickout {
    private Integer pickoutId;

    private Integer schedId;

    private Integer whId;

    private String planPickoutDate;

    private String statusId;

    private String createDate;

    private String updateDate;

    private String doneFlag;
    
    private String name;
    
    private String dname;
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId == null ? null : statusId.trim();
    }



    public String getDoneFlag() {
        return doneFlag;
    }

    public void setDoneFlag(String doneFlag) {
        this.doneFlag = doneFlag == null ? null : doneFlag.trim();
    }

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getPlanPickoutDate() {
		return planPickoutDate;
	}

	public void setPlanPickoutDate(String planPickoutDate) {
		this.planPickoutDate = planPickoutDate;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	
	

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "Pickout [pickoutId=" + pickoutId + ", schedId=" + schedId + ", whId=" + whId + ", planPickoutDate="
				+ planPickoutDate + ", statusId=" + statusId + ", createDate=" + createDate + ", updateDate="
				+ updateDate + ", doneFlag=" + doneFlag + ", name=" + name + ", dname=" + dname + "]";
	}






    
}