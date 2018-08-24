package com.sanyang.logistics.jaj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sanyang.logistics.base.pojo.Channel;
import com.sanyang.logistics.jaj.service.ChannelService;
/**
 * 仓库通道控制层
 * @author asus
 *
 */
@Controller
@RequestMapping("/channel")
public class ChannelHandler {
	
	@Autowired
	private ChannelService channelService;
	
	@RequestMapping("/getChannel")
	@ResponseBody
	public Object getChannel(Integer whId){
		List<Channel> channels=channelService.getChannel(whId);
		return channels;
	}
	
	@RequestMapping("/getChannels")
	@ResponseBody
	public Object getChannels(){
		List<Channel> channels=channelService.getChannels();
		return channels;
	}
	
	@RequestMapping("/insertChannel")
	@ResponseBody
	public String insertChannel(Channel channel){
		channelService.insertChannel(channel);
		return "1";
	}
	
	@RequestMapping("/deleteChannel")
	@ResponseBody
	public int deleteChannel(Integer channelId){
		channelService.deleteChannel(channelId);
		return 1;
	}
	
	@RequestMapping("/getChannelById")
	@ResponseBody
	public Object getChannelById(Integer channelId){
		Channel channel=channelService.getChannelById(channelId);
		return channel;
	}
	
	@RequestMapping("/updateChannel")
	@ResponseBody
	public int updateChannel(Channel channel){
		channelService.updateChannel(channel);
		return 1;
	}
}
