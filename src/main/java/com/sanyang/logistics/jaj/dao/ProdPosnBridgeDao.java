package com.sanyang.logistics.jaj.dao;

import java.util.List;

import com.sanyang.logistics.base.pojo.ProdPosnBridge;
/**
 * 库位货物数据层接口
 * @author asus
 *
 */
public interface ProdPosnBridgeDao {

	List<ProdPosnBridge> getProdPosnBridge(Integer prodId);

	void insertProdPosnBridge(ProdPosnBridge prodPosnBridge);

	void deleteProdPosnBridge(Integer oid);

	void updateProdPosnBridge(ProdPosnBridge prodPosnBridge);

}
