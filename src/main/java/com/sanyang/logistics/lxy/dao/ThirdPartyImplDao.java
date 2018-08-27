package com.sanyang.logistics.lxy.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanyang.logistics.base.pojo.ThirdParty;
import com.sanyang.logistics.lxy.mapper.IThirdPartyMapper;
@Repository("thirdParty")
public class ThirdPartyImplDao implements IThirdPartyDao{
		@Autowired
		private IThirdPartyMapper thirdpartymapper;
		
		
	@Override
	public List<ThirdParty> getthir() {
		// TODO Auto-generated method stub
		List<ThirdParty> getthir = thirdpartymapper.getthir();
		return getthir;
	}
			
}
