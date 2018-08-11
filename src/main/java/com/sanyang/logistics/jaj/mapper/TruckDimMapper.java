package com.sanyang.logistics.jaj.mapper;

import com.sanyang.logistics.base.pojo.TruckDim;
import com.sanyang.logistics.base.pojo.TruckDimExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
/**
 * 车辆的持久化映射层
 * @author asus
 *
 */
public interface TruckDimMapper {
    int countByExample(TruckDimExample example);

    int deleteByExample(TruckDimExample example);

    int deleteByPrimaryKey(Integer truckId);

    int insert(TruckDim record);

    int insertSelective(TruckDim record);

    List<TruckDim> selectByExample(TruckDimExample example);

    TruckDim selectByPrimaryKey(Integer truckId);

    int updateByExampleSelective(@Param("record") TruckDim record, @Param("example") TruckDimExample example);

    int updateByExample(@Param("record") TruckDim record, @Param("example") TruckDimExample example);

    int updateByPrimaryKeySelective(TruckDim record);

    int updateByPrimaryKey(TruckDim record);

	List<TruckDim> getTruckDim(TruckDim truckDim);

	List<TruckDim> getOwnerTypeDimById();
}