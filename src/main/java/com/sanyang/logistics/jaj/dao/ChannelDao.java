package com.sanyang.logistics.jaj.dao;

import java.util.List;

import com.sanyang.logistics.base.pojo.Channel;

public interface ChannelDao {

	List<Channel> getChannel(Integer whId);

	void insertChannel(Channel channel);

	void deleteChannel(Integer channelId);

	Channel getChannelById(Integer channelId);

	void updateChannel(Channel channel);

	List<Channel> getChannels();

}
