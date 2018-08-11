package com.sanyang.logistics.jaj.mapper;

import com.sanyang.logistics.base.pojo.InWarehouse;
import com.sanyang.logistics.base.pojo.InWarehouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InWarehouseMapper {
    int countByExample(InWarehouseExample example);

    int deleteByExample(InWarehouseExample example);

    int deleteByPrimaryKey(Integer inWarehouseId);

    int insert(InWarehouse record);

    int insertSelective(InWarehouse record);

    List<InWarehouse> selectByExample(InWarehouseExample example);

    InWarehouse selectByPrimaryKey(Integer inWarehouseId);

    int updateByExampleSelective(@Param("record") InWarehouse record, @Param("example") InWarehouseExample example);

    int updateByExample(@Param("record") InWarehouse record, @Param("example") InWarehouseExample example);

    int updateByPrimaryKeySelective(InWarehouse record);

    int updateByPrimaryKey(InWarehouse record);
}