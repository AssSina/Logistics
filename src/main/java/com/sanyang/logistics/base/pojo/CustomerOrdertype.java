package com.sanyang.logistics.base.pojo;

public class CustomerOrdertype {
    private Integer custOrdertypeId;

    private Integer cid;

    private Integer sysordertypeId;

    private Integer name;

    private String description;

    public Integer getCustOrdertypeId() {
        return custOrdertypeId;
    }

    public void setCustOrdertypeId(Integer custOrdertypeId) {
        this.custOrdertypeId = custOrdertypeId;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getSysordertypeId() {
        return sysordertypeId;
    }

    public void setSysordertypeId(Integer sysordertypeId) {
        this.sysordertypeId = sysordertypeId;
    }

    public Integer getName() {
        return name;
    }

    public void setName(Integer name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}