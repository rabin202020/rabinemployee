package com.employee.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ADDRESS_TABLES")
public class Address {
	
	@Id
	@Column(name = "ADDR_ID")
    @GeneratedValue
	private long addrId;
	
	@Column(name = "streetname")
	private String streetName;
	
	@Column(name = "landmark")
	private String landMark;
	
	@Column(name = "cityname")
	private String cityName;
	
	@Column(name = "statename")
	private String stateName;
	
	@Column(name = "pincode")
	private String pinCode;
	
	@ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "id")
	private Employee employee;

	public Address() {
		super();
	}

	public Address(long addrId, String streetName, String landMark, String cityName, String stateName, String pinCode,
			Employee employee) {
		super();
		this.addrId = addrId;
		this.streetName = streetName;
		this.landMark = landMark;
		this.cityName = cityName;
		this.stateName = stateName;
		this.pinCode = pinCode;
		this.employee = employee;
	}

	public long getAddrId() {
		return addrId;
	}

	public void setAddrId(long addrId) {
		this.addrId = addrId;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Address [addrId=" + addrId + ", streetName=" + streetName + ", landMark=" + landMark + ", cityName="
				+ cityName + ", stateName=" + stateName + ", pinCode=" + pinCode + ", employee=" + employee + "]";
	}
	
}
