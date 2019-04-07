package com.netassist.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Adm {
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private Integer id;

	public Adm(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	//Adicionar mais atributos
}
