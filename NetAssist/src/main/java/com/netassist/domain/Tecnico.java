package com.netassist.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tecnico {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	public Tecnico() {
		super();
	}

	public Tecnico(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
}
