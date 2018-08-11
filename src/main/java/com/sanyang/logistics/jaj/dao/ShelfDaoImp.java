package com.sanyang.logistics.jaj.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanyang.logistics.base.pojo.Shelf;
//import com.sanyang.logistics.base.pojo.ShelfExample;
import com.sanyang.logistics.jaj.mapper.ShelfMapper;

@Repository("shelfDao")
public class ShelfDaoImp implements ShelfDao {
	
	@Autowired
	private ShelfMapper shelfMapper;
	
	@Override
	public List<Shelf> getShelf() {
		// TODO Auto-generated method stub
//		ShelfExample example=new ShelfExample();
		return shelfMapper.getShelf();
	}

	@Override
	public void insertShelf(Shelf shelf) {
		// TODO Auto-generated method stub
		shelfMapper.insertSelective(shelf);
	}

	@Override
	public void deleteShelf(Integer shelfId) {
		// TODO Auto-generated method stub
		shelfMapper.deleteByPrimaryKey(shelfId);
	}

	@Override
	public Shelf getShelfById(Integer shelfId) {
		// TODO Auto-generated method stub
		return shelfMapper.selectByPrimaryKey(shelfId);
	}

	@Override
	public void updateShelf(Shelf shelf) {
		// TODO Auto-generated method stub
		shelfMapper.updateByPrimaryKeySelective(shelf);
	}

}
