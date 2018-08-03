package com.sanyang.logistics.jaj.mapper;

import com.sanyang.logistics.base.pojo.PrepareInWarehouse;
import com.sanyang.logistics.base.pojo.PrepareInWarehouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrepareInWarehouseMapper {
    int countByExample(PrepareInWarehouseExample example);

    int deleteByExample(PrepareInWarehouseExample example);

    int deleteByPrimaryKey(Integer preind);

    int insert(PrepareInWarehouse record);

    int insertSelective(PrepareInWarehouse record);

    List<PrepareInWarehouse> selectByExample(PrepareInWarehouseExample example);

    PrepareInWarehouse selectByPrimaryKey(Integer preind);

    int updateByExampleSelective(@Param("record") PrepareInWarehouse record, @Param("example") PrepareInWarehouseExample example);

    int updateByExample(@Param("record") PrepareInWarehouse record, @Param("example") PrepareInWarehouseExample example);

    int updateByPrimaryKeySelective(PrepareInWarehouse record);

    int updateByPrimaryKey(PrepareInWarehouse record);
}