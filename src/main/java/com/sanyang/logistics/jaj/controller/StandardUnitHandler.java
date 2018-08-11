package com.sanyang.logistics.jaj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sanyang.logistics.base.pojo.StandardUnit;
import com.sanyang.logistics.base.pojo.StandardUnitExample;
import com.sanyang.logistics.base.pojo.StandardUnitExample.Criteria;
import com.sanyang.logistics.jaj.service.StandardUnitService;
/**
 * 仓库通道控制层
 * @author asus
 *
 */
@Controller
@RequestMapping("/standardUnit")
public class StandardUnitHandler {
	
	@Autowired
	private StandardUnitService standardUnitService;
	
	@RequestMapping("/getStandardUnit")
	@ResponseBody
	public Object getStandardUnit(String name,String catery){
		StandardUnitExample example=new StandardUnitExample();
		Criteria criteria = example.createCriteria();
		criteria.andNameLike("%"+name+"%");
		if (catery!=null && catery!="") {
			criteria.andCateryEqualTo(catery);
		}
		List<StandardUnit> standardUnits=standardUnitService.getStandardUnit(example);
		return standardUnits;
	}
	
	@RequestMapping("/insertStandardUnit")
	@ResponseBody
	public String insertStandardUnit(StandardUnit standardUnit){
		standardUnitService.insertStandardUnit(standardUnit);
		return "1";
	}
	
	@RequestMapping("/deleteStandardUnit")
	@ResponseBody
	public int deleteStandardUnit(Integer unitid){
		standardUnitService.deleteStandardUnit(unitid);
		return 1;
	}
	
	@RequestMapping("/getStandardUnitById")
	@ResponseBody
	public Object getStandardUnitById(Integer unitid){
		StandardUnit standardUnit=standardUnitService.getStandardUnitById(unitid);
		return standardUnit;
	}
	
	@RequestMapping("/updateStandardUnit")
	@ResponseBody
	public int updateStandardUnit(StandardUnit standardUnit){
		standardUnitService.updateStandardUnit(standardUnit);
		return 1;
	}
}
