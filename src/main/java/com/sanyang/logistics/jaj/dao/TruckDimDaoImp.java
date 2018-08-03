package com.sanyang.logistics.jaj.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanyang.logistics.base.pojo.TruckDim;
import com.sanyang.logistics.jaj.mapper.TruckDimMapper;
/**
 * 车辆数据访问层实现类
 * @author asus
 *
 */
@Repository("truckDimDao")
public class TruckDimDaoImp implements TruckDimDao{

	@Autowired
	private TruckDimMapper truckDimMapper;
	@Override
	public List<TruckDim> getTruckDim() {
		// TODO Auto-generated method stub
		
		return truckDimMapper.getTruckDim();
	}

}
