package com.netassist;

public class Cliente extends Pessoa{
    private int idCliente;
    private Contrato contrato;
    private Logins login;

    
    public Cliente(){}
    public Cliente(int idCliente, Contrato contrato, String nome, String cpf, Endereco end) {
        super(nome, cpf, end);
        this.idCliente = idCliente;
        this.contrato = contrato;
    }

    public Cliente(int idCliente, Contrato contrato) {
        this.idCliente = idCliente;
        this.contrato = contrato;
    }

    public Logins getLogin() {
        return login;
    }

    public void setLogin(Logins login) {
        this.login = login;
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
    public String getAutenticacao() {
        return login.getAutenticacao();
    }

    public void setAutenticacao(String autenticacao) {
        login.setAutenticacao(autenticacao);
    }

    public String getTipoConexao() {
        return login.getTipoConexao();
    }

    public void setTipoConexao(String tipoConexao) {
        login.setTipoConexao(tipoConexao);
    }

    public String getLoginAcesso() {
        return login.getLoginAcesso();
    }

    public void setLoginAcesso(String loginAcesso) {
        login.setLoginAcesso(loginAcesso);
    }

    public String getSenhaAcesso() {
        return login.getSenhaAcesso();
    }

    public void setSenhaAcesso(String senhaAcesso) {
        login.setSenhaAcesso(senhaAcesso);
    }

    public String toString() {
        return login.toString();
    }
    
    public int getVelocidade() {
        return contrato.getVelocidade();
    }

    public void setVelocidade(int velocidade) {
        contrato.setVelocidade(velocidade);
    }

    public float getValorMensal() {
        return contrato.getValorMensal();
    }

    public void setValorMensal(Float valorMensal) {
        contrato.setValorMensal(valorMensal);
    }

    public int getStatusContrato() {
        return contrato.getStatusContrato();
    }

    public void setStatusContrato(int statusContrato) {
        contrato.setStatusContrato(statusContrato);
    }
    
}
