package com.netassist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Tecnico extends Funcionario{
    int index;

    public Tecnico() {
    }

    public Tecnico(String usuario, String senha, int idFuncionario, String cargo, String nome, String cpf, Endereco end) {
        super(usuario, senha, idFuncionario, cargo, nome, cpf, end);
    }
    
    
    //Método para realizar a inserção do Cliente no ArrayList
    public void cadastrarCliente(ArrayList<Cliente> listaCliente, Cliente cliente, int autent, int con){
        Cliente novoCliente = new Cliente();
        Contrato novoContrato = new Contrato();
        Logins novoLogin = new Logins();
        novoCliente.setContrato(novoContrato);
        novoCliente.setLogin(novoLogin);
        novoCliente.setNome(JOptionPane.showInputDialog("CADASTRO DE CLIENTES!\nNOME: "));
        novoCliente.setCpf(JOptionPane.showInputDialog("CPF: "));       
        novoCliente.setIdCliente(Integer.parseInt(JOptionPane.showInputDialog("ID: ")));
        novoContrato.setVelocidade(Integer.parseInt(JOptionPane.showInputDialog("INFORMAÇÕES DO PLANO!\nVELOCIDADE: ")));
        novoContrato.setValorMensal(Float.parseFloat(JOptionPane.showInputDialog("VALOR DO PLANO: ")));
        novoContrato.setStatusContrato(Integer.parseInt(JOptionPane.showInputDialog("1 - Ativo\n2 - Cancelado\n3 - Bloqueado\nDIGITE O VALOR CORRESPONDENTE: ")));
        if(autent == 1){
            novoLogin.setAutenticacao("Hotspot");
        }
        else if(autent == 2){
            novoLogin.setAutenticacao("PPPoe");
        }
        else{
            novoLogin.setAutenticacao("IPoE");
        }
        if(con == 1){
            novoLogin.setTipoConexao("5.8");
        }
        else if(con == 2){
            novoLogin.setTipoConexao("Cabo");
        }
        else{
            novoLogin.setTipoConexao("Fibra");
        }
        
        novoLogin.setLoginAcesso(JOptionPane.showInputDialog("LOGIN DE ACESSO: "));
        novoLogin.setSenhaAcesso(JOptionPane.showInputDialog("SENHA DE ACESSO: "));
        //Os outros atributos foram abstraido;
        listaCliente.add(novoCliente);
    }
    //Método para realizar a remoção do Cliente no ArrayList
    public void removerCliente(ArrayList<Cliente> listaCliente, String cpf){
        for(int i=0; i<listaCliente.size(); i++){
                if(listaCliente.get(i).getCpf().equals(cpf)){
                    index = i;
                }
            }
        listaCliente.remove(index);
    }
   
    //Método para listar todos os Clientes do ArrayList
    public void listarCliente(ArrayList<Cliente> listaCliente){
        for(int i=0; i<listaCliente.size(); i++){
                System.out.println("NOME = " + listaCliente.get(i).getNome() + " -> CPF = " + listaCliente.get(i).getCpf());
            }
    }
    public void mudarAutenticacao(Cliente cliente, int tipo){
        if(tipo == 1){
             cliente.setAutenticacao("Hotspot");
        }
        else if(tipo == 2){
             cliente.setAutenticacao("PPPoe");
        }
        else{
             cliente.setAutenticacao("IPoE");
        }
    }
    public void mudarConexao(Cliente cliente, int tipo){
        if(tipo == 1){
             cliente.setTipoConexao("5.8");
        }
        else if(tipo == 2){
             cliente.setTipoConexao("Cabo");
        }
        else{
             cliente.setTipoConexao("Fibra");
        }
    }
}
