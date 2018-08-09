package com.sanyang.logistics.jaj.dao;

import java.util.List;

import com.sanyang.logistics.base.pojo.DriverDim;
import com.sanyang.logistics.base.pojo.DriverDimExample;

/**
 * 司机数据访问层接口
 * @author asus
 *
 */
public interface DriverDimDao {

	List<DriverDim> getDriverDim(DriverDimExample example);

	void insertDriverDim(DriverDim driverDim);

	void deleteDriverDim(Integer driverId);

	DriverDim getDriverDimById(Integer driverId);

	void updateDriverDim(DriverDim driverDim);

}
