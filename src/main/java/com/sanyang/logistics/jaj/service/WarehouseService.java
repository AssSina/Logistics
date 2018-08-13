package com.sanyang.logistics.jaj.service;

import java.util.List;

import com.sanyang.logistics.base.pojo.Warehouse;
import com.sanyang.logistics.base.pojo.WarehouseExample;
import com.sanyang.logistics.base.pojo.WarehouseType;
/**
 * 仓库业务层接口
 * @author asus
 *
 */
public interface WarehouseService {

	List<Warehouse> getWarehouse(WarehouseExample example);

	void insertWarehouse(Warehouse Warehouse);

	void deleteWarehouse(Integer whId);

	Warehouse getWarehouseById(Integer whId);

	void updateWarehouse(Warehouse Warehouse);

	List<WarehouseType> getWarehouseType();
}
