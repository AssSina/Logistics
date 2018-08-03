package com.sanyang.logistics.jaj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanyang.logistics.base.pojo.DriverDim;
import com.sanyang.logistics.jaj.dao.DriverDimDao;

/**
 * 司机业务层实现类
 * @author asus
 *
 */
@Service("driverDimService")
public class DriverDimServiceImp implements DriverDimService {
	
	@Autowired
	private DriverDimDao driverDimDao;
	
	@Override
	public List<DriverDim> getDriverDim() {
		// TODO Auto-generated method stub
		return driverDimDao.getDriverDim();
	}

}
