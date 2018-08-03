package com.sanyang.logistics.jaj.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanyang.logistics.base.pojo.DriverDim;
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
	public List<DriverDim> getDriverDim() {
		// TODO Auto-generated method stub
		return driverDimMapper.getDriverDim();
	}

}
