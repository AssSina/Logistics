package com.sanyang.logistics.rxh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.sanyang.logistics.base.pojo.PrepareInWarehouse;
import com.sanyang.logistics.base.pojo.RcptDamage;
import com.sanyang.logistics.base.pojo.RcptProdBridge;
import com.sanyang.logistics.base.pojo.Receipt;
import com.sanyang.logistics.rxh.dao.IShglDao;

@Service("shglsv")
public class ShglServiceImp implements IShglService{
	@Autowired
	public IShglDao dao;

	@Override
	public List<Receipt> getAllR(Integer whId) {
		return dao.getAllR(whId);
	}

	@Override
	public List<RcptProdBridge> getRcpt(Integer rcptId) {
		return dao.getRcpt(rcptId);
	}

	@Override
	public RcptProdBridge gethslr(Integer rcptId) {

		return dao.gethslr(rcptId);
	}

	@Override
	public List<RcptDamage> getHs(Integer rcptId) {
		return dao.getHs(rcptId);
	}

	@Override
	public List<PrepareInWarehouse> getRk(Integer rcptId) {
		return dao.getRk(rcptId);
	}
	@Override
	public void updRcpt(RcptProdBridge rcptProdBridge) {
		dao.updRcpt(rcptProdBridge);		
	}

	@Override
	public void inserPrepareIn(PrepareInWarehouse prepareInWarehouse) {
		dao.inserPrepareIn(prepareInWarehouse);		
	}

	@Override
	public void del(Integer preind) {
		dao.del(preind);		
	}

	public void insert(RcptProdBridge rcptProdBridge) {
		dao.insert(rcptProdBridge);		
	}

	@Override
	public void upde(PrepareInWarehouse prepareInWarehouse) {
		dao.upde(prepareInWarehouse);		
	}


	public void updsh(RcptProdBridge rcptProdBridge) {
		dao.updsh(rcptProdBridge);		
	}

	@Override
	public void updateReceipt(Receipt receipt) {
		dao.updateReceipt(receipt);		
	}

	@Override
	public List<RcptProdBridge> getR(Integer rcptId) {
		return dao.getR(rcptId);
	}

	@Override
	public void ins(RcptDamage pDamage) {
dao.ins(pDamage);		
	}

	@Override
	public void deld(Integer damageid) {

		dao.deld(damageid);
	}
	

}
