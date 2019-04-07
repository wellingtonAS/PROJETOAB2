package com.netassist.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Logins {

	@Id
	private Integer id;
	
	public Logins() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Logins(Integer id) {
		super();
		this.id = id;
	}
	
	
}
