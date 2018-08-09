package com.sanyang.logistics.jaj.dao;

import java.util.List;

import com.sanyang.logistics.base.pojo.BackupArea;

public interface BackupAreaDao {

	List<BackupArea> getBackupArea();

	void insertBackupArea(BackupArea backupArea);

	void deleteBackupArea(Integer backupAreaId);

	BackupArea getBackupAreaById(Integer backupAreaId);

	void updateBackupArea(BackupArea backupArea);

}
