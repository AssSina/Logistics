package com.sanyang.logistics.base.pojo;

public class ScheduleType {
    private Integer schedTypeId;

    private String name;

    private String description;

    public Integer getSchedTypeId() {
        return schedTypeId;
    }

    public void setSchedTypeId(Integer schedTypeId) {
        this.schedTypeId = schedTypeId;
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
}