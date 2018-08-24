package com.sanyang.logistics.base.pojo;

import java.util.Arrays;

public class Schedule {
    private Integer schedId;

    private Integer regionId;

    private String createDate;

    private String updateDate;

    private String execDoneFlag;

    private Integer schedTypeId;

    private Integer driverType;

    private Integer truckId;

    private Integer driverId;

    private Integer thirdPartyId;

    private String endDate;

    private Integer hacount;

    private Integer pcount;

    private String schstatus;

    private String fromaddress;

    private String toaddress;
    
    private String fromaddresszb;

    private String toaddresszb;

    private String cuname;

    private String cuphone;
    
    private String name;
        
    private Integer workid;
    private Integer nums[];
    private Integer pid;
    private Integer oid;
	private String pname;
	private String pcode;
	private String ptype;
	private String height;
	private String arear;
	private Integer orderid;
	private Integer scount;
	private String provider;
	private String code;
	private String pmodel;
	
	private Integer  odid[];

	public Integer getSchedId() {
		return schedId;
	}

	public void setSchedId(Integer schedId) {
		this.schedId = schedId;
	}

	public Integer getRegionId() {
		return regionId;
	}

	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
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

	public String getExecDoneFlag() {
		return execDoneFlag;
	}

	public void setExecDoneFlag(String execDoneFlag) {
		this.execDoneFlag = execDoneFlag;
	}

	public Integer getSchedTypeId() {
		return schedTypeId;
	}

	public void setSchedTypeId(Integer schedTypeId) {
		this.schedTypeId = schedTypeId;
	}

	public Integer getDriverType() {
		return driverType;
	}

	public void setDriverType(Integer driverType) {
		this.driverType = driverType;
	}

	public Integer getTruckId() {
		return truckId;
	}

	public void setTruckId(Integer truckId) {
		this.truckId = truckId;
	}

	public Integer getDriverId() {
		return driverId;
	}

	public void setDriverId(Integer driverId) {
		this.driverId = driverId;
	}

	public Integer getThirdPartyId() {
		return thirdPartyId;
	}

	public void setThirdPartyId(Integer thirdPartyId) {
		this.thirdPartyId = thirdPartyId;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Integer getHacount() {
		return hacount;
	}

	public void setHacount(Integer hacount) {
		this.hacount = hacount;
	}

	public Integer getPcount() {
		return pcount;
	}

	public void setPcount(Integer pcount) {
		this.pcount = pcount;
	}

	public String getSchstatus() {
		return schstatus;
	}

	public void setSchstatus(String schstatus) {
		this.schstatus = schstatus;
	}

	public String getFromaddress() {
		return fromaddress;
	}

	public void setFromaddress(String fromaddress) {
		this.fromaddress = fromaddress;
	}

	public String getToaddress() {
		return toaddress;
	}

	public void setToaddress(String toaddress) {
		this.toaddress = toaddress;
	}

	public String getFromaddresszb() {
		return fromaddresszb;
	}

	public void setFromaddresszb(String fromaddresszb) {
		this.fromaddresszb = fromaddresszb;
	}

	public String getToaddresszb() {
		return toaddresszb;
	}

	public void setToaddresszb(String toaddresszb) {
		this.toaddresszb = toaddresszb;
	}

	public String getCuname() {
		return cuname;
	}

	public void setCuname(String cuname) {
		this.cuname = cuname;
	}

	public String getCuphone() {
		return cuphone;
	}

	public void setCuphone(String cuphone) {
		this.cuphone = cuphone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getWorkid() {
		return workid;
	}

	public void setWorkid(Integer workid) {
		this.workid = workid;
	}

	public Integer[] getNums() {
		return nums;
	}

	public void setNums(Integer[] nums) {
		this.nums = nums;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Integer getOid() {
		return oid;
	}

	public void setOid(Integer oid) {
		this.oid = oid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	public String getPtype() {
		return ptype;
	}

	public void setPtype(String ptype) {
		this.ptype = ptype;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getArear() {
		return arear;
	}

	public void setArear(String arear) {
		this.arear = arear;
	}

	public Integer getOrderid() {
		return orderid;
	}

	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}

	public Integer getScount() {
		return scount;
	}

	public void setScount(Integer scount) {
		this.scount = scount;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getPmodel() {
		return pmodel;
	}

	public void setPmodel(String pmodel) {
		this.pmodel = pmodel;
	}

	public Integer[] getOdid() {
		return odid;
	}

	public void setOdid(Integer[] odid) {
		this.odid = odid;
	}

	@Override
	public String toString() {
		return "Schedule [schedId=" + schedId + ", regionId=" + regionId + ", createDate=" + createDate
				+ ", updateDate=" + updateDate + ", execDoneFlag=" + execDoneFlag + ", schedTypeId=" + schedTypeId
				+ ", driverType=" + driverType + ", truckId=" + truckId + ", driverId=" + driverId + ", thirdPartyId="
				+ thirdPartyId + ", endDate=" + endDate + ", hacount=" + hacount + ", pcount=" + pcount + ", schstatus="
				+ schstatus + ", fromaddress=" + fromaddress + ", toaddress=" + toaddress + ", fromaddresszb="
				+ fromaddresszb + ", toaddresszb=" + toaddresszb + ", cuname=" + cuname + ", cuphone=" + cuphone
				+ ", name=" + name + ", workid=" + workid + ", nums=" + Arrays.toString(nums) + ", pid=" + pid
				+ ", oid=" + oid + ", pname=" + pname + ", pcode=" + pcode + ", ptype=" + ptype + ", height=" + height
				+ ", arear=" + arear + ", orderid=" + orderid + ", scount=" + scount + ", provider=" + provider
				+ ", code=" + code + ", pmodel=" + pmodel + ", odid=" + Arrays.toString(odid) + "]";
	}

	
}