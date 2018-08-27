package com.sanyang.logistics.lxy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanyang.logistics.base.pojo.DriverDim;
import com.sanyang.logistics.lxy.dao.IDriverDimDao;
@Service
public class DriverDimServiceImpl implements IDrvierDimService{
		@Autowired
		private IDriverDimDao driDao;
	
	@Override
	public List<DriverDim> getpri() {
		// TODO Auto-generated method stub
		List<DriverDim> getdri = driDao.getdri();
		return getdri;
	}

}
