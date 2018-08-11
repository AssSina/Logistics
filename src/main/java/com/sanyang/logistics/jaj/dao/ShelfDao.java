package com.sanyang.logistics.jaj.dao;

import java.util.List;

import com.sanyang.logistics.base.pojo.Shelf;

public interface ShelfDao {

	List<Shelf> getShelf();

	void insertShelf(Shelf shelf);

	void deleteShelf(Integer shelfId);

	Shelf getShelfById(Integer shelfId);

	void updateShelf(Shelf shelf);

}
