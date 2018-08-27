package com.sanyang.logistics.rxh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanyang.logistics.base.pojo.Pickout;
import com.sanyang.logistics.base.pojo.PickoutProdBridge;
import com.sanyang.logistics.base.pojo.PrepareOutWarehouse;
import com.sanyang.logistics.base.pojo.Warehouse;
import com.sanyang.logistics.rxh.dao.IJhDao;

@Service("sv")
public class JhServiceImp implements JhService {

	@Autowired
	public IJhDao dao;

	@Override
	public List<Pickout> getAll(Integer whid) {
		return dao.getAll(whid);
	}

	@Override
	public List<Warehouse> getAllW() {
		// TODO Auto-generated method stub
		return dao.getAllW();
	}


	@Override
	public List<PickoutProdBridge> getAllPickout(Integer pickoutId) {
		// TODO Auto-generated method stub
		return dao.getAllPickout(pickoutId);

	}

	@Override
	public List<PrepareOutWarehouse> getPrepareOut(Integer pickoutId) {
		return dao.getPrepareOut(pickoutId);
	}

	@Override
	public void delPrepareOut(Integer preout_id) {
		dao.delPrepareOut(preout_id);		
	}

	@Override
	public List<PrepareOutWarehouse> getYck() {
		return dao.getYck();
	}

	@Override
	public Pickout getPick(Integer pickout_id) {

		return dao.getPick(pickout_id);
	}

	@Override
	public void delet(Integer pickout_prod_id) {
		dao.delet(pickout_prod_id);

	}

	@Override
	public void upd(PickoutProdBridge pickoutProdBridge) {
		dao.upd(pickoutProdBridge);

	}

	@Override
	public void updpick(Pickout pickout) {
		dao.updpick(pickout);		
	}

	@Override
	public void inser(PrepareOutWarehouse prepareOutWarehouse) {
		dao.inser(prepareOutWarehouse);		
	}

	@Override
	public void inserw(PickoutProdBridge pickoutProdBridge) {
		dao.inserw(pickoutProdBridge);

	}

	@Override
	public void updatepickout(PrepareOutWarehouse prepareOutWarehouse) {

		dao.updatepickout(prepareOutWarehouse);
	}






}
