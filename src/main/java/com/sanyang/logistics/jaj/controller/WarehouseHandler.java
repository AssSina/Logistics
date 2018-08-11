package com.sanyang.logistics.jaj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sanyang.logistics.base.pojo.Warehouse;
import com.sanyang.logistics.base.pojo.WarehouseExample;
import com.sanyang.logistics.base.pojo.WarehouseExample.Criteria;
import com.sanyang.logistics.base.pojo.WarehouseType;
import com.sanyang.logistics.jaj.service.WarehouseService;

@RequestMapping("warehouse")
@Controller
public class WarehouseHandler {

	@Autowired
	private WarehouseService warehouseService;
	
	@RequestMapping("getWarehouse")
	@ResponseBody
	public Object getWarehouse(String name,String whno,String contact){
		WarehouseExample example=new WarehouseExample();
		Criteria criteria = example.createCriteria();
		if (name!=null) {
			criteria.andNameLike("%"+name+"%");
		}
		if (whno!=null) {
			criteria.andWhnoLike("%"+whno+"%");
		}
		if (contact!=null) {
			criteria.andContactLike("%"+contact+"%");
		}
		List<Warehouse> warehouse = warehouseService.getWarehouse(example);
		return warehouse;
	}
	
	@RequestMapping("/insertWarehouse")
	@ResponseBody
	public String insertWarehouse(Warehouse warehouse){
		warehouseService.insertWarehouse(warehouse);
		return "1";
	}
	
	@RequestMapping("/deleteWarehouse")
	@ResponseBody
	public int deleteWarehouse(Integer whId){
		warehouseService.deleteWarehouse(whId);
		return 1;
	}
	
	@RequestMapping("/getWarehouseById")
	@ResponseBody
	public Object getWarehouseById(Integer whId){
		Warehouse warehouse=warehouseService.getWarehouseById(whId);
		return warehouse;
	}
	
	@RequestMapping("/updateWarehouse")
	@ResponseBody
	public int updateWarehouse(Warehouse warehouse){
		warehouseService.updateWarehouse(warehouse);
		return 1;
	}
	
	@RequestMapping("/getWarehouseType")
	@ResponseBody
	public Object getWarehouseType(){
		List<WarehouseType> warehouseTypes=warehouseService.getWarehouseType();
		return warehouseTypes;
	}
}
