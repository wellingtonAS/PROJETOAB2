package com.netassist;

public class Pessoa {
    private String nome;
    private String cpf;
    private Endereco end;

    public Pessoa(){
        //this.end = new Endereco();
    }
    public Pessoa(String nome, String cpf, Endereco endereco) {
        this.nome = "Wellington Araújo Santos";
        this.cpf = "123.456.789-98";
        this.end = end;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEnd() {
        return end;
    }

    public void setEnd(Endereco end) {
        this.end = end;
    }

    

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", cpf=" + cpf + ", endereco=" + end + '}';
    }
    
    
}
