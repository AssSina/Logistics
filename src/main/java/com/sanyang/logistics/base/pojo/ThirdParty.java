package com.sanyang.logistics.base.pojo;

public class ThirdParty {
    private Integer thirdPartyId;

    private String name;

    private String address;

    private String contact;

    private String description;
    
    private String phone;
    
    public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getThirdPartyId() {
        return thirdPartyId;
    }

    public void setThirdPartyId(Integer thirdPartyId) {
        this.thirdPartyId = thirdPartyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

	@Override
	public String toString() {
		return "ThirdParty [thirdPartyId=" + thirdPartyId + ", name=" + name + ", address=" + address + ", contact="
				+ contact + ", description=" + description + ", phone=" + phone + "]";
	}
    
}