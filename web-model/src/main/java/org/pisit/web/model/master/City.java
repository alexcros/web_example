package org.pisit.web.model.master;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.Table;
import org.pisit.web.model.entity.Identity;

@Entity
@Table(appliesTo = "CITY", comment = "Cities table", fetch = FetchMode.JOIN)
public class City extends Identity {

    /**
     * UUID.
     */
    private static final long serialVersionUID = -7797397027722246487L;
    @Basic
    private String name;

    private Country country;

    @Column(name = "COUNTRY_ID")
    public Country getCountry() {
	return this.country;
    }

    @Column(name = "NAME", length = 128, nullable = false, unique = false)
    public String getName() {
	return this.name;
    }

    public void setCountry(Country country) {
	this.country = country;
    }

    public void setName(String name) {
	this.name = name;
    }
}
