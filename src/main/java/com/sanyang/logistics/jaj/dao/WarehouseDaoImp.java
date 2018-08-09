package com.sanyang.logistics.jaj.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanyang.logistics.base.pojo.Warehouse;
import com.sanyang.logistics.base.pojo.WarehouseExample;
import com.sanyang.logistics.base.pojo.WarehouseType;
import com.sanyang.logistics.base.pojo.WarehouseTypeExample;
import com.sanyang.logistics.jaj.mapper.WarehouseMapper;
import com.sanyang.logistics.jaj.mapper.WarehouseTypeMapper;
/**
 * 仓库数据访问层实现类
 * @author asus
 *
 */
@Repository("warehouseDao")
public class WarehouseDaoImp implements WarehouseDao {
	
	@Autowired
	private WarehouseMapper warehouseMapper;
	
	@Autowired
	private WarehouseTypeMapper warehouseTypeMapper;

	@Override
	public List<Warehouse> getWarehouse(WarehouseExample example) {
		// TODO Auto-generated method stub
		return warehouseMapper.selectByExample(example);
	}

	@Override
	public void insertWarehouse(Warehouse Warehouse) {
		// TODO Auto-generated method stub
			warehouseMapper.insertSelective(Warehouse);
	}

	@Override
	public void deleteWarehouse(Integer whId) {
		// TODO Auto-generated method stub
			warehouseMapper.deleteByPrimaryKey(whId);
	}

	@Override
	public Warehouse getWarehouseById(Integer whId) {
		// TODO Auto-generated method stub
		return warehouseMapper.selectByPrimaryKey(whId);
	}

	@Override
	public void updateWarehouse(Warehouse Warehouse) {
		// TODO Auto-generated method stub
			warehouseMapper.updateByPrimaryKeySelective(Warehouse);
	}

	@Override
	public List<WarehouseType> getWarehouseType() {
		// TODO Auto-generated method stub
		WarehouseTypeExample example=new WarehouseTypeExample();
		return warehouseTypeMapper.selectByExample(example);
	}

}
