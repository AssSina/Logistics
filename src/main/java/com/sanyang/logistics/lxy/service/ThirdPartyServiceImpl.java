package com.sanyang.logistics.lxy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanyang.logistics.base.pojo.ThirdParty;
import com.sanyang.logistics.lxy.dao.IThirdPartyDao;
@Service
public class ThirdPartyServiceImpl implements IThirdPartyService{
		@Autowired
		private IThirdPartyDao thirdPartyDao;
	
	@Override
	public List<ThirdParty> getthir() {
		// TODO Auto-generated method stub
		List<ThirdParty> getthir = thirdPartyDao.getthir();
		return getthir;
	}
					
			
			
			
			
}
