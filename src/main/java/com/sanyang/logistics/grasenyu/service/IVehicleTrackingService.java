package com.sanyang.logistics.grasenyu.service;

import java.util.List;

import com.sanyang.logistics.base.pojo.TruckDim;

public interface IVehicleTrackingService {
	List<TruckDim> allTruck(TruckDim r);
	TruckDim cinfo(Integer id);
	List<TruckDim> lx(Integer id);
	Long count(Integer id);
	void addxy(TruckDim r);
	void updatelocation(TruckDim r);
	TruckDim qz(Integer id);
	TruckDim isF(Integer id);

}
