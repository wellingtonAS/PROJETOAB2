package com.netassist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Adm extends Funcionario{

    public Adm(){}

    public Adm(String usuario, String senha, int idFuncionario, String cargo, String nome, String cpf, Endereco end) {
        super(usuario, senha, idFuncionario, cargo, nome, cpf, end);
    }
    int index;
    int opcao;
    //Método para realizar cadastro de Funcionário, apenas acessível para objetos do tipo funcionario
    public void cadastrarFuncionario(ArrayList<Funcionario> listaFuncionario, Funcionario funcionario, int id){
        if(id == 1){
            Tecnico novoTecnico = new Tecnico();
            novoTecnico.setNome(JOptionPane.showInputDialog("CADASTRO DE FUNCIONÁRIOS!\nNOME: "));
            novoTecnico.setCpf(JOptionPane.showInputDialog("CPF: "));       
            novoTecnico.setIdFuncionario(Integer.parseInt(JOptionPane.showInputDialog("ID: ")));
            novoTecnico.setCargo("Técnico");
            novoTecnico.setUsuario(JOptionPane.showInputDialog("USUÁRIO: "));
            novoTecnico.setSenha(JOptionPane.showInputDialog("SENHA DE ACESSO: "));   
            //Os outros atributos foram abstraido;
            listaFuncionario.add(novoTecnico);
        }
        else{
            Adm novoAdm = new Adm();
            novoAdm.setNome(JOptionPane.showInputDialog("CADASTRO DE FUNCIONÁRIOS!\nNOME: "));
            novoAdm.setCpf(JOptionPane.showInputDialog("CPF: "));       
            novoAdm.setIdFuncionario(Integer.parseInt(JOptionPane.showInputDialog("ID: ")));
            novoAdm.setCargo("Administrador");
            novoAdm.setUsuario(JOptionPane.showInputDialog("USUÁRIO: "));
            novoAdm.setSenha(JOptionPane.showInputDialog("SENHA DE ACESSO: "));   
            //Os outros atributos foram abstraido;
            listaFuncionario.add(novoAdm);
        }
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
        /*for(int i=0; i<listaFuncionario.size(); i++){
            if(listaFuncionario.get(i).getCpf().equals(cpf)){
                index = i;
            }
        }*/
        funcionario.setUsuario(JOptionPane.showInputDialog("ATUALIZAÇÃO DE ACESSO!\nNOVO USUÁRIO: "));
        funcionario.setSenha(JOptionPane.showInputDialog("NOVA SENHA: "));
    }
    //Método para listar todos os Funcionários do ArrayList
    public void listarFuncionario(ArrayList<Funcionario> listaFuncionario){
        for(int i=0; i<listaFuncionario.size(); i++){
                System.out.println("NOME = " + listaFuncionario.get(i).getNome() + " -> CPF = " + listaFuncionario.get(i).getCpf());
            }
    }
    public void bloquearCliente(Cliente cliente){
        cliente.setStatusContrato(3);
    }
    public void liberarCliente(Cliente cliente){
        cliente.setStatusContrato(1);
    }
    
}