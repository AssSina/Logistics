package com.sanyang.logistics.jaj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanyang.logistics.base.pojo.Position;
import com.sanyang.logistics.base.pojo.ProdPosnBridge;
import com.sanyang.logistics.jaj.dao.ProdPosnBridgeDao;
import com.sanyang.logistics.jaj.dao.ShelfDao;

@Service("prodPosnBridgeService")
public class ProdPosnBridgeServiceImp implements ProdPosnBridgeService {
	
	@Autowired
	private ProdPosnBridgeDao prodPosnBridgeDao;
	
	@Autowired
	private ShelfDao shelfDao;
	
	@Override
	public List<ProdPosnBridge> getProdPosnBridge(Integer prodId) {
		// TODO Auto-generated method stub
		return prodPosnBridgeDao.getProdPosnBridge(prodId);
	}

	@Override
	public void insertProdPosnBridge(ProdPosnBridge prodPosnBridge) {
		// TODO Auto-generated method stub
		prodPosnBridgeDao.insertProdPosnBridge(prodPosnBridge);
	}

	@Override
	public void deleteProdPosnBridge(Integer oid) {
		// TODO Auto-generated method stub
		prodPosnBridgeDao.deleteProdPosnBridge(oid);
	}

	@Override
	public void updateProdPosnBridge(ProdPosnBridge prodPosnBridge) {
		// TODO Auto-generated method stub
		prodPosnBridgeDao.updateProdPosnBridge(prodPosnBridge);
	}

	@Override
	public List<Position> getPositionByWhId(ProdPosnBridge ppb) {
		// TODO Auto-generated method stub
		return shelfDao.getPositionByWhId(ppb);
	}

}
