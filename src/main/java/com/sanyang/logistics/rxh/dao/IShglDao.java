package com.sanyang.logistics.rxh.dao;

import java.util.List;

import com.sanyang.logistics.base.pojo.Pickout;
import com.sanyang.logistics.base.pojo.PickoutProdBridge;
import com.sanyang.logistics.base.pojo.PrepareInWarehouse;
import com.sanyang.logistics.base.pojo.PrepareOutWarehouse;
import com.sanyang.logistics.base.pojo.RcptDamage;
import com.sanyang.logistics.base.pojo.RcptProdBridge;
import com.sanyang.logistics.base.pojo.Receipt;
import com.sanyang.logistics.base.pojo.Warehouse;

public interface IShglDao {
	
	public List<Receipt> getAllR(Integer whId);
	public List<RcptProdBridge> getRcpt(Integer rcptId);
	public RcptProdBridge gethslr(Integer rcptId);
	public List<RcptDamage> getHs(Integer rcptId);
	public List<PrepareInWarehouse> getRk(Integer rcptId);
	public void updRcpt(RcptProdBridge rcptProdBridge);

	public void inserPrepareIn(PrepareInWarehouse prepareInWarehouse);
	public void del(Integer preind);

	public void insert(RcptProdBridge rcptProdBridge);
	
	public void upde(PrepareInWarehouse prepareInWarehouse);
	public void updsh(RcptProdBridge rcptProdBridge);
	public void updateReceipt(Receipt receipt);
	public List<RcptProdBridge> getR(Integer rcptId);
	public void ins(RcptDamage pDamage);
	public void deld(Integer damageid);

}
