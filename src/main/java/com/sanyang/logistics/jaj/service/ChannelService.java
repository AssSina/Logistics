package com.sanyang.logistics.jaj.service;

import java.util.List;

import com.sanyang.logistics.base.pojo.Channel;

public interface ChannelService {

	List<Channel> getChannel(Integer whId);

	void insertChannel(Channel channel);

	void deleteChannel(Integer channelId);

	Channel getChannelById(Integer channelId);

	void updateChannel(Channel channel);

	List<Channel> getChannels();

}
