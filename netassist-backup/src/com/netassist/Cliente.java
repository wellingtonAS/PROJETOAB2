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
public class Cliente extends Pessoa{
    private int statusContrato;
    private int statusAcesso;
    private int idCliente;
    private Contrato contrato;

    public Cliente(String nome, String cpf, Endereco endereco) {
        super();
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

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }
  
}
