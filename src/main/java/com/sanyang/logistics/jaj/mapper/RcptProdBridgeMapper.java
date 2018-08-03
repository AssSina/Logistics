package com.sanyang.logistics.jaj.mapper;

import com.sanyang.logistics.base.pojo.RcptProdBridge;
import com.sanyang.logistics.base.pojo.RcptProdBridgeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RcptProdBridgeMapper {
    int countByExample(RcptProdBridgeExample example);

    int deleteByExample(RcptProdBridgeExample example);

    int deleteByPrimaryKey(Integer rcptProdId);

    int insert(RcptProdBridge record);

    int insertSelective(RcptProdBridge record);

    List<RcptProdBridge> selectByExample(RcptProdBridgeExample example);

    RcptProdBridge selectByPrimaryKey(Integer rcptProdId);

    int updateByExampleSelective(@Param("record") RcptProdBridge record, @Param("example") RcptProdBridgeExample example);

    int updateByExample(@Param("record") RcptProdBridge record, @Param("example") RcptProdBridgeExample example);

    int updateByPrimaryKeySelective(RcptProdBridge record);

    int updateByPrimaryKey(RcptProdBridge record);
}