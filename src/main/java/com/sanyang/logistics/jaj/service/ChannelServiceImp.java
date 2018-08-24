package com.sanyang.logistics.jaj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanyang.logistics.base.pojo.Channel;
import com.sanyang.logistics.jaj.dao.ChannelDao;

@Service("channelService")
public class ChannelServiceImp implements ChannelService{

	@Autowired
	private ChannelDao channelDao;
	
	@Override
	public List<Channel> getChannel(Integer whId) {
		// TODO Auto-generated method stub
		return channelDao.getChannel(whId);
	}

	@Override
	public void insertChannel(Channel channel) {
		// TODO Auto-generated method stub
		channelDao.insertChannel(channel);
	}

	@Override
	public void deleteChannel(Integer channelId) {
		// TODO Auto-generated method stub
		channelDao.deleteChannel(channelId);
	}

	@Override
	public Channel getChannelById(Integer channelId) {
		// TODO Auto-generated method stub
		return channelDao.getChannelById(channelId);
	}

	@Override
	public void updateChannel(Channel channel) {
		// TODO Auto-generated method stub
		channelDao.updateChannel(channel);
	}

	@Override
	public List<Channel> getChannels() {
		// TODO Auto-generated method stub
		return channelDao.getChannels();
	}

}
