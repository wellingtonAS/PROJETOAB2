package com.netassist;

public class Contrato {
    private int velocidade;
    private Float valorMensal;
    private int statusContrato;

    public Contrato(){
        
    }
    public Contrato(int velocidade, Float valorMensal, int statusContrato) {
        this.velocidade = velocidade;
        this.valorMensal = valorMensal;
        this.statusContrato = statusContrato;
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

    public void setValorMensal(Float valorMensal) {
        this.valorMensal = valorMensal;
    }

    public int getStatusContrato() {
        return statusContrato;
    }

    public void setStatusContrato(int statusContrato) {
        this.statusContrato = statusContrato;
    }
    
}
