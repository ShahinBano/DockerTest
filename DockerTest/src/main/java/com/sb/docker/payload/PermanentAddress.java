package com.sb.docker.payload;

public class PermanentAddress {
	private String villageName;
	private String postOffice;
	private String districtName;
	private String state;
	private String country;
	private String pinCode;
	public PermanentAddress(String villageName, String postOffice, String districtName, String state, String country,
			String pinCode) {
		super();
		this.villageName = villageName;
		this.postOffice = postOffice;
		this.districtName = districtName;
		this.state = state;
		this.country = country;
		this.pinCode = pinCode;
	}
	public String getVillageName() {
		return villageName;
	}
	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}
	public String getPostOffice() {
		return postOffice;
	}
	public void setPostOffice(String postOffice) {
		this.postOffice = postOffice;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "PermanentAddress [villageName=" + villageName + ", postOffice=" + postOffice + ", districtName="
				+ districtName + ", state=" + state + ", country=" + country + ", pinCode=" + pinCode + "]";
	}
}
