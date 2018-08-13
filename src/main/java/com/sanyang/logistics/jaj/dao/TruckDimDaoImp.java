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
	public List<TruckDim> getTruckDim(TruckDim truckDim) {
		// TODO Auto-generated method stub
		
		return truckDimMapper.getTruckDim(truckDim);
	}
	@Override
	public void insertTruckDim(TruckDim truckDim) {
		// TODO Auto-generated method stub
		truckDimMapper.insertSelective(truckDim);
	}
	@Override
	public void deleteTruckDim(Integer truckId) {
		// TODO Auto-generated method stub
		truckDimMapper.deleteByPrimaryKey(truckId);
	}
	@Override
	public TruckDim getTruckDimById(Integer truckId) {
		// TODO Auto-generated method stub
		return truckDimMapper.selectByPrimaryKey(truckId);
	}
	@Override
	public void updateTruckDim(TruckDim truckDim) {
		// TODO Auto-generated method stub
		truckDimMapper.updateByPrimaryKeySelective(truckDim);
	}
	@Override
	public List<TruckDim> getOwnerTypeDimById() {
		// TODO Auto-generated method stub
		return truckDimMapper.getOwnerTypeDimById();
	}

}
