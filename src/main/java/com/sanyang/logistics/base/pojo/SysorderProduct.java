package com.sanyang.logistics.base.pojo;

import java.util.Date;

public class SysorderProduct {
    private Integer oid;

    private Integer orderid;

    private Integer prodId;

    private Integer pcount;

    private Integer scount;

    private String cusOrderNo;

    private Integer parentOid;

    private Integer custId;

    private Integer sysOrderTypeId;

    private Integer custOrderTypeId;

    private String fromAddress;

    private String toAddress;
    
    private String toCustomer;

    private Integer fromWarehouse;

    private Integer toWarehouse;

    private Integer orderStatus;

    private Integer productCount;

    private String trucktype;

    private String planTrsprtDate;

    private String planArrivalDate;

    private String planOutDate;

    private String planInDate;

    private String contactPhone;

    private String contactPerson;

    private String takeMoneyFlag;

    private String truckflag;

    private Integer regionId;

    private String createtime;

    private String description;

    private String createperson;
    
    private Integer pid;

    private String pname;

    private String catery;

    private String pmodel;

    private String code;

    private String provider;


    private Integer packageId;

    private String status;

    private String rules;

    private String ruleDescription;

    private Double unitWeight;

    private Float unitVolume;

    private Float unitLength;

    private Float unitWidth;

    private Float unitHeight;

    private String unitFlag;

    private Date createDate;

    private Date updateDate;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getProdId() {
        return prodId;
    }

    public String getCusOrderNo() {
		return cusOrderNo;
	}

	public void setCusOrderNo(String cusOrderNo) {
		this.cusOrderNo = cusOrderNo;
	}

	public Integer getParentOid() {
		return parentOid;
	}

	public void setParentOid(Integer parentOid) {
		this.parentOid = parentOid;
	}

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public Integer getSysOrderTypeId() {
		return sysOrderTypeId;
	}

	public void setSysOrderTypeId(Integer sysOrderTypeId) {
		this.sysOrderTypeId = sysOrderTypeId;
	}

	public Integer getCustOrderTypeId() {
		return custOrderTypeId;
	}

	public void setCustOrderTypeId(Integer custOrderTypeId) {
		this.custOrderTypeId = custOrderTypeId;
	}

	public String getFromAddress() {
		return fromAddress;
	}

	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}

	public String getToAddress() {
		return toAddress;
	}

	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}

	public String getToCustomer() {
		return toCustomer;
	}

	public void setToCustomer(String toCustomer) {
		this.toCustomer = toCustomer;
	}

	public Integer getFromWarehouse() {
		return fromWarehouse;
	}

	public void setFromWarehouse(Integer fromWarehouse) {
		this.fromWarehouse = fromWarehouse;
	}

	public Integer getToWarehouse() {
		return toWarehouse;
	}

	public void setToWarehouse(Integer toWarehouse) {
		this.toWarehouse = toWarehouse;
	}

	public Integer getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Integer getProductCount() {
		return productCount;
	}

	public void setProductCount(Integer productCount) {
		this.productCount = productCount;
	}

	public String getTrucktype() {
		return trucktype;
	}

	public void setTrucktype(String trucktype) {
		this.trucktype = trucktype;
	}

	public String getPlanTrsprtDate() {
		return planTrsprtDate;
	}

	public void setPlanTrsprtDate(String planTrsprtDate) {
		this.planTrsprtDate = planTrsprtDate;
	}

	public String getPlanArrivalDate() {
		return planArrivalDate;
	}

	public void setPlanArrivalDate(String planArrivalDate) {
		this.planArrivalDate = planArrivalDate;
	}

	public String getPlanOutDate() {
		return planOutDate;
	}

	public void setPlanOutDate(String planOutDate) {
		this.planOutDate = planOutDate;
	}

	public String getPlanInDate() {
		return planInDate;
	}

	public void setPlanInDate(String planInDate) {
		this.planInDate = planInDate;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getTakeMoneyFlag() {
		return takeMoneyFlag;
	}

	public void setTakeMoneyFlag(String takeMoneyFlag) {
		this.takeMoneyFlag = takeMoneyFlag;
	}

	public String getTruckflag() {
		return truckflag;
	}

	public void setTruckflag(String truckflag) {
		this.truckflag = truckflag;
	}

	public Integer getRegionId() {
		return regionId;
	}

	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreateperson() {
		return createperson;
	}

	public void setCreateperson(String createperson) {
		this.createperson = createperson;
	}

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
		this.pname = pname;
	}

	public String getCatery() {
		return catery;
	}

	public void setCatery(String catery) {
		this.catery = catery;
	}

	public String getPmodel() {
		return pmodel;
	}

	public void setPmodel(String pmodel) {
		this.pmodel = pmodel;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
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
		this.status = status;
	}

	public String getRules() {
		return rules;
	}

	public void setRules(String rules) {
		this.rules = rules;
	}

	public String getRuleDescription() {
		return ruleDescription;
	}

	public void setRuleDescription(String ruleDescription) {
		this.ruleDescription = ruleDescription;
	}

	public Double getUnitWeight() {
		return unitWeight;
	}

	public void setUnitWeight(Double unitWeight) {
		this.unitWeight = unitWeight;
	}

	public Float getUnitVolume() {
		return unitVolume;
	}

	public void setUnitVolume(Float unitVolume) {
		this.unitVolume = unitVolume;
	}

	public Float getUnitLength() {
		return unitLength;
	}

	public void setUnitLength(Float unitLength) {
		this.unitLength = unitLength;
	}

	public Float getUnitWidth() {
		return unitWidth;
	}

	public void setUnitWidth(Float unitWidth) {
		this.unitWidth = unitWidth;
	}

	public Float getUnitHeight() {
		return unitHeight;
	}

	public void setUnitHeight(Float unitHeight) {
		this.unitHeight = unitHeight;
	}

	public String getUnitFlag() {
		return unitFlag;
	}

	public void setUnitFlag(String unitFlag) {
		this.unitFlag = unitFlag;
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

	public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    public Integer getPcount() {
        return pcount;
    }

    public void setPcount(Integer pcount) {
        this.pcount = pcount;
    }

    public Integer getScount() {
        return scount;
    }

    public void setScount(Integer scount) {
        this.scount = scount;
    }
}