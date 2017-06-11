package com.chris.limit;

import java.math.BigDecimal;
import java.util.Date;

public class Customer {
	private int id;
	private int district;
	private int warehouseId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String streetOne;
	private String streetTwo;
	private String city;
	private String state;
	private String zip;
	private String phone;
	private Date since;
	private String credit;
	private String creditLim;
	private BigDecimal discount;
	private BigDecimal balance;
	private BigDecimal ytdPayment;
	private int paymentCount;
	private int deliveryCount;
	private String data;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDistrict() {
		return district;
	}
	public void setDistrict(int district) {
		this.district = district;
	}
	public int getWarehouseId() {
		return warehouseId;
	}
	public void setWarehouseId(int warehouseId) {
		this.warehouseId = warehouseId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getStreetOne() {
		return streetOne;
	}
	public void setStreetOne(String streetOne) {
		this.streetOne = streetOne;
	}
	public String getStreetTwo() {
		return streetTwo;
	}
	public void setStreetTwo(String streetTwo) {
		this.streetTwo = streetTwo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getSince() {
		return since;
	}
	public void setSince(Date since) {
		this.since = since;
	}
	public String getCredit() {
		return credit;
	}
	public void setCredit(String credit) {
		this.credit = credit;
	}
	public String getCreditLim() {
		return creditLim;
	}
	public void setCreditLim(String creditLim) {
		this.creditLim = creditLim;
	}
	public BigDecimal getDiscount() {
		return discount;
	}
	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	public BigDecimal getYtdPayment() {
		return ytdPayment;
	}
	public void setYtdPayment(BigDecimal ytdPayment) {
		this.ytdPayment = ytdPayment;
	}
	public int getPaymentCount() {
		return paymentCount;
	}
	public void setPaymentCount(int paymentCount) {
		this.paymentCount = paymentCount;
	}
	public int getDeliveryCount() {
		return deliveryCount;
	}
	public void setDeliveryCount(int deliveryCount) {
		this.deliveryCount = deliveryCount;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", district=" + district + ", warehouseId=" + warehouseId + ", firstName="
				+ firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", streetOne=" + streetOne
				+ ", streetTwo=" + streetTwo + ", city=" + city + ", state=" + state + ", zip=" + zip + ", phone="
				+ phone + ", since=" + since + ", credit=" + credit + ", creditLim=" + creditLim + ", discount="
				+ discount + ", balance=" + balance + ", ytdPayment=" + ytdPayment + ", paymentCount=" + paymentCount
				+ ", deliveryCount=" + deliveryCount + ", data=" + data + "]";
	}

	
}
