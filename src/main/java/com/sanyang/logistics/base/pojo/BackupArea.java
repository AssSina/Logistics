package com.sanyang.logistics.base.pojo;

public class BackupArea {
    private Integer backupAreaId;

    private String name;

    private String code;

    private Integer whId;

    public Integer getBackupAreaId() {
        return backupAreaId;
    }

    public void setBackupAreaId(Integer backupAreaId) {
        this.backupAreaId = backupAreaId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Integer getWhId() {
        return whId;
    }

    public void setWhId(Integer whId) {
        this.whId = whId;
    }
}