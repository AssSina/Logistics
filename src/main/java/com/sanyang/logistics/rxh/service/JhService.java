package com.sanyang.logistics.rxh.service;

import java.util.List;

import com.sanyang.logistics.base.pojo.Pickout;
import com.sanyang.logistics.base.pojo.PickoutProdBridge;
import com.sanyang.logistics.base.pojo.PrepareOutWarehouse;
import com.sanyang.logistics.base.pojo.Warehouse;

public interface JhService {
	public List<Pickout> getAll(Integer whid);

	public List<Warehouse> getAllW();


	public List<PickoutProdBridge> getAllPickout(Integer pickoutId);
	
	
	public List<PrepareOutWarehouse> getPrepareOut(Integer pickoutId);
	public void delPrepareOut(Integer preout_id);
	public List<PrepareOutWarehouse> getYck();

	public Pickout getPick(Integer pickout_id);
		
    public void delet(Integer pickout_prod_id);

	public void upd(PickoutProdBridge pickoutProdBridge);
	
	public void updpick(Pickout pickout);
	public void inser(PrepareOutWarehouse prepareOutWarehouse);

	public void inserw(PickoutProdBridge pickoutProdBridge);

	public void updatepickout(PrepareOutWarehouse prepareOutWarehouse);



}
