package com.sanyang.logistics.jaj.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanyang.logistics.base.pojo.ProdPosnBridge;
import com.sanyang.logistics.jaj.mapper.ProdPosnBridgeMapper;

@Repository("prodPosnBridgeDao")
public class ProdPosnBridgeDaoImp implements ProdPosnBridgeDao {
	
	@Autowired
	private ProdPosnBridgeMapper prodPosnBridgeMapper;
	
	@Override
	public List<ProdPosnBridge> getProdPosnBridge(Integer prodId) {
		// TODO Auto-generated method stub
		return prodPosnBridgeMapper.getProdPosnBridge(prodId);
	}

	@Override
	public void insertProdPosnBridge(ProdPosnBridge prodPosnBridge) {
		// TODO Auto-generated method stub
		prodPosnBridgeMapper.insertSelective(prodPosnBridge);
	}

	@Override
	public void deleteProdPosnBridge(Integer oid) {
		// TODO Auto-generated method stub
		prodPosnBridgeMapper.deleteByPrimaryKey(oid);
	}

	@Override
	public void updateProdPosnBridge(ProdPosnBridge prodPosnBridge) {
		// TODO Auto-generated method stub
		prodPosnBridgeMapper.updateByPrimaryKeySelective(prodPosnBridge);
	}

}
