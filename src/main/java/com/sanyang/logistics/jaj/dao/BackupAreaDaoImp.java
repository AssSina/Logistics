package com.sanyang.logistics.jaj.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanyang.logistics.base.pojo.BackupArea;
import com.sanyang.logistics.jaj.mapper.BackupAreaMapper;

@Repository("backupAreaDao")
public class BackupAreaDaoImp implements BackupAreaDao {

	@Autowired
	private BackupAreaMapper backupAreaMapper;
	
	@Override
	public List<BackupArea> getBackupArea(Integer whId) {
		// TODO Auto-generated method stub
//		BackupAreaExample example=new BackupAreaExample();
		return backupAreaMapper.getBackupArea(whId);
	}

	@Override
	public void insertBackupArea(BackupArea backupArea) {
		// TODO Auto-generated method stub
		backupAreaMapper.insertSelective(backupArea);
	}

	@Override
	public void deleteBackupArea(Integer backupAreaId) {
		// TODO Auto-generated method stub
		backupAreaMapper.deleteByPrimaryKey(backupAreaId);
	}

	@Override
	public BackupArea getBackupAreaById(Integer backupAreaId) {
		// TODO Auto-generated method stub
		return backupAreaMapper.selectByPrimaryKey(backupAreaId);
	}

	@Override
	public void updateBackupArea(BackupArea backupArea) {
		// TODO Auto-generated method stub
		backupAreaMapper.updateByPrimaryKeySelective(backupArea);
	}

}
