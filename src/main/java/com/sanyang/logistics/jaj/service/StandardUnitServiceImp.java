package com.sanyang.logistics.jaj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanyang.logistics.base.pojo.StandardUnit;
import com.sanyang.logistics.base.pojo.StandardUnitExample;
import com.sanyang.logistics.jaj.dao.StandardUnitDao;

@Service("standardUnitService")
public class StandardUnitServiceImp implements StandardUnitService {
	
	@Autowired
	private StandardUnitDao standardUnitDao;
	
	@Override
	public List<StandardUnit> getStandardUnit(StandardUnitExample example) {
		// TODO Auto-generated method stub
		return standardUnitDao.getStandardUnit(example);
	}

	@Override
	public void insertStandardUnit(StandardUnit standardUnit) {
		// TODO Auto-generated method stub
		standardUnitDao.insertStandardUnit(standardUnit);
	}

	@Override
	public void deleteStandardUnit(Integer unitid) {
		// TODO Auto-generated method stub
		standardUnitDao.deleteStandardUnit(unitid);
	}

	@Override
	public StandardUnit getStandardUnitById(Integer unitid) {
		// TODO Auto-generated method stub
		return standardUnitDao.getStandardUnitById(unitid);
	}

	@Override
	public void updateStandardUnit(StandardUnit standardUnit) {
		// TODO Auto-generated method stub
		standardUnitDao.updateStandardUnit(standardUnit);
	}

}
