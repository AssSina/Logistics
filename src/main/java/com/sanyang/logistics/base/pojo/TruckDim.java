package com.sanyang.logistics.base.pojo;


public class TruckDim {
    private Integer truckId;

    private String license;

    private String carryCapcty;

    private Integer ownerTypeId;

    private String createDate;

    private String updateDate;

    private String trucktype;

    private String truckstatus;

    private String trucklocation;

    private Integer truckage;
    
    private String name;
    

	 private String fromaddress;
	 private String toaddress;
	 private String end_date;
	 private String coord_id;
	 private String coord_name;
	 private String coord_xy;
	 private String fromaddresszb;
	 private String toaddresszb;
	public Integer getTruckId() {
		return truckId;
	}
	public void setTruckId(Integer truckId) {
		this.truckId = truckId;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public String getCarryCapcty() {
		return carryCapcty;
	}
	public void setCarryCapcty(String carryCapcty) {
		this.carryCapcty = carryCapcty;
	}
	public Integer getOwnerTypeId() {
		return ownerTypeId;
	}
	public void setOwnerTypeId(Integer ownerTypeId) {
		this.ownerTypeId = ownerTypeId;
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
	public String getTrucktype() {
		return trucktype;
	}
	public void setTrucktype(String trucktype) {
		this.trucktype = trucktype;
	}
	public String getTruckstatus() {
		return truckstatus;
	}
	public void setTruckstatus(String truckstatus) {
		this.truckstatus = truckstatus;
	}
	public String getTrucklocation() {
		return trucklocation;
	}
	public void setTrucklocation(String trucklocation) {
		this.trucklocation = trucklocation;
	}
	public Integer getTruckage() {
		return truckage;
	}
	public void setTruckage(Integer truckage) {
		this.truckage = truckage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	public String getCoord_id() {
		return coord_id;
	}
	public void setCoord_id(String coord_id) {
		this.coord_id = coord_id;
	}
	public String getCoord_name() {
		return coord_name;
	}
	public void setCoord_name(String coord_name) {
		this.coord_name = coord_name;
	}
	public String getCoord_xy() {
		return coord_xy;
	}
	public void setCoord_xy(String coord_xy) {
		this.coord_xy = coord_xy;
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
	@Override
	public String toString() {
		return "TruckDim [truckId=" + truckId + ", license=" + license + ", carryCapcty=" + carryCapcty
				+ ", ownerTypeId=" + ownerTypeId + ", createDate=" + createDate + ", updateDate=" + updateDate
				+ ", trucktype=" + trucktype + ", truckstatus=" + truckstatus + ", trucklocation=" + trucklocation
				+ ", truckage=" + truckage + ", name=" + name + ", fromaddress=" + fromaddress + ", toaddress="
				+ toaddress + ", end_date=" + end_date + ", coord_id=" + coord_id + ", coord_name=" + coord_name
				+ ", coord_xy=" + coord_xy + ", fromaddresszb=" + fromaddresszb + ", toaddresszb=" + toaddresszb + "]";
	}
	 
	 

}