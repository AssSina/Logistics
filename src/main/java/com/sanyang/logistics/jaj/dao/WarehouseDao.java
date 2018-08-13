package com.sanyang.logistics.jaj.dao;

import java.util.List;

import com.sanyang.logistics.base.pojo.Warehouse;
import com.sanyang.logistics.base.pojo.WarehouseExample;
import com.sanyang.logistics.base.pojo.WarehouseType;
/**
 * 仓库数据访问层接口
 * @author asus
 *
 */
public interface WarehouseDao {

	List<Warehouse> getWarehouse(WarehouseExample example);

	void insertWarehouse(Warehouse Warehouse);

	void deleteWarehouse(Integer whId);

	Warehouse getWarehouseById(Integer whId);

	void updateWarehouse(Warehouse Warehouse);

	List<WarehouseType> getWarehouseType();
}
