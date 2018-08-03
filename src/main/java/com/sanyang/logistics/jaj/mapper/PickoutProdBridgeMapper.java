package com.sanyang.logistics.jaj.mapper;

import com.sanyang.logistics.base.pojo.PickoutProdBridge;
import com.sanyang.logistics.base.pojo.PickoutProdBridgeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PickoutProdBridgeMapper {
    int countByExample(PickoutProdBridgeExample example);

    int deleteByExample(PickoutProdBridgeExample example);

    int deleteByPrimaryKey(Integer pickoutProdId);

    int insert(PickoutProdBridge record);

    int insertSelective(PickoutProdBridge record);

    List<PickoutProdBridge> selectByExample(PickoutProdBridgeExample example);

    PickoutProdBridge selectByPrimaryKey(Integer pickoutProdId);

    int updateByExampleSelective(@Param("record") PickoutProdBridge record, @Param("example") PickoutProdBridgeExample example);

    int updateByExample(@Param("record") PickoutProdBridge record, @Param("example") PickoutProdBridgeExample example);

    int updateByPrimaryKeySelective(PickoutProdBridge record);

    int updateByPrimaryKey(PickoutProdBridge record);
}