package com.sanyang.logistics.jaj.mapper;

import com.sanyang.logistics.base.pojo.WarehouseType;
import com.sanyang.logistics.base.pojo.WarehouseTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WarehouseTypeMapper {
    int countByExample(WarehouseTypeExample example);

    int deleteByExample(WarehouseTypeExample example);

    int deleteByPrimaryKey(Integer typeId);

    int insert(WarehouseType record);

    int insertSelective(WarehouseType record);

    List<WarehouseType> selectByExample(WarehouseTypeExample example);

    WarehouseType selectByPrimaryKey(Integer typeId);

    int updateByExampleSelective(@Param("record") WarehouseType record, @Param("example") WarehouseTypeExample example);

    int updateByExample(@Param("record") WarehouseType record, @Param("example") WarehouseTypeExample example);

    int updateByPrimaryKeySelective(WarehouseType record);

    int updateByPrimaryKey(WarehouseType record);
}