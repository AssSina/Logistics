package com.sanyang.logistics.jaj.mapper;

import com.sanyang.logistics.base.pojo.Shelf;
import com.sanyang.logistics.base.pojo.ShelfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShelfMapper {
    int countByExample(ShelfExample example);

    int deleteByExample(ShelfExample example);

    int deleteByPrimaryKey(Integer shelfId);

    int insert(Shelf record);

    int insertSelective(Shelf record);

    List<Shelf> selectByExample(ShelfExample example);

    Shelf selectByPrimaryKey(Integer shelfId);

    int updateByExampleSelective(@Param("record") Shelf record, @Param("example") ShelfExample example);

    int updateByExample(@Param("record") Shelf record, @Param("example") ShelfExample example);

    int updateByPrimaryKeySelective(Shelf record);

    int updateByPrimaryKey(Shelf record);
}