package com.sanyang.logistics.jaj.dao;

import java.util.List;

import com.sanyang.logistics.base.pojo.Position;
import com.sanyang.logistics.base.pojo.ProdPosnBridge;
import com.sanyang.logistics.base.pojo.Shelf;

public interface ShelfDao {

	List<Shelf> getShelf(Integer whId);

	void insertShelf(Shelf shelf);

	void deleteShelf(Integer shelfId,Integer whId);

	Shelf getShelfById(Integer shelfId);

	void updateShelf(Shelf shelf);
	
	List<Position> getPositionByWhId(ProdPosnBridge ppb);

}
