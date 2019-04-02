package com.netassist;

public class Logins {
    private int autenticacao;
    private int tipoConexao;
    private String loginAcesso;
    private String senhaAcesso;
    private String ip;

    public Logins(int autenticacao, int tipoConexao, String loginAcesso, String senhaAcesso, String ip) {
        this.autenticacao = autenticacao;
        this.tipoConexao = tipoConexao;
        this.loginAcesso = loginAcesso;
        this.senhaAcesso = senhaAcesso;
        this.ip = ip;
    }
    
    public int getAutenticacao() {
        return autenticacao;
    }

    public void setAutenticacao(int autenticacao) {
        this.autenticacao = autenticacao;
    }

    public int getTipoConexao() {
        return tipoConexao;
    }

    public void setTipoConexao(int tipoConexao) {
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

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "Logins{" + "autenticacao=" + autenticacao + ", tipoConexao=" + tipoConexao + ", loginAcesso=" + loginAcesso + ", senhaAcesso=" + senhaAcesso + ", ip=" + ip + '}';
    }   
}
