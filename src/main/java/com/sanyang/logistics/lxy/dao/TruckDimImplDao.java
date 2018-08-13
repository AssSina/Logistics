package com.sanyang.logistics.lxy.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanyang.logistics.base.pojo.TruckDim;
import com.sanyang.logistics.lxy.mapper.ITruckDimMapper;
@Repository
public class TruckDimImplDao implements ITruckDimDao{
		@Autowired 
		private ITruckDimMapper truckDimmMpper;
	
	@Override
	public List<TruckDim> gettru() {
		// TODO Auto-generated method stub
		List<TruckDim> gettru = truckDimmMpper.gettru();
		return gettru;
	}

}
