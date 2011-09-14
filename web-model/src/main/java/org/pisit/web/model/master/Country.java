package org.pisit.web.model.master;

import org.pisit.web.model.entity.Identity;

public class Country extends Identity {

    /**
     * UUID.
     */
    private static final long serialVersionUID = 1845183156848502817L;

    private String name;

    public String getName() {
	return this.name;
    }

    public void setName(String name) {
	this.name = name;
    }
}
