package org.pisit.web.model.user;

import org.pisit.web.model.entity.Available;
import org.pisit.web.model.master.City;
import org.pisit.web.model.master.Country;

public class Address extends Available {

    /**
     * UUID.
     */
    private static final long serialVersionUID = -5693372783495723627L;

    private String address;

    private City city;

    private Country country;

    public String getAddress() {
	return this.address;
    }

    public City getCity() {
	return this.city;
    }

    public Country getCountry() {
	return this.country;
    }

    public void setAddress(String address) {
	this.address = address;
    }

    public void setCity(City city) {
	this.city = city;
    }

    public void setCountry(Country country) {
	this.country = country;
    }
}
