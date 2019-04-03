package com.netassist;

public class Logins {
    private String autenticacao;
    private String tipoConexao;
    private String loginAcesso;
    private String senhaAcesso;

    public Logins(){}
    public Logins(String autenticacao, String tipoConexao, String loginAcesso, String senhaAcesso) {
        this.autenticacao = autenticacao;
        this.tipoConexao = tipoConexao;
        this.loginAcesso = loginAcesso;
        this.senhaAcesso = senhaAcesso;
      
    }
    
    public String getAutenticacao() {
        return autenticacao;
    }

    public void setAutenticacao(String autenticacao) {
        this.autenticacao = autenticacao;
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }

    public String getLoginAcesso() {
        return loginAcesso;
    }

    public void setLoginAcesso(String loginAcesso) {
        this.loginAcesso = loginAcesso;
    }

    public String getSenhaAcesso() {
        return senhaAcesso;
    }

    public void setSenhaAcesso(String senhaAcesso) {
        this.senhaAcesso = senhaAcesso;
    }   
}
