package com.sanyang.logistics.jaj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanyang.logistics.base.pojo.TruckDim;
import com.sanyang.logistics.jaj.dao.TruckDimDao;
/**
 * 车辆的业务层实现类
 * @author asus
 *
 */
@Service("truckDimService")
public class TruckDimServiceImp implements TruckDimService{
	
	@Autowired
	private TruckDimDao truckDimDao;
	
	@Override
	public List<TruckDim> getTruckDim(TruckDim truckDim) {
		// TODO Auto-generated method stub
		return truckDimDao.getTruckDim(truckDim);
	}

	@Override
	public void insertTruckDim(TruckDim truckDim) {
		// TODO Auto-generated method stub
		truckDimDao.insertTruckDim(truckDim);
	}

	@Override
	public void deleteTruckDim(Integer truckId) {
		// TODO Auto-generated method stub
		truckDimDao.deleteTruckDim(truckId);
	}

	@Override
	public TruckDim getTruckDimById(Integer truckId) {
		// TODO Auto-generated method stub
		return truckDimDao.getTruckDimById(truckId);
	}

	@Override
	public void updateTruckDim(TruckDim truckDim) {
		// TODO Auto-generated method stub
		truckDimDao.updateTruckDim(truckDim);
	}

	@Override
	public List<TruckDim> getOwnerTypeDimById() {
		// TODO Auto-generated method stub
		return truckDimDao.getOwnerTypeDimById();
	}

}
