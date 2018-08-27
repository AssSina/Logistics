package com.sanyang.logistics.base.pojo;

import java.util.Date;

public class Receipt {
    private Integer rcptId;

    private Integer schedId;

    private Integer whId;

    private String planReceiptDate;

    private Integer statusId;

    private Date createDate;

    private Date updateDate;
    
    private String sname;
    
    private String  xname;
    
    private String  name;
    
    
    public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

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



    public String getPlanReceiptDate() {
		return planReceiptDate;
	}

	public void setPlanReceiptDate(String planReceiptDate) {
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
    

	public String getXname() {
		return xname;
	}

	public void setXname(String xname) {
		this.xname = xname;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Receipt [rcptId=" + rcptId + ", schedId=" + schedId + ", whId=" + whId + ", planReceiptDate="
				+ planReceiptDate + ", statusId=" + statusId + ", createDate=" + createDate + ", updateDate="
				+ updateDate + ", sname=" + sname + ", xname=" + xname + ", name=" + name + "]";
	}




    
    
}