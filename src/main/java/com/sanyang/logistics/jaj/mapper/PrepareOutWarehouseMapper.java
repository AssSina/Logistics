package com.sanyang.logistics.jaj.mapper;

import com.sanyang.logistics.base.pojo.PrepareOutWarehouse;
import com.sanyang.logistics.base.pojo.PrepareOutWarehouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrepareOutWarehouseMapper {
    int countByExample(PrepareOutWarehouseExample example);

    int deleteByExample(PrepareOutWarehouseExample example);

    int deleteByPrimaryKey(Integer preoutId);

    int insert(PrepareOutWarehouse record);

    int insertSelective(PrepareOutWarehouse record);

    List<PrepareOutWarehouse> selectByExample(PrepareOutWarehouseExample example);

    PrepareOutWarehouse selectByPrimaryKey(Integer preoutId);

    int updateByExampleSelective(@Param("record") PrepareOutWarehouse record, @Param("example") PrepareOutWarehouseExample example);

    int updateByExample(@Param("record") PrepareOutWarehouse record, @Param("example") PrepareOutWarehouseExample example);

    int updateByPrimaryKeySelective(PrepareOutWarehouse record);

    int updateByPrimaryKey(PrepareOutWarehouse record);
}