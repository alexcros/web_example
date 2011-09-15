package org.pisit.web.model.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Available extends Identity {
    /**
     * UUID.
     */
    private static final long serialVersionUID = 3893268102420734673L;

    private Boolean available;

    @Column(name = "IS_AVAILABLE", nullable = false)
    public Boolean getAvailable() {
	return this.available;
    }

    public void setAvailable(Boolean available) {
	this.available = available;
    }
}
