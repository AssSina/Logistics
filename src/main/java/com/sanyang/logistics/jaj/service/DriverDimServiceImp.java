package com.sanyang.logistics.jaj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanyang.logistics.base.pojo.DriverDim;
import com.sanyang.logistics.base.pojo.DriverDimExample;
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
	public List<DriverDim> getDriverDim(DriverDimExample example) {
		// TODO Auto-generated method stub
		return driverDimDao.getDriverDim(example);
	}

	@Override
	public void insertDriverDim(DriverDim driverDim) {
		// TODO Auto-generated method stub
		driverDimDao.insertDriverDim(driverDim);
	}

	@Override
	public void deleteDriverDim(Integer driverId) {
		driverDimDao.deleteDriverDim(driverId);
	}

	@Override
	public DriverDim getDriverDimById(Integer driverId) {
		// TODO Auto-generated method stub
		return driverDimDao.getDriverDimById(driverId);
	}

	@Override
	public void updateDriverDim(DriverDim driverDim) {
		driverDimDao.updateDriverDim(driverDim);
	}

}
