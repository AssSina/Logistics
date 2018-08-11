package com.sanyang.logistics.jaj.mapper;

import com.sanyang.logistics.base.pojo.ProdPosnBridge;
import com.sanyang.logistics.base.pojo.ProdPosnBridgeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProdPosnBridgeMapper {
    int countByExample(ProdPosnBridgeExample example);

    int deleteByExample(ProdPosnBridgeExample example);

    int deleteByPrimaryKey(Integer oid);

    int insert(ProdPosnBridge record);

    int insertSelective(ProdPosnBridge record);

    List<ProdPosnBridge> selectByExample(ProdPosnBridgeExample example);

    ProdPosnBridge selectByPrimaryKey(Integer oid);

    int updateByExampleSelective(@Param("record") ProdPosnBridge record, @Param("example") ProdPosnBridgeExample example);

    int updateByExample(@Param("record") ProdPosnBridge record, @Param("example") ProdPosnBridgeExample example);

    int updateByPrimaryKeySelective(ProdPosnBridge record);

    int updateByPrimaryKey(ProdPosnBridge record);
}