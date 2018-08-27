package com.sanyang.logistics.rxh.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanyang.logistics.base.pojo.Pickout;
import com.sanyang.logistics.base.pojo.PickoutProdBridge;
import com.sanyang.logistics.base.pojo.PrepareInWarehouse;
import com.sanyang.logistics.base.pojo.PrepareOutWarehouse;
import com.sanyang.logistics.base.pojo.RcptDamage;
import com.sanyang.logistics.base.pojo.RcptProdBridge;
import com.sanyang.logistics.base.pojo.Receipt;
import com.sanyang.logistics.base.pojo.Warehouse;
import com.sanyang.logistics.rxh.mapper.IJhMapper;
import com.sanyang.logistics.rxh.mapper.IShglMapper;

@Repository("shgldao")
public class IShglDaoImp implements IShglDao {
	@Autowired
	public IShglMapper mapper;

	@Override
	public List<Receipt> getAllR(Integer whId) {
		return mapper.getAllR(whId);
	}

	@Override
	public List<RcptProdBridge> getRcpt(Integer rcptId) {
		return mapper.getRcpt(rcptId);
	}

	@Override
	public RcptProdBridge gethslr(Integer rcptId) {
		return mapper.gethslr(rcptId);
	}
	@Override
	public List<RcptDamage> getHs(Integer rcptId) {
		return mapper.getHs(rcptId);
	}

	@Override
	public List<PrepareInWarehouse> getRk(Integer rcptId) {
		return mapper.getRk(rcptId);
	}

	@Override
	public void updRcpt(RcptProdBridge rcptProdBridge) {
		mapper.updRcpt(rcptProdBridge);		
	}

	@Override
	public void inserPrepareIn(PrepareInWarehouse prepareInWarehouse) {
		mapper.inserPrepareIn(prepareInWarehouse);		
	}
	@Override
	public void del(Integer preind) {
		mapper.del(preind);		
	}

	public void insert(RcptProdBridge rcptProdBridge) {
		mapper.insert(rcptProdBridge);		
	}

	@Override
	public void upde(PrepareInWarehouse prepareInWarehouse) {
		mapper.upde(prepareInWarehouse);		
	}

	@Override
	public void updsh(RcptProdBridge rcptProdBridge) {
		mapper.updsh(rcptProdBridge);	
	}

	@Override
	public void updateReceipt(Receipt receipt) {
		mapper.updateReceipt(receipt);		
	}

	@Override
	public List<RcptProdBridge> getR(Integer rcptId) {
		return mapper.getR(rcptId);
	}

	@Override
	public void ins(RcptDamage pDamage) {
		mapper.ins(pDamage);		
	}

	@Override
	public void deld(Integer damageid) {
		mapper.deld(damageid);		
	}




}
