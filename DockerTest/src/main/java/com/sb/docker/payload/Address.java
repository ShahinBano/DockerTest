package com.sb.docker.payload;

public class Address {

	private PermanentAddress permanentAddress;
	private PresentAddress presentAddress;
	
	public Address(PermanentAddress permanentAddress, PresentAddress presentAddress) {
		super();
		this.permanentAddress = permanentAddress;
		this.presentAddress = presentAddress;
	}
	public PermanentAddress getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(PermanentAddress permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	public PresentAddress getPresentAddress() {
		return presentAddress;
	}
	public void setPresentAddress(PresentAddress presentAddress) {
		this.presentAddress = presentAddress;
	}
	@Override
	public String toString() {
		return "Address [permanentAddress=" + permanentAddress + ", presentAddress=" + presentAddress + "]";
	}
}
