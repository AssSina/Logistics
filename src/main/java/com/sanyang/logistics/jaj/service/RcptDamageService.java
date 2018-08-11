package com.sanyang.logistics.jaj.service;

import java.util.List;

import com.sanyang.logistics.base.pojo.RcptDamage;

/**
 * 货损业务层接口
 * @author asus
 *
 */
public interface RcptDamageService {

	List<RcptDamage> getRcptDamage(RcptDamage rcptDamage);

	void insertRcptDamage(RcptDamage RcptDamage);

	void deleteRcptDamage(Integer damageid);

	RcptDamage getRcptDamageById(Integer damageid);

	void updateRcptDamage(RcptDamage RcptDamage);

}
