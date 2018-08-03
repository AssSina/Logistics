package com.sanyang.logistics.jaj.mapper;

import com.sanyang.logistics.base.pojo.UserCustBridge;
import com.sanyang.logistics.base.pojo.UserCustBridgeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserCustBridgeMapper {
    int countByExample(UserCustBridgeExample example);

    int deleteByExample(UserCustBridgeExample example);

    int insert(UserCustBridge record);

    int insertSelective(UserCustBridge record);

    List<UserCustBridge> selectByExample(UserCustBridgeExample example);

    int updateByExampleSelective(@Param("record") UserCustBridge record, @Param("example") UserCustBridgeExample example);

    int updateByExample(@Param("record") UserCustBridge record, @Param("example") UserCustBridgeExample example);
}