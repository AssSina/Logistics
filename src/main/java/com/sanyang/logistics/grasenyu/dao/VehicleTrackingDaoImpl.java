package com.sanyang.logistics.grasenyu.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanyang.logistics.base.pojo.TruckDim;
import com.sanyang.logistics.grasenyu.mapper.VehicleTrackingMapper;

@Repository("ordertracking")
public class VehicleTrackingDaoImpl implements IVehicleTrackingDao {
	
	@Autowired
	VehicleTrackingMapper ve;
	
	@Override
	public List<TruckDim> allTruck(TruckDim r ) {
		// TODO Auto-generated method stub
		return ve.allTruck(r);
	}

	@Override
	public TruckDim cinfo(Integer id) {
		// TODO Auto-generated method stub
		return ve.cinfo(id);
	}

	@Override
	public List<TruckDim> lx(Integer id) {
		// TODO Auto-generated method stub
		return ve.lx(id);
	}

	@Override
	public Long count(Integer id) {
		// TODO Auto-generated method stub
		return ve.count(id);
	}

	@Override
	public void addxy(TruckDim r) {
		// TODO Auto-generated method stub
		ve.addxy(r);
	}

	@Override
	public void updatelocation(TruckDim r) {
		// TODO Auto-generated method stub
		ve.updatelocation(r);
	}

	@Override
	public TruckDim qz(Integer id) {
		// TODO Auto-generated method stub
		return ve.qz(id);
	}

	@Override
	public TruckDim isF(Integer id) {
		// TODO Auto-generated method stub
		return ve.isF(id);
	}
	
	
}
