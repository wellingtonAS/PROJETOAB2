package com.netassist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Adm extends Funcionario{

    public Adm(){}

    public Adm(String usuario, String senha, int idFuncionario, int cargo, String nome, String cpf, Endereco end) {
        super(usuario, senha, idFuncionario, cargo, nome, cpf, end);
    }
    int index;
    int opcao;
    //Método para realizar cadastro de Funcionário, apenas acessível para objetos do tipo funcionario
    public void cadastrarFuncionario(ArrayList<Funcionario> listaFuncionario, Funcionario funcionario){
        Funcionario novoFuncionario = new Funcionario();
        novoFuncionario.setNome(JOptionPane.showInputDialog("NOME: "));
        novoFuncionario.setCpf(JOptionPane.showInputDialog("CPF: "));       
        novoFuncionario.setIdFuncionario(Integer.parseInt(JOptionPane.showInputDialog("ID: ")));
        novoFuncionario.setCargo(Integer.parseInt(JOptionPane.showInputDialog("1 - Administrador\n2- Técnico\nDIGITE O VALOR CORRESPONDENTE AO CARGO: ")));
        novoFuncionario.setUsuario(JOptionPane.showInputDialog("USUÁRIO: "));
        novoFuncionario.setSenha(JOptionPane.showInputDialog("SENHA DE ACESSO: "));   
        //Os outros atributos foram abstraido;
        listaFuncionario.add(novoFuncionario);
    }
    
    //Método para realizar a remoção de Funcionario, apenas acessível para objetos do tipo Funcionario 
    public void removerFuncionario(ArrayList<Funcionario> listaFuncionario, String cpf){
        for(int i=0; i<listaFuncionario.size(); i++){
                if(listaFuncionario.get(i).getCpf().equals(cpf)){
                    index = i;
                }
            }
        listaFuncionario.remove(index);
    }
    //Método para realizar alterações em Funcionário, apenas acessível para objetos do tipo Funcionario
    public void alterarFuncionario(ArrayList<Funcionario> listaFuncionario, String cpf, Funcionario funcionario){
        for(int i=0; i<listaFuncionario.size(); i++){
            if(listaFuncionario.get(i).getCpf().equals(cpf)){
                index = i;
            }
        }
        funcionario.setUsuario(JOptionPane.showInputDialog("NOVO USUÁRIO: "));
        funcionario.setSenha(JOptionPane.showInputDialog("NOVA SENHA: "));
    }
    //Método para listar todos os Funcionários do ArrayList
    public void listarFuncionario(ArrayList<Funcionario> listaFuncionario){
        for(int i=0; i<listaFuncionario.size(); i++){
                System.out.println(listaFuncionario.get(i));
            }
    }
}