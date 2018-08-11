package com.sanyang.logistics.jaj.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanyang.logistics.base.pojo.StandardUnit;
import com.sanyang.logistics.base.pojo.StandardUnitExample;
import com.sanyang.logistics.jaj.mapper.StandardUnitMapper;

@Repository("standardUnitDao")
public class StandardUnitDaoImp implements StandardUnitDao {
	
	@Autowired
	private StandardUnitMapper standardUnitMapper;
	
	@Override
	public List<StandardUnit> getStandardUnit(StandardUnitExample example) {
		// TODO Auto-generated method stub
		return standardUnitMapper.selectByExample(example);
	}

	@Override
	public void insertStandardUnit(StandardUnit standardUnit) {
		// TODO Auto-generated method stub
		standardUnitMapper.insertSelective(standardUnit);
	}

	@Override
	public void deleteStandardUnit(Integer unitid) {
		// TODO Auto-generated method stub
		standardUnitMapper.deleteByPrimaryKey(unitid);
	}

	@Override
	public StandardUnit getStandardUnitById(Integer unitid) {
		// TODO Auto-generated method stub
		return standardUnitMapper.selectByPrimaryKey(unitid);
	}

	@Override
	public void updateStandardUnit(StandardUnit standardUnit) {
		// TODO Auto-generated method stub
		standardUnitMapper.updateByPrimaryKeySelective(standardUnit);
	}

}
