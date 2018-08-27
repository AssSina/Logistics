package com.sanyang.logistics.rxh.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanyang.logistics.base.pojo.Pickout;
import com.sanyang.logistics.base.pojo.PickoutProdBridge;
import com.sanyang.logistics.base.pojo.PrepareOutWarehouse;
import com.sanyang.logistics.base.pojo.Warehouse;
import com.sanyang.logistics.rxh.mapper.IJhMapper;

@Repository("dao")
public class JhDaoImp implements IJhDao {

	@Autowired
	public IJhMapper mapper;

	@Override
	public List<Pickout> getAll(Integer whid) {
		return mapper.getAll(whid); 
	}

	@Override
	public List<Warehouse> getAllW() {
		return mapper.getAllW();
	}


	@Override
	public List<PickoutProdBridge> getAllPickout(Integer pickoutId) {
		// TODO Auto-generated method stub
		return mapper.getAllPickout(pickoutId);
	}

	@Override
	public List<PrepareOutWarehouse> getPrepareOut(Integer pickoutId) {
		return mapper.getPrepareOut(pickoutId);
	}

	@Override
	public void delPrepareOut(Integer preout_id) {
		mapper.delPrepareOut(preout_id);

	}

	@Override
	public List<PrepareOutWarehouse> getYck() {
		return mapper.getYck();
	}

	@Override
	public Pickout getPick(Integer pickout_id) {

		return mapper.getPick(pickout_id);
	}

	@Override
	public void delet(Integer pickout_prod_id) {
		mapper.delet(pickout_prod_id);

	}

	@Override
	public void upd(PickoutProdBridge pickoutProdBridge) {
		mapper.upd(pickoutProdBridge);

	}

	@Override
	public void updpick(Pickout pickout) {
		mapper.updpick(pickout);		
	}

	@Override
	public void inser(PrepareOutWarehouse prepareOutWarehouse) {
		mapper.inser(prepareOutWarehouse);

	}

	@Override
	public void inserw(PickoutProdBridge pickoutProdBridge) {
		mapper.inserw(pickoutProdBridge);
	}


	@Override
	public void updatepickout(PrepareOutWarehouse prepareOutWarehouse) {

		mapper.updatepickout(prepareOutWarehouse);
	}


}
