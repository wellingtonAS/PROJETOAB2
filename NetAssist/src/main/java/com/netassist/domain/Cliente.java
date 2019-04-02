package com.netassist.domain;

import javax.persistence.Entity;

@Entity
public class Cliente extends Pessoa {
	
	private int statusContrato;
	private int statusAcesso;
	
	public Cliente(){}
	public Cliente(int statusContrato, int statusAcesso) {
		super();
		this.statusContrato = statusContrato;
		this.statusAcesso = statusAcesso;
	}
	public int getStatusContrato() {
		return statusContrato;
	}
	public void setStatusContrato(int statusContrato) {
		this.statusContrato = statusContrato;
	}
	public int getStatusAcesso() {
		return statusAcesso;
	}
	public void setStatusAcesso(int statusAcesso) {
		this.statusAcesso = statusAcesso;
	}	
}
