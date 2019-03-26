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
public class Endereco {
    private String cidade;
    private String estado;
    private String cep;
    private String rua;
    private int numero;

    public Endereco(String cidade, String estado, String cep, String rua, int numero) {
        this.cidade = "Taquarana";
        this.estado = "Alagoas";
        this.cep = "57.640-000";
        this.rua = "Rua Eraclito";
        this.numero = 11;
    }    
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
}
