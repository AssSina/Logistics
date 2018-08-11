package com.sanyang.logistics.jaj.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanyang.logistics.base.pojo.DriverDim;
import com.sanyang.logistics.base.pojo.DriverDimExample;
import com.sanyang.logistics.jaj.mapper.DriverDimMapper;

/**
 * 司机数据访问层实现类
 * @author asus
 *
 */
@Repository("driverDimDao")
public class DriverDimDaoImp implements DriverDimDao {
	
	@Autowired
	private DriverDimMapper driverDimMapper;
	
	@Override
	public List<DriverDim> getDriverDim(DriverDimExample example) {
		return driverDimMapper.selectByExample(example);
	}
	
	
	@Override
	public void insertDriverDim(DriverDim driverDim) {
		driverDimMapper.insertSelective(driverDim);
	}

	@Override
	public void deleteDriverDim(Integer driverId) {
		driverDimMapper.deleteByPrimaryKey(driverId);
	}

	@Override
	public DriverDim getDriverDimById(Integer driverId) {
		// TODO Auto-generated method stub
		return driverDimMapper.selectByPrimaryKey(driverId);
	}

	@Override
	public void updateDriverDim(DriverDim driverDim) {
		// TODO Auto-generated method stub
		driverDimMapper.updateByPrimaryKeySelective(driverDim);
	}

}
