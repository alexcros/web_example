package org.pisit.web.model.master;

import javax.persistence.AttributeOverride;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.Table;
import org.pisit.web.model.entity.Identity;

@javax.persistence.SequenceGenerator(name = "SEQ_CITY", sequenceName = "SEQ_CITY")
@Entity
@AttributeOverride(name = "id", column = @Column(name = "CITY_ID", nullable = false))
@Table(appliesTo = "CITY", comment = "Cities table", fetch = FetchMode.JOIN)
public class City extends Identity {

    /**
     * UUID.
     */
    private static final long serialVersionUID = -7797397027722246487L;
    @Basic
    private String name;

    private Country country;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "COUNTRY_ID")
    public Country getCountry() {
	return this.country;
    }

    @Override
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CITY")
    public Long getId() {
	return this.id;
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
