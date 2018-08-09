package com.sanyang.logistics.base.pojo;

public class Channel {
    private Integer channelId;

    private String channelno;

    private Integer whId;
    
    private String name;

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public String getChannelno() {
        return channelno;
    }

    public void setChannelno(String channelno) {
        this.channelno = channelno == null ? null : channelno.trim();
    }

    public Integer getWhId() {
        return whId;
    }

    public void setWhId(Integer whId) {
        this.whId = whId;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    
}