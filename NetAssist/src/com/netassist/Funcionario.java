/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netassist;

/**
 *
 * @author Usuário
 */
public class Funcionario extends Pessoa{
    
    private String usuario;
    private String senha;
    private int idFuncionario;
    private String cargo;

    public Funcionario(){
        super();
    }
    public Funcionario(String usuario, String senha, int idFuncionario, String cargo, String nome, String cpf, Endereco end) {
        super(nome, cpf, end);
        this.usuario = usuario;
        this.senha = senha;
        this.idFuncionario = idFuncionario;
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

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    } 
    
    @Override
    public String toString() {
        return "Funcionario{" + "usuario=" + usuario + ", senha=" + senha + ", idFuncionario=" + idFuncionario + ", cargo=" + cargo + '}';
    }
}
