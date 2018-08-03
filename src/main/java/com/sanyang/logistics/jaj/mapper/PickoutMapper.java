package com.sanyang.logistics.jaj.mapper;

import com.sanyang.logistics.base.pojo.Pickout;
import com.sanyang.logistics.base.pojo.PickoutExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PickoutMapper {
    int countByExample(PickoutExample example);

    int deleteByExample(PickoutExample example);

    int deleteByPrimaryKey(Integer pickoutId);

    int insert(Pickout record);

    int insertSelective(Pickout record);

    List<Pickout> selectByExample(PickoutExample example);

    Pickout selectByPrimaryKey(Integer pickoutId);

    int updateByExampleSelective(@Param("record") Pickout record, @Param("example") PickoutExample example);

    int updateByExample(@Param("record") Pickout record, @Param("example") PickoutExample example);

    int updateByPrimaryKeySelective(Pickout record);

    int updateByPrimaryKey(Pickout record);
}