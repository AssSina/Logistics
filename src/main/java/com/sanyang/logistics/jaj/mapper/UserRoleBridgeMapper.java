package com.sanyang.logistics.jaj.mapper;

import com.sanyang.logistics.base.pojo.UserRoleBridge;
import com.sanyang.logistics.base.pojo.UserRoleBridgeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRoleBridgeMapper {
    int countByExample(UserRoleBridgeExample example);

    int deleteByExample(UserRoleBridgeExample example);

    int insert(UserRoleBridge record);

    int insertSelective(UserRoleBridge record);

    List<UserRoleBridge> selectByExample(UserRoleBridgeExample example);

    int updateByExampleSelective(@Param("record") UserRoleBridge record, @Param("example") UserRoleBridgeExample example);

    int updateByExample(@Param("record") UserRoleBridge record, @Param("example") UserRoleBridgeExample example);
}