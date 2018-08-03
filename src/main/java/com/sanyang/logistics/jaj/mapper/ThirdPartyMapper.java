package com.sanyang.logistics.jaj.mapper;

import com.sanyang.logistics.base.pojo.ThirdParty;
import com.sanyang.logistics.base.pojo.ThirdPartyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThirdPartyMapper {
    int countByExample(ThirdPartyExample example);

    int deleteByExample(ThirdPartyExample example);

    int deleteByPrimaryKey(Integer thirdPartyId);

    int insert(ThirdParty record);

    int insertSelective(ThirdParty record);

    List<ThirdParty> selectByExample(ThirdPartyExample example);

    ThirdParty selectByPrimaryKey(Integer thirdPartyId);

    int updateByExampleSelective(@Param("record") ThirdParty record, @Param("example") ThirdPartyExample example);

    int updateByExample(@Param("record") ThirdParty record, @Param("example") ThirdPartyExample example);

    int updateByPrimaryKeySelective(ThirdParty record);

    int updateByPrimaryKey(ThirdParty record);
}