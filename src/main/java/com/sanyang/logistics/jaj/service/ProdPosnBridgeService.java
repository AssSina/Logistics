package com.sanyang.logistics.jaj.service;

import java.util.List;

import com.sanyang.logistics.base.pojo.Position;
import com.sanyang.logistics.base.pojo.ProdPosnBridge;
/**
 * 库位货物业务层接口
 * @author asus
 *
 */
public interface ProdPosnBridgeService {

	List<ProdPosnBridge> getProdPosnBridge(Integer prodId);

	void insertProdPosnBridge(ProdPosnBridge prodPosnBridge);

	void deleteProdPosnBridge(Integer oid);

	void updateProdPosnBridge(ProdPosnBridge prodPosnBridge);

	List<Position> getPositionByWhId(ProdPosnBridge ppb);

}
