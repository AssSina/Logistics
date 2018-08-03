package com.sanyang.logistics.jaj.mapper;

import com.sanyang.logistics.base.pojo.BackupArea;
import com.sanyang.logistics.base.pojo.BackupAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BackupAreaMapper {
    int countByExample(BackupAreaExample example);

    int deleteByExample(BackupAreaExample example);

    int deleteByPrimaryKey(Integer backupAreaId);

    int insert(BackupArea record);

    int insertSelective(BackupArea record);

    List<BackupArea> selectByExample(BackupAreaExample example);

    BackupArea selectByPrimaryKey(Integer backupAreaId);

    int updateByExampleSelective(@Param("record") BackupArea record, @Param("example") BackupAreaExample example);

    int updateByExample(@Param("record") BackupArea record, @Param("example") BackupAreaExample example);

    int updateByPrimaryKeySelective(BackupArea record);

    int updateByPrimaryKey(BackupArea record);
}