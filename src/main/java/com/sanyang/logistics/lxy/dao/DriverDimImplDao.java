package com.sanyang.logistics.lxy.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanyang.logistics.base.pojo.DriverDim;
import com.sanyang.logistics.lxy.mapper.IDriverDimMepper;
@Repository("driDao")
public class DriverDimImplDao implements IDriverDimDao{
		@Autowired
		private IDriverDimMepper driverDimMapper;
		
	@Override
	public List<DriverDim> getdri() {
		// TODO Auto-generated method stub
		List<DriverDim> getdri = driverDimMapper.getdri();
		return getdri;
	}

}
