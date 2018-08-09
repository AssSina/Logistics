package com.sanyang.logistics.jaj.service;

import java.util.List;

import com.sanyang.logistics.base.pojo.StandardUnit;
import com.sanyang.logistics.base.pojo.StandardUnitExample;

public interface StandardUnitService {

	List<StandardUnit> getStandardUnit(StandardUnitExample example);

	void insertStandardUnit(StandardUnit standardUnit);

	void deleteStandardUnit(Integer unitid);

	StandardUnit getStandardUnitById(Integer unitid);

	void updateStandardUnit(StandardUnit standardUnit);

}
