package com.sanyang.logistics.jaj.service;

import java.util.List;

import com.sanyang.logistics.base.pojo.Shelf;

public interface ShelfService {

	List<Shelf> getShelf(Integer whId);

	void insertShelf(Shelf shelf);

	void deleteShelf(Integer shelfId,Integer whId);

	Shelf getShelfById(Integer shelfId);

	void updateShelf(Shelf shelf);

}
