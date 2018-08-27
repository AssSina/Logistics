package com.sanyang.logistics.base.pojo;

public class SysUser {
    private Integer userId;

    private String password;
    
    private String ss;
    
    private String dq;

	private String loginId;

    private String name;

    private String email;

    private String phone;

    private String address;

    private Integer regionId;
    private Integer roleId;
    
    
    
    @Override
	public String toString() {
		return "SysUser [userId=" + userId + ", password=" + password + ", ss=" + ss + ", dq=" + dq + ", loginId="
				+ loginId + ", name=" + name + ", email=" + email + ", phone=" + phone + ", address=" + address
				+ ", regionId=" + regionId + ", roleId=" + roleId + "]";
	}

	public String getDq() {
		return dq;
	}

	public void setDq(String dq) {
		this.dq = dq;
	}
    public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId == null ? null : loginId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

	public String getSs() {
		return ss;
	}

	public void setSs(String ss) {
		this.ss = ss;
	}
    
}