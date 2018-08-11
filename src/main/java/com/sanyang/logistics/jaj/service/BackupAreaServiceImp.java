package com.sanyang.logistics.jaj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanyang.logistics.base.pojo.BackupArea;
import com.sanyang.logistics.jaj.dao.BackupAreaDao;

@Service("backupAreaService")
public class BackupAreaServiceImp implements BackupAreaService {
	
	@Autowired
	private BackupAreaDao backupAreaDao;

	@Override
	public List<BackupArea> getBackupArea() {
		// TODO Auto-generated method stub
		return backupAreaDao.getBackupArea();
	}

	@Override
	public void insertBackupArea(BackupArea backupArea) {
		// TODO Auto-generated method stub
		backupAreaDao.insertBackupArea(backupArea);
	}

	@Override
	public void deleteBackupArea(Integer backupAreaId) {
		// TODO Auto-generated method stub
		backupAreaDao.deleteBackupArea(backupAreaId);
	}

	@Override
	public BackupArea getBackupAreaById(Integer backupAreaId) {
		// TODO Auto-generated method stub
		return backupAreaDao.getBackupAreaById(backupAreaId);
	}

	@Override
	public void updateBackupArea(BackupArea backupArea) {
		// TODO Auto-generated method stub
		backupAreaDao.updateBackupArea(backupArea);
	}

}
