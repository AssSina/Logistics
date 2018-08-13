package com.sanyang.logistics.jaj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanyang.logistics.base.pojo.Warehouse;
import com.sanyang.logistics.base.pojo.WarehouseExample;
import com.sanyang.logistics.base.pojo.WarehouseType;
import com.sanyang.logistics.jaj.dao.WarehouseDao;

/**
 * 仓库的业务层实现类
 * @author asus
 *
 */
@Service("warehouseService")
public class WarehouseServiceImp implements WarehouseService{
	
	@Autowired
	private WarehouseDao warehouseDao;
	
	@Override
	public List<Warehouse> getWarehouse(WarehouseExample example) {
		// TODO Auto-generated method stub
		return warehouseDao.getWarehouse(example);
	}

	@Override
	public void insertWarehouse(Warehouse Warehouse) {
		// TODO Auto-generated method stub
		warehouseDao.insertWarehouse(Warehouse);
	}

	@Override
	public void deleteWarehouse(Integer whId) {
		// TODO Auto-generated method stub
		warehouseDao.deleteWarehouse(whId);
	}

	@Override
	public Warehouse getWarehouseById(Integer whId) {
		// TODO Auto-generated method stub
		return warehouseDao.getWarehouseById(whId);
	}

	@Override
	public void updateWarehouse(Warehouse Warehouse) {
		// TODO Auto-generated method stub
		warehouseDao.updateWarehouse(Warehouse);
	}

	@Override
	public List<WarehouseType> getWarehouseType() {
		// TODO Auto-generated method stub
		return warehouseDao.getWarehouseType();
	}

}
