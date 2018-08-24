package com.sanyang.logistics.grasenyu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanyang.logistics.base.pojo.TruckDim;
import com.sanyang.logistics.grasenyu.dao.IVehicleTrackingDao;

@Repository("ordertrackingservice")
public class VehicleTrackingService implements IVehicleTrackingService{

	@Autowired
	IVehicleTrackingDao ordertracking;
	
	
	@Override
	public List<TruckDim> allTruck(TruckDim r) {
		// TODO Auto-generated method stub
		return ordertracking.allTruck(r);
	}


	@Override
	public TruckDim cinfo(Integer id) {
		// TODO Auto-generated method stub
		return ordertracking.cinfo(id);
	}


	@Override
	public List<TruckDim> lx(Integer id) {
		// TODO Auto-generated method stub
		return ordertracking.lx(id);
	}


	@Override
	public Long count(Integer id) {
		// TODO Auto-generated method stub
		return ordertracking.count(id);
	}


	@Override
	public void addxy(TruckDim r) {
		// TODO Auto-generated method stub
		ordertracking.addxy(r);
		
	}


	@Override
	public void updatelocation(TruckDim r) {
		// TODO Auto-generated method stub
		ordertracking.updatelocation(r);
	}


	@Override
	public TruckDim qz(Integer id) {
		// TODO Auto-generated method stub
		return ordertracking.qz(id);
	}


	@Override
	public TruckDim isF(Integer id) {
		// TODO Auto-generated method stub
		return ordertracking.isF(id);
	}
	
	
	
}
