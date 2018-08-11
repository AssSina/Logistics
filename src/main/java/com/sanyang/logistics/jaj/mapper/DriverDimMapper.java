package com.sanyang.logistics.jaj.mapper;

import com.sanyang.logistics.base.pojo.DriverDim;
import com.sanyang.logistics.base.pojo.DriverDimExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
/**
 * 司机的持久化映射层
 * @author asus
 *
 */
public interface DriverDimMapper {
    int countByExample(DriverDimExample example);

    int deleteByExample(DriverDimExample example);

    int deleteByPrimaryKey(Integer driverId);

    int insert(DriverDim record);

    int insertSelective(DriverDim record);

    List<DriverDim> selectByExample(DriverDimExample example);

    DriverDim selectByPrimaryKey(Integer driverId);

    int updateByExampleSelective(@Param("record") DriverDim record, @Param("example") DriverDimExample example);

    int updateByExample(@Param("record") DriverDim record, @Param("example") DriverDimExample example);

    int updateByPrimaryKeySelective(DriverDim record);

    int updateByPrimaryKey(DriverDim record);
       
	List<DriverDim> getDriverDim();
}