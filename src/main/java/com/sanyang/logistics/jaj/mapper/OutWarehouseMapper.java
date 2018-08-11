package com.sanyang.logistics.jaj.mapper;

import com.sanyang.logistics.base.pojo.OutWarehouse;
import com.sanyang.logistics.base.pojo.OutWarehouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutWarehouseMapper {
    int countByExample(OutWarehouseExample example);

    int deleteByExample(OutWarehouseExample example);

    int deleteByPrimaryKey(Integer outWarehouseId);

    int insert(OutWarehouse record);

    int insertSelective(OutWarehouse record);

    List<OutWarehouse> selectByExample(OutWarehouseExample example);

    OutWarehouse selectByPrimaryKey(Integer outWarehouseId);

    int updateByExampleSelective(@Param("record") OutWarehouse record, @Param("example") OutWarehouseExample example);

    int updateByExample(@Param("record") OutWarehouse record, @Param("example") OutWarehouseExample example);

    int updateByPrimaryKeySelective(OutWarehouse record);

    int updateByPrimaryKey(OutWarehouse record);
}