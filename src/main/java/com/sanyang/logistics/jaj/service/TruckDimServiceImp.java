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
	public List<TruckDim> getTruckDim() {
		// TODO Auto-generated method stub
		return truckDimDao.getTruckDim();
	}

}
