package com.netassist;

public class Cliente extends Pessoa{
    private int idCliente;
    private Contrato contrato;

    public Cliente() {
        super();
    }

    public Cliente(int idCliente, Contrato contrato, String nome, String cpf, Endereco end) {
        super(nome, cpf, end);
        this.idCliente = idCliente;
        this.contrato = contrato;
    }

    public Cliente(int idCliente, Contrato contrato) {
        this.idCliente = idCliente;
        this.contrato = contrato;
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
    
    //public void cadastrarCliente()
}
