package com.netassist;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private Endereco end;

    public Pessoa(String nome, String cpf, Endereco end) {
        this.nome = nome;
        this.cpf = cpf;
        this.end = end;
    }

    public String getCidade() {
        return end.getCidade();
    }

    public void setCidade(String cidade) {
        end.setCidade(cidade);
    }

    public String getEstado() {
        return end.getEstado();
    }

    public void setEstado(String estado) {
        end.setEstado(estado);
    }

    public String getCep() {
        return end.getCep();
    }

    public void setCep(String cep) {
        end.setCep(cep);
    }

    public String getRua() {
        return end.getRua();
    }

    public void setRua(String rua) {
        end.setRua(rua);
    }

    public int getNumero() {
        return end.getNumero();
    }

    public void setNumero(int numero) {
        end.setNumero(numero);
    }
    
    public Pessoa(){
        super();
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
