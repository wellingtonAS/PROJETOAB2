package com.netassist;

public class Endereco {
    private String cidade;
    private String estado;
    private String cep;
    private String rua;
    private int numero;

    public Endereco(String cidade, String estado, String cep, String rua, int numero) {
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
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
