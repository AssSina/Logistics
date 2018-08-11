package com.sanyang.logistics.jaj.dao;

import java.util.List;

import com.sanyang.logistics.base.pojo.StandardUnit;
import com.sanyang.logistics.base.pojo.StandardUnitExample;

public interface StandardUnitDao {

	List<StandardUnit> getStandardUnit(StandardUnitExample example);

	void insertStandardUnit(StandardUnit standardUnit);

	void deleteStandardUnit(Integer unitid);

	StandardUnit getStandardUnitById(Integer unitid);

	void updateStandardUnit(StandardUnit standardUnit);

}
