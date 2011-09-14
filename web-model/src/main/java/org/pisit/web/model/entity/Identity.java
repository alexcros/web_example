package org.pisit.web.model.entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * 
 * @author detryo
 * 
 */
@MappedSuperclass
public class Identity implements Serializable {

    /**
     * UUID.
     */
    private static final long serialVersionUID = -925018145926204557L;

    private Long id;

    @Id
    @GeneratedValue
    public Long getId() {
	return this.id;
    }

    public void setId(Long id) {
	this.id = id;
    }
}
