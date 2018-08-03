package com.sanyang.logistics.jaj.mapper;

import com.sanyang.logistics.base.pojo.UserWhBridge;
import com.sanyang.logistics.base.pojo.UserWhBridgeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserWhBridgeMapper {
    int countByExample(UserWhBridgeExample example);

    int deleteByExample(UserWhBridgeExample example);

    int insert(UserWhBridge record);

    int insertSelective(UserWhBridge record);

    List<UserWhBridge> selectByExample(UserWhBridgeExample example);

    int updateByExampleSelective(@Param("record") UserWhBridge record, @Param("example") UserWhBridgeExample example);

    int updateByExample(@Param("record") UserWhBridge record, @Param("example") UserWhBridgeExample example);
}