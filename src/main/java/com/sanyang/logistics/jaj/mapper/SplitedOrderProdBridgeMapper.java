package com.sanyang.logistics.jaj.mapper;

import com.sanyang.logistics.base.pojo.SplitedOrderProdBridge;
import com.sanyang.logistics.base.pojo.SplitedOrderProdBridgeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SplitedOrderProdBridgeMapper {
    int countByExample(SplitedOrderProdBridgeExample example);

    int deleteByExample(SplitedOrderProdBridgeExample example);

    int deleteByPrimaryKey(Integer oid);

    int insert(SplitedOrderProdBridge record);

    int insertSelective(SplitedOrderProdBridge record);

    List<SplitedOrderProdBridge> selectByExample(SplitedOrderProdBridgeExample example);

    SplitedOrderProdBridge selectByPrimaryKey(Integer oid);

    int updateByExampleSelective(@Param("record") SplitedOrderProdBridge record, @Param("example") SplitedOrderProdBridgeExample example);

    int updateByExample(@Param("record") SplitedOrderProdBridge record, @Param("example") SplitedOrderProdBridgeExample example);

    int updateByPrimaryKeySelective(SplitedOrderProdBridge record);

    int updateByPrimaryKey(SplitedOrderProdBridge record);
}