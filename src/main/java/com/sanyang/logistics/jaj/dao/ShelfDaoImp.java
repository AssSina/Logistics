package com.sanyang.logistics.jaj.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanyang.logistics.base.pojo.Position;
import com.sanyang.logistics.base.pojo.ProdPosnBridge;
import com.sanyang.logistics.base.pojo.Shelf;
import com.sanyang.logistics.jaj.mapper.PositionMapper;
import com.sanyang.logistics.jaj.mapper.ShelfMapper;

@Repository("shelfDao")
public class ShelfDaoImp implements ShelfDao {
	
	@Autowired
	private ShelfMapper shelfMapper;
	
	@Autowired
	private PositionMapper positionMapper;
	
	@Override
	public List<Shelf> getShelf(Integer whId) {
		// TODO Auto-generated method stub
//		ShelfExample example=new ShelfExample();
		return shelfMapper.getShelf(whId);
	}

	@Override
	public void insertShelf(Shelf shelf) {
		// TODO Auto-generated method stub
		shelfMapper.insertSelective(shelf);
		Position position=new Position();
		position.setPosnCode("PN_"+shelf.getWhId()+"_"+shelf.getShelfId()+"_"+shelf.getShelfId());
		position.setShelfId(shelf.getShelfId());
		position.setWhId(shelf.getWhId());
		position.setPosnNo(position.getPosnCode());
		position.setCapacity(shelf.getCapacity());
		position.setAvailableCapacity(shelf.getCapacity());
		position.setOccupyAmt(0);
		positionMapper.insertSelective(position);
	}

	@Override
	public void deleteShelf(Integer shelfId,Integer whId) {
		// TODO Auto-generated method stub
		shelfMapper.deleteByPrimaryKey(shelfId);
		String posnCode="PN_"+whId+"_"+shelfId+"_"+shelfId;
		positionMapper.deletePosition(posnCode);
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
	
	@Override
	public List<Position> getPositionByWhId(ProdPosnBridge ppb) {
		// TODO Auto-generated method stub
		return positionMapper.getPositionByWhId(ppb);
	}

}
