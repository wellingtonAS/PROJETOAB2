package com.netassist;

public class Tecnico extends Funcionario{

    public Tecnico() {
    }

    public Tecnico(String usuario, String senha, int idFuncionario, int cargo, String nome, String cpf, Endereco end) {
        super(usuario, senha, idFuncionario, cargo, nome, cpf, end);
    }
    
}
