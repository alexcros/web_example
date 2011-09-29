package org.pisit.web.model.master;

import javax.persistence.AttributeOverride;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.pisit.web.model.entity.Identity;

@Entity
@AttributeOverride(name = "id", column = @Column(name = "CITY_ID", nullable = false))
public class Country extends Identity {

    /**
     * UUID.
     */
    private static final long serialVersionUID = 1845183156848502817L;

    @Basic
    private String name;

    @Override
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_COUNTRY")
    public Long getId() {
	return this.id;
    }

    @Column(name = "COUNTRY_NAME", length = 128, nullable = false, unique = true)
    public String getName() {
	return this.name;
    }

    public void setName(String name) {
	this.name = name;
    }
}
