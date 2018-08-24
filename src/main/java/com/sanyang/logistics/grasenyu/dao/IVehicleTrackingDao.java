package com.sanyang.logistics.grasenyu.dao;

import java.util.List;

import com.sanyang.logistics.base.pojo.TruckDim;

public interface IVehicleTrackingDao {
	List<TruckDim> allTruck(TruckDim r);
	public TruckDim cinfo(Integer id);
	public List<TruckDim> lx(Integer id) ;
	public Long count(Integer id) ;
	void addxy(TruckDim r);
	void updatelocation(TruckDim r);
	TruckDim qz(Integer id);
	TruckDim isF(Integer id);
	
}
