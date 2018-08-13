package com.sanyang.logistics.lxy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanyang.logistics.base.pojo.TruckDim;
import com.sanyang.logistics.lxy.dao.ITruckDimDao;
@Service
public class TruckServiceServiceImpl implements ITruckDimService{
		@Autowired
		private ITruckDimDao truckDimDao;
	
	@Override
	public List<TruckDim> gettru() {
		// TODO Auto-generated method stub
		List<TruckDim> gettru = truckDimDao.gettru();
		return gettru;
	}

}
