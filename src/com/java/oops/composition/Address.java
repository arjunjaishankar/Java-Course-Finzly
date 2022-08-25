package com.java.oops.composition;

public class Address {

	private String street;
	private String state;
	private String country;

	public Address() {

	}

	public Address(String street, String state, String country) {
		this.street = street;
		this.state = state;
		this.country = country;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
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

	@Override
	public String toString() {
		return "Address [street=" + street + ", state=" + state + ", country=" + country + "]";
	}
}
