package com.netassist.domain;

import javax.persistence.Entity;

@Entity
public class Funcionario extends Pessoa{
	
	private String usuario;
	private String senha;
	private String cargo;
	
	public Funcionario() {}
	
	public Funcionario(String usuario, String senha, String cargo) {
		super();
		this.usuario = usuario;
		this.senha = senha;
		this.cargo = cargo;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}
