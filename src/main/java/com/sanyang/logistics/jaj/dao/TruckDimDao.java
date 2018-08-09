package com.sanyang.logistics.jaj.dao;

import java.util.List;

import com.sanyang.logistics.base.pojo.TruckDim;
/**
 * 车辆数据访问层接口
 * @author asus
 *
 */
public interface TruckDimDao {

	List<TruckDim> getTruckDim(TruckDim truckDim);

	void insertTruckDim(TruckDim truckDim);

	void deleteTruckDim(Integer truckId);

	TruckDim getTruckDimById(Integer truckId);

	void updateTruckDim(TruckDim truckDim);

	List<TruckDim> getOwnerTypeDimById();
}
