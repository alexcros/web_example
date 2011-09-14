package org.pisit.web.model.user;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;

import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.Table;
import org.pisit.web.model.entity.Available;

@AttributeOverride(name = "id", column = @Column(name = "USER_ID", nullable = false))
@Entity
@Table(appliesTo = "USER", comment = "Table where the Users are stored", fetch = FetchMode.JOIN)
public class User extends Available {

    /**
     * UUID.
     */
    private static final long serialVersionUID = 2801285676867586642L;
    @Column(nullable = false, name = "LOGIN", length = 128)
    private String login;

    private String password;

    private String email;

    private String name;

    private String surname;

    private Address address;

    public Address getAddress() {
	return this.address;
    }

    public String getEmail() {
	return this.email;
    }

    public String getLogin() {
	return this.login;
    }

    public String getName() {
	return this.name;
    }

    public String getPassword() {
	return this.password;
    }

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
