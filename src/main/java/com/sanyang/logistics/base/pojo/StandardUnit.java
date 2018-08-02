package com.sanyang.logistics.base.pojo;

public class StandardUnit {
    private Integer unitid;

    private String name;

    private String description;

    private String catery;

    public Integer getUnitid() {
        return unitid;
    }

    public void setUnitid(Integer unitid) {
        this.unitid = unitid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getCatery() {
        return catery;
    }

    public void setCatery(String catery) {
        this.catery = catery == null ? null : catery.trim();
    }
}