package org.pisit.web.model.entity;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

/**
 * 
 * @author detryo
 * 
 */
@MappedSuperclass
public abstract class Identity implements Serializable {

    /**
     * UUID.
     */
    private static final long serialVersionUID = -925018145926204557L;

    protected Long id;

    public abstract Long getId();

    public void setId(Long id) {
	this.id = id;
    }
}
