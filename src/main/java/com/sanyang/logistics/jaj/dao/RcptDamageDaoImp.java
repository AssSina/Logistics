package com.sanyang.logistics.jaj.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanyang.logistics.base.pojo.RcptDamage;
import com.sanyang.logistics.jaj.mapper.RcptDamageMapper;

/**
 * 货损数据访问层实现类
 * @author asus
 *
 */
@Repository("rcptDamageDao")
public class RcptDamageDaoImp implements RcptDamageDao {
	
	@Autowired
	private RcptDamageMapper rcptDamageMapper;
	
	@Override
	public List<RcptDamage> getRcptDamage(RcptDamage rcptDamage) {
//		System.out.println(rcptDamage.getName());
		// TODO Auto-generated method stub
		return rcptDamageMapper.getRcptDamage(rcptDamage);
	}

	@Override
	public void insertRcptDamage(RcptDamage RcptDamage) {
		// TODO Auto-generated method stub
		rcptDamageMapper.insertSelective(RcptDamage);
	}

	@Override
	public void deleteRcptDamage(Integer damageid) {
		// TODO Auto-generated method stub
		rcptDamageMapper.deleteByPrimaryKey(damageid);
	}

	@Override
	public RcptDamage getRcptDamageById(Integer damageid) {
		// TODO Auto-generated method stub
		return rcptDamageMapper.selectByPrimaryKey(damageid);
	}

	@Override
	public void updateRcptDamage(RcptDamage RcptDamage) {
		// TODO Auto-generated method stub
		rcptDamageMapper.updateByPrimaryKeySelective(RcptDamage);
	}

}
