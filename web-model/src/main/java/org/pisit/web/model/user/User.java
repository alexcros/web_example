package org.pisit.web.model.user;

import javax.persistence.AttributeOverride;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.Table;
import org.pisit.web.model.entity.Available;

@javax.persistence.SequenceGenerator(name = "SEQ_USER", sequenceName = "SEQ_USER")
@AttributeOverride(name = "id", column = @Column(name = "USER_ID", nullable = false))
@Entity
@Table(appliesTo = "USER", comment = "Table where the Users are stored", fetch = FetchMode.JOIN)
public class User extends Available {

    /**
     * UUID.
     */
    private static final long serialVersionUID = 2801285676867586642L;

    private String login;

    private String password;

    private String email;

    private String name;

    private String surname;

    private Address address;

    @OneToOne(optional = true, cascade = { CascadeType.PERSIST,
	    CascadeType.MERGE })
    public Address getAddress() {
	return this.address;
    }

    @Basic
    @Column(nullable = false, name = "EMAIL", length = 256)
    public String getEmail() {
	return this.email;
    }

    @Override
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_USER")
    public Long getId() {
	return this.id;
    }

    @Basic
    @Column(nullable = false, name = "LOGIN", length = 128)
    public String getLogin() {
	return this.login;
    }

    @Basic
    @Column(nullable = false, name = "NAME", length = 64)
    public String getName() {
	return this.name;
    }

    @Basic
    @Column(nullable = false, name = "PASSWORD", length = 256)
    public String getPassword() {
	return this.password;
    }

    @Basic
    @Column(nullable = false, name = "SURNAME", length = 64)
    public String getSurname() {
	return this.surname;
    }

    public void setAddress(Address address) {
	this.address = address;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public void setLogin(String login) {
	this.login = login;
    }

    public void setName(String name) {
	this.name = name;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public void setSurname(String surname) {
	this.surname = surname;
    }

}
