package org.pisit.web.model.user;

import javax.persistence.AttributeOverride;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.Table;
import org.pisit.web.model.entity.Available;
import org.pisit.web.model.master.City;
import org.pisit.web.model.master.Country;

@Entity
@javax.persistence.SequenceGenerator(name = "SEQ_ADDRESS", sequenceName = "SEQ_ADDRESS")
@Table(appliesTo = "ADDRESS", fetch = FetchMode.JOIN, comment = "Addresses")
@AttributeOverride(name = "id", column = @Column(name = "ADDRESS_ID", nullable = false))
public class Address extends Available {

    /**
     * UUID.
     */
    private static final long serialVersionUID = -5693372783495723627L;

    private String address;

    private City city;

    private Country country;

    @Basic
    @Column(name = "ADDRESS", length = 256, nullable = false)
    public String getAddress() {
	return this.address;
    }

    public City getCity() {
	return this.city;
    }

    public Country getCountry() {
	return this.country;
    }

    @Override
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ADDRESS")
    public Long getId() {
	return this.id;
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
