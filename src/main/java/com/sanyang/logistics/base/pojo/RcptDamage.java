package com.sanyang.logistics.base.pojo;

public class RcptDamage {
    private Integer damageid;

    private Integer rcptId;

    private Integer prodId;

    private String damageDegree;

    private Integer damagecount;

    private String barCode;

    private String posn;
    
    private String name;
    
    private String pname;
    
    private String pmodel;
    
    private String code;


    public Integer getDamageid() {
        return damageid;
    }

    public void setDamageid(Integer damageid) {
        this.damageid = damageid;
    }

    public Integer getRcptId() {
        return rcptId;
    }

    public void setRcptId(Integer rcptId) {
        this.rcptId = rcptId;
    }

    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    public String getDamageDegree() {
        return damageDegree;
    }

    public void setDamageDegree(String damageDegree) {
        this.damageDegree = damageDegree == null ? null : damageDegree.trim();
    }

    public Integer getDamagecount() {
        return damagecount;
    }

    public void setDamagecount(Integer damagecount) {
        this.damagecount = damagecount;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode == null ? null : barCode.trim();
    }

    public String getPosn() {
        return posn;
    }

    public void setPosn(String posn) {
        this.posn = posn == null ? null : posn.trim();
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPmodel() {
		return pmodel;
	}

	public void setPmodel(String pmodel) {
		this.pmodel = pmodel;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "RcptDamage [damageid=" + damageid + ", rcptId=" + rcptId + ", prodId=" + prodId + ", damageDegree="
				+ damageDegree + ", damagecount=" + damagecount + ", barCode=" + barCode + ", posn=" + posn + ", name="
				+ name + ", pname=" + pname + ", pmodel=" + pmodel + ", code=" + code + "]";
	}
    
    
}