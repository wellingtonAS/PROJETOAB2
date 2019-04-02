package com.netassist;

public class Contrato {
    private int velocidade;
    private float valorMensal;
    private int idContrato;
    private int statusContrato;
    public Contrato(int velocidade, float valorMensal, int idContrato) {
        this.velocidade = velocidade;
        this.valorMensal = valorMensal;
        this.idContrato = idContrato;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public float getValorMensal() {
        return valorMensal;
    }

    public void setValorMensal(float valorMensal) {
        this.valorMensal = valorMensal;
    }

    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }
    
}
