package com.sanyang.logistics.jaj.mapper;

import com.sanyang.logistics.base.pojo.RoleFuncBridge;
import com.sanyang.logistics.base.pojo.RoleFuncBridgeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleFuncBridgeMapper {
    int countByExample(RoleFuncBridgeExample example);

    int deleteByExample(RoleFuncBridgeExample example);

    int insert(RoleFuncBridge record);

    int insertSelective(RoleFuncBridge record);

    List<RoleFuncBridge> selectByExample(RoleFuncBridgeExample example);

    int updateByExampleSelective(@Param("record") RoleFuncBridge record, @Param("example") RoleFuncBridgeExample example);

    int updateByExample(@Param("record") RoleFuncBridge record, @Param("example") RoleFuncBridgeExample example);
}