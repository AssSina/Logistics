package com.sanyang.logistics.base.pojo;

public class ProdPosnBridge {
    private Integer oid;

    private Integer posnId;

    private Integer whId;

    private Integer prodId;

    private Integer occupyAmt;
    
    private String posnCode;
    
    private String name;
    
    private String shelfNo;
    
    private Integer capacity;

    public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getPosnId() {
        return posnId;
    }

    public void setPosnId(Integer posnId) {
        this.posnId = posnId;
    }

    public Integer getWhId() {
        return whId;
    }

    public void setWhId(Integer whId) {
        this.whId = whId;
    }

    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    public Integer getOccupyAmt() {
        return occupyAmt;
    }

    public void setOccupyAmt(Integer occupyAmt) {
        this.occupyAmt = occupyAmt;
    }

	public String getPosnCode() {
		return posnCode;
	}

	public void setPosnCode(String posnCode) {
		this.posnCode = posnCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShelfNo() {
		return shelfNo;
	}

	public void setShelfNo(String shelfNo) {
		this.shelfNo = shelfNo;
	}
    
    
}