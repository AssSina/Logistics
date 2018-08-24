package com.sanyang.logistics.jaj.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanyang.logistics.base.pojo.Channel;
import com.sanyang.logistics.base.pojo.ChannelExample;
//import com.sanyang.logistics.base.pojo.ChannelExample;
import com.sanyang.logistics.jaj.mapper.ChannelMapper;

@Repository("channelDao")
public class ChannelDaoImp implements ChannelDao {
	
	@Autowired
	private ChannelMapper channelMapper;
	
	@Override
	public List<Channel> getChannel(Integer whId) {
		// TODO Auto-generated method stub
//		ChannelExample example=new ChannelExample();
		return channelMapper.getChannel(whId);
	}

	@Override
	public void insertChannel(Channel channel) {
		// TODO Auto-generated method stub
		channelMapper.insertSelective(channel);
	}

	@Override
	public void deleteChannel(Integer channelId) {
		// TODO Auto-generated method stub
		channelMapper.deleteByPrimaryKey(channelId);
	}

	@Override
	public Channel getChannelById(Integer channelId) {
		// TODO Auto-generated method stub
		return channelMapper.selectByPrimaryKey(channelId);
	}

	@Override
	public void updateChannel(Channel channel) {
		// TODO Auto-generated method stub
		channelMapper.updateByPrimaryKeySelective(channel);
	}

	@Override
	public List<Channel> getChannels() {
		// TODO Auto-generated method stub
		ChannelExample example=new ChannelExample();
		return channelMapper.selectByExample(example);
	}

}
