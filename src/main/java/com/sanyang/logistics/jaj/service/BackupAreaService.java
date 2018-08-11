package com.sanyang.logistics.jaj.service;

import java.util.List;

import com.sanyang.logistics.base.pojo.BackupArea;

public interface BackupAreaService {

	List<BackupArea> getBackupArea();

	void insertBackupArea(BackupArea backupArea);

	void deleteBackupArea(Integer backupAreaId);

	BackupArea getBackupAreaById(Integer backupAreaId);

	void updateBackupArea(BackupArea backupArea);

}
