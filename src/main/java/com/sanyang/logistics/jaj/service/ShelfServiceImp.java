package com.sanyang.logistics.jaj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanyang.logistics.base.pojo.Shelf;
import com.sanyang.logistics.jaj.dao.ShelfDao;

@Service("shelfService")
public class ShelfServiceImp implements ShelfService {
	
	@Autowired
	private ShelfDao shelfDao;
	
	@Override
	public List<Shelf> getShelf(Integer whId) {
		// TODO Auto-generated method stub
		return shelfDao.getShelf(whId);
	}

	@Override
	public void insertShelf(Shelf shelf) {
		// TODO Auto-generated method stub
		shelfDao.insertShelf(shelf);
	}

	@Override
	public void deleteShelf(Integer shelfId,Integer whId) {
		// TODO Auto-generated method stub
		shelfDao.deleteShelf(shelfId,whId);
	}

	@Override
	public Shelf getShelfById(Integer shelfId) {
		// TODO Auto-generated method stub
		return shelfDao.getShelfById(shelfId);
	}

	@Override
	public void updateShelf(Shelf shelf) {
		// TODO Auto-generated method stub
		shelfDao.updateShelf(shelf);
	}

}
