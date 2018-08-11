package com.sanyang.logistics.base.pojo;

public class Warehouse {
    private Integer whId;

    private Integer typeId;

    private String name;

    private String whno;

    private String address;

    private String principle;

    private Integer height;

    private Integer area;

    private Integer fireproofLevel;

    private Integer whtype;

    private String material;

    private Integer bearingWeigh;

    private String createDate;

    private String updateDate;

    private String contact;

    private String firelevel;

    public Integer getWhId() {
        return whId;
    }

    public void setWhId(Integer whId) {
        this.whId = whId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getWhno() {
        return whno;
    }

    public void setWhno(String whno) {
        this.whno = whno == null ? null : whno.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPrinciple() {
        return principle;
    }

    public void setPrinciple(String principle) {
        this.principle = principle == null ? null : principle.trim();
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getFireproofLevel() {
        return fireproofLevel;
    }

    public void setFireproofLevel(Integer fireproofLevel) {
        this.fireproofLevel = fireproofLevel;
    }

    public Integer getWhtype() {
        return whtype;
    }

    public void setWhtype(Integer whtype) {
        this.whtype = whtype;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material == null ? null : material.trim();
    }

    public Integer getBearingWeigh() {
        return bearingWeigh;
    }

    public void setBearingWeigh(Integer bearingWeigh) {
        this.bearingWeigh = bearingWeigh;
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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getFirelevel() {
        return firelevel;
    }

    public void setFirelevel(String firelevel) {
        this.firelevel = firelevel == null ? null : firelevel.trim();
    }
}