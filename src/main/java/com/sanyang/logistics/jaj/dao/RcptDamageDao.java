package com.sanyang.logistics.jaj.dao;

import java.util.List;

import com.sanyang.logistics.base.pojo.RcptDamage;

/**
 * 货损数据访问层接口
 * @author asus
 *
 */
public interface RcptDamageDao {

	List<RcptDamage> getRcptDamage(RcptDamage rcptDamage);

	void insertRcptDamage(RcptDamage RcptDamage);

	void deleteRcptDamage(Integer damageid);

	RcptDamage getRcptDamageById(Integer damageid);

	void updateRcptDamage(RcptDamage RcptDamage);

}
