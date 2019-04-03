package com.netassist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class NetAssist {

    public static void main(String[] args) { 

        //Instanciamento dos Arrays
        ArrayList<Funcionario> listaFuncionarios = new ArrayList();
        ArrayList<Cliente> listaClientes = new ArrayList();
        //ArrayList<Endereco> listaEndFuncionarios = new ArrayList();
        //ArrayList<Endereco> listaEndClientes = new ArrayList();
        //ArrayList<Contrato> listaContratos = new ArrayList();
        
        //Instanciamento dos Objetos
        Endereco endPadrao = new Endereco("Arapiraca", "AL", "11.555-000", "Rua Sem Saída", 11);
        Endereco thiagoEnd = new Endereco("Arapiraca", "AL", "57.325-000", "Rua 24 de Agosto", 25);
        Adm funcionarioPadrao = new Adm("aracomp", "123", 0, "Administrador", "Floretino de Melo Sales", "12345678989", endPadrao);
        Tecnico thiago = new Tecnico("Thiago", "p2lp2", 1, "Técnico", "Thiago de Melo Sales", "98765432101", thiagoEnd);
        Contrato carlosCont = new Contrato();
        Cliente carlos = new Cliente();
        carlos.setContrato(carlosCont);
        //Inserção dos Obejetos nos ArraysLists correspondendte a cada tipo
        listaFuncionarios.add(funcionarioPadrao);
        listaFuncionarios.add(thiago);
        listaClientes.add(carlos);
        int opcao;
        int cad;
        int aut;
        int conn;
        conn = -1;
        aut = -1;
        cad = -1;
        opcao = -1;
        
        do{ 
            while(opcao != 0 && opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5 && opcao != 6 && opcao != 7 && opcao != 8 && opcao != 9 && opcao != 10 && opcao != 11){
                opcao = Integer.parseInt(JOptionPane.showInputDialog("BEM VINDO A NET ASSIST!\nQue operação você deseja fazer?\n1 - Cadastro de Funcionário\n2 - Alterar Usuário\n3 - Deletar Funcionario\n4 - Listar Funcionários\n5 - Bloquear Cliente\n6 - Liberar Cliente\n7 - Deletar Cliente\n8 - Listar Clientes\n9 - Mudar Autenticação\n10 - Mudar Conexão\n11 - Cadastro de Cliente\nDigite a qualquer momento 0 para sair!"));
            }
            if(opcao == 1){
                while(cad != 1 && cad != 2){
                    cad = Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar como:\n1 - Técnico\n2 - Administrador"));
                }
                if(cad == 1){
                    Tecnico testTecnico = new Tecnico();
                    funcionarioPadrao.cadastrarFuncionario(listaFuncionarios, testTecnico, cad);
                    cad = -1;
                    opcao = -1;
                    while(opcao != 0 && opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5 && opcao != 6 && opcao != 7 && opcao != 8 && opcao != 9 && opcao != 10 && opcao != 11){
                        opcao = Integer.parseInt(JOptionPane.showInputDialog("BEM VINDO A NET ASSIST!\nQue operação você deseja fazer?\n1 - Cadastro de Funcionário\n2 - Alterar Usuário\n3 - Deletar Funcionario\n4 - Listar Funcionários\n5 - Bloquear Cliente\n6 - Liberar Cliente\n7 - Deletar Cliente\n8 - Listar Clientes\n9 - Mudar Autenticação\n10 - Mudar Conexão\n11 - Cadastro de Cliente\nDigite a qualquer momento 0 para sair!"));
                    }                    
                }
                else{
                    Adm testAdm = new Adm();
                    funcionarioPadrao.cadastrarFuncionario(listaFuncionarios, testAdm, cad);
                    cad = -1;
                    opcao = -1;
                    while(opcao != 0 && opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5 && opcao != 6 && opcao != 7 && opcao != 8 && opcao != 9 && opcao != 10 && opcao != 11){
                        opcao = Integer.parseInt(JOptionPane.showInputDialog("BEM VINDO A NET ASSIST!\nQue operação você deseja fazer?\n1 - Cadastro de Funcionário\n2 - Alterar Usuário\n3 - Deletar Funcionario\n4 - Listar Funcionários\n5 - Bloquear Cliente\n6 - Liberar Cliente\n7 - Deletar Cliente\n8 - Listar Clientes\n9 - Mudar Autenticação\n10 - Mudar Conexão\n11 - Cadastro de Cliente\nDigite a qualquer momento 0 para sair!"));
                    }
                }
            }
            else if(opcao == 2){
                funcionarioPadrao.alterarFuncionario(listaFuncionarios, funcionarioPadrao.getCpf(), funcionarioPadrao);
                cad = -1;
                opcao = -1;
                while(opcao != 0 && opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5 && opcao != 6 && opcao != 7 && opcao != 8 && opcao != 9 && opcao != 10 && opcao != 11){
                    opcao = Integer.parseInt(JOptionPane.showInputDialog("BEM VINDO A NET ASSIST!\nQue operação você deseja fazer?\n1 - Cadastro de Funcionário\n2 - Alterar Usuário\n3 - Deletar Funcionario\n4 - Listar Funcionários\n5 - Bloquear Cliente\n6 - Liberar Cliente\n7 - Deletar Cliente\n8 - Listar Clientes\n9 - Mudar Autenticação\n10 - Mudar Conexão\n11 - Cadastro de Cliente\nDigite a qualquer momento 0 para sair!"));
                }
            }
            else if (opcao == 3){
                funcionarioPadrao.removerFuncionario(listaFuncionarios, funcionarioPadrao.getCpf());
                cad = -1;
                opcao = -1;
                while(opcao != 0 && opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5 && opcao != 6 && opcao != 7 && opcao != 8 && opcao != 9 && opcao != 10 && opcao != 11){
                    opcao = Integer.parseInt(JOptionPane.showInputDialog("BEM VINDO A NET ASSIST!\nQue operação você deseja fazer?\n1 - Cadastro de Funcionário\n2 - Alterar Usuário\n3 - Deletar Funcionario\n4 - Listar Funcionários\n5 - Bloquear Cliente\n6 - Liberar Cliente\n7 - Deletar Cliente\n8 - Listar Clientes\n9 - Mudar Autenticação\n10 - Mudar Conexão\n11 - Cadastro de Cliente\nDigite a qualquer momento 0 para sair!"));
                }
            }
            else if(opcao == 4){
                funcionarioPadrao.listarFuncionario(listaFuncionarios);
                cad = -1;
                opcao = -1;
                while(opcao != 0 && opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5 && opcao != 6 && opcao != 7 && opcao != 8 && opcao != 9 && opcao != 10 && opcao != 11){
                    opcao = Integer.parseInt(JOptionPane.showInputDialog("BEM VINDO A NET ASSIST!\nQue operação você deseja fazer?\n1 - Cadastro de Funcionário\n2 - Alterar Usuário\n3 - Deletar Funcionario\n4 - Listar Funcionários\n5 - Bloquear Cliente\n6 - Liberar Cliente\n7 - Deletar Cliente\n8 - Listar Clientes\n9 - Mudar Autenticação\n10 - Mudar Conexão\n11 - Cadastro de Cliente\nDigite a qualquer momento 0 para sair!"));
                }
            }
            else if(opcao == 5){
                funcionarioPadrao.bloquearCliente(carlos);
                cad = -1;
                opcao = -1;
                while(opcao != 0 && opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5 && opcao != 6 && opcao != 7 && opcao != 8 && opcao != 9 && opcao != 10 && opcao != 11){
                    opcao = Integer.parseInt(JOptionPane.showInputDialog("BEM VINDO A NET ASSIST!\nQue operação você deseja fazer?\n1 - Cadastro de Funcionário\n2 - Alterar Usuário\n3 - Deletar Funcionario\n4 - Listar Funcionários\n5 - Bloquear Cliente\n6 - Liberar Cliente\n7 - Deletar Cliente\n8 - Listar Clientes\n9 - Mudar Autenticação\n10 - Mudar Conexão\n11 - Cadastro de Cliente\nDigite a qualquer momento 0 para sair!"));
                }
            }
            else if(opcao == 6){
                funcionarioPadrao.liberarCliente(carlos);
                cad = -1;
                opcao = -1;
                while(opcao != 0 && opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5 && opcao != 6 && opcao != 7 && opcao != 8 && opcao != 9 && opcao != 10 && opcao != 11){
                    opcao = Integer.parseInt(JOptionPane.showInputDialog("BEM VINDO A NET ASSIST!\nQue operação você deseja fazer?\n1 - Cadastro de Funcionário\n2 - Alterar Usuário\n3 - Deletar Funcionario\n4 - Listar Funcionários\n5 - Bloquear Cliente\n6 - Liberar Cliente\n7 - Deletar Cliente\n8 - Listar Clientes\n9 - Mudar Autenticação\n10 - Mudar Conexão\n11 - Cadastro de Cliente\nDigite a qualquer momento 0 para sair!"));
                }
            }
            else if(opcao == 7){
                thiago.removerCliente(listaClientes, carlos.getCpf());
                cad = -1;
                opcao = -1;
                while(opcao != 0 && opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5 && opcao != 6 && opcao != 7 && opcao != 8 && opcao != 9 && opcao != 10 && opcao != 11){
                    opcao = Integer.parseInt(JOptionPane.showInputDialog("BEM VINDO A NET ASSIST!\nQue operação você deseja fazer?\n1 - Cadastro de Funcionário\n2 - Alterar Usuário\n3 - Deletar Funcionario\n4 - Listar Funcionários\n5 - Bloquear Cliente\n6 - Liberar Cliente\n7 - Deletar Cliente\n8 - Listar Clientes\n9 - Mudar Autenticação\n10 - Mudar Conexão\n11 - Cadastro de Cliente\nDigite a qualquer momento 0 para sair!"));
                }
            }
            else if(opcao == 8){
                thiago.listarCliente(listaClientes);
                cad = -1;
                opcao = -1;
                while(opcao != 0 && opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5 && opcao != 6 && opcao != 7 && opcao != 8 && opcao != 9 && opcao != 10 && opcao != 11){
                    opcao = Integer.parseInt(JOptionPane.showInputDialog("BEM VINDO A NET ASSIST!\nQue operação você deseja fazer?\n1 - Cadastro de Funcionário\n2 - Alterar Usuário\n3 - Deletar Funcionario\n4 - Listar Funcionários\n5 - Bloquear Cliente\n6 - Liberar Cliente\n7 - Deletar Cliente\n8 - Listar Clientes\n9 - Mudar Autenticação\n10 - Mudar Conexão\n11 - Cadastro de Cliente\nDigite a qualquer momento 0 para sair!"));
                }
            }
            else if(opcao == 9){
                aut = Integer.parseInt(JOptionPane.showInputDialog("Qual o novo tipo de Autenticação?\n1 - Hotspot\n2 - PPPoe\n3 - IPoE"));
                thiago.mudarAutenticacao(carlos, aut);
                cad = -1;
                opcao = -1;
                while(opcao != 0 && opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5 && opcao != 6 && opcao != 7 && opcao != 8 && opcao != 9 && opcao != 10 && opcao != 11){
                    opcao = Integer.parseInt(JOptionPane.showInputDialog("BEM VINDO A NET ASSIST!\nQue operação você deseja fazer?\n1 - Cadastro de Funcionário\n2 - Alterar Usuário\n3 - Deletar Funcionario\n4 - Listar Funcionários\n5 - Bloquear Cliente\n6 - Liberar Cliente\n7 - Deletar Cliente\n8 - Listar Clientes\n9 - Mudar Autenticação\n10 - Mudar Conexão\n11 - Cadastro de Cliente\nDigite a qualquer momento 0 para sair!"));
                }
            }
            else if(opcao == 10){
                conn = Integer.parseInt(JOptionPane.showInputDialog("Qual o novo tipo de Conexão?\n1 - 5.8\n2 - Cabo\n3 - Fibra"));
                thiago.mudarConexao(carlos, conn);
                cad = -1;
                opcao = -1;
                while(opcao != 0 && opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5 && opcao != 6 && opcao != 7 && opcao != 8 && opcao != 9 && opcao != 10 && opcao != 11){
                    opcao = Integer.parseInt(JOptionPane.showInputDialog("BEM VINDO A NET ASSIST!\nQue operação você deseja fazer?\n1 - Cadastro de Funcionário\n2 - Alterar Usuário\n3 - Deletar Funcionario\n4 - Listar Funcionários\n5 - Bloquear Cliente\n6 - Liberar Cliente\n7 - Deletar Cliente\n8 - Listar Clientes\n9 - Mudar Autenticação\n10 - Mudar Conexão\n11 - Cadastro de Cliente\nDigite a qualquer momento 0 para sair!"));
                }
            }
            else if(opcao == 11){
                Cliente clientTest = new Cliente();
                thiago.cadastrarCliente(listaClientes, clientTest, 1, 1);
                cad = -1;
                opcao = -1;
                while(opcao != 0 && opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5 && opcao != 6 && opcao != 7 && opcao != 8 && opcao != 9 && opcao != 10 && opcao != 11){
                    opcao = Integer.parseInt(JOptionPane.showInputDialog("BEM VINDO A NET ASSIST!\nQue operação você deseja fazer?\n1 - Cadastro de Funcionário\n2 - Alterar Usuário\n3 - Deletar Funcionario\n4 - Listar Funcionários\n5 - Bloquear Cliente\n6 - Liberar Cliente\n7 - Deletar Cliente\n8 - Listar Clientes\n9 - Mudar Autenticação\n10 - Mudar Conexão\n11 - Cadastro de Cliente\nDigite a qualquer momento 0 para sair!"));
                }
            }
        }while(opcao != 0);
    } 
}   
