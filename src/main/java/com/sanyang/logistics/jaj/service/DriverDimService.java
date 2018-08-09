package com.sanyang.logistics.jaj.service;

import java.util.List;

import com.sanyang.logistics.base.pojo.DriverDim;
import com.sanyang.logistics.base.pojo.DriverDimExample;

/**
 * 司机业务层接口
 * @author asus
 *
 */
public interface DriverDimService {

	List<DriverDim> getDriverDim(DriverDimExample example);

	void insertDriverDim(DriverDim driverDim);

	void deleteDriverDim(Integer driverId);

	DriverDim getDriverDimById(Integer driverId);

	void updateDriverDim(DriverDim driverDim);

}
