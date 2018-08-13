package com.sanyang.logistics.base.pojo;

public class Product {
    private Integer pid;

    private String pname;

    private String catery;

    private String pmodel;

    private String code;

    private String provider;

    private String createDate;

    private String updateDate;

    private Integer packageId;

    private String status;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public String getCatery() {
        return catery;
    }

    public void setCatery(String catery) {
        this.catery = catery == null ? null : catery.trim();
    }

    public String getPmodel() {
        return pmodel;
    }

    public void setPmodel(String pmodel) {
        this.pmodel = pmodel == null ? null : pmodel.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider == null ? null : provider.trim();
    }


	public Integer getPackageId() {
        return packageId;
    }

    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
    
    
}