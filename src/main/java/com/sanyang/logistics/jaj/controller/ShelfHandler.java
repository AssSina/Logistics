package com.sanyang.logistics.jaj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sanyang.logistics.base.pojo.Shelf;
import com.sanyang.logistics.jaj.service.ShelfService;
/**
 * 货架控制层
 * @author asus
 *
 */
@Controller
@RequestMapping("/shelf")
public class ShelfHandler {
	
	@Autowired
	private ShelfService shelfService;
	
	@RequestMapping("/getShelf")
	@ResponseBody
	public Object getShelf(){
		List<Shelf> Shelfs=shelfService.getShelf();
		return Shelfs;
	}
	
	@RequestMapping("/insertShelf")
	@ResponseBody
	public String insertShelf(Shelf shelf){
		shelfService.insertShelf(shelf);
		return "1";
	}
	
	@RequestMapping("/deleteShelf")
	@ResponseBody
	public int deleteShelf(Integer shelfId){
		shelfService.deleteShelf(shelfId);
		return 1;
	}
	
	@RequestMapping("/getShelfById")
	@ResponseBody
	public Object getShelfById(Integer shelfId){
		Shelf shelf=shelfService.getShelfById(shelfId);
		return shelf;
	}
	
	@RequestMapping("/updateShelf")
	@ResponseBody
	public int updateShelf(Shelf shelf){
		shelfService.updateShelf(shelf);
		return 1;
	}
}
