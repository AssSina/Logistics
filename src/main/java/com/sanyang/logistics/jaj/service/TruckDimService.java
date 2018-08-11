package com.sanyang.logistics.jaj.service;

import java.util.List;

import com.sanyang.logistics.base.pojo.TruckDim;

/**
 * 车辆的业务层接口
 * @author asus
 *
 */
public interface TruckDimService {

	List<TruckDim> getTruckDim(TruckDim truckDim);

	void insertTruckDim(TruckDim truckDim);

	void deleteTruckDim(Integer truckId);

	TruckDim getTruckDimById(Integer truckId);

	void updateTruckDim(TruckDim truckDim);

	List<TruckDim> getOwnerTypeDimById();

}
