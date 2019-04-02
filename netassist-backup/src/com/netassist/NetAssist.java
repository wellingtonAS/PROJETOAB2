package com.netassist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class NetAssist {

    public static void main(String[] args) { 

        ArrayList<Funcionario> listaFuncionarios = new ArrayList();
        ArrayList<Endereco> listaEndFuncionarios = new ArrayList();
        ArrayList<Endereco> listaEndClientes = new ArrayList();
        ArrayList<Cliente> listaClientes = new ArrayList();
        
        Endereco endPadrao = new Endereco("Arapiraca", "AL", "11.555-000", "Rua Sem Saída", 11);
        Endereco thiagoEnd = new Endereco("Arapiraca", "AL", "57.325-000", "Rua 24 de Agosto", 25);
        Adm funcionarioPadrao = new Adm("aracomp", "123", 0, 1, "Floretino de Melo Sales", "12345678989", endPadrao);
        Tecnico thiago = new Tecnico("Thiago", "p2lp2", 1, 1, "Thiago de Melo Sales", "98765432101", thiagoEnd);
        Adm test = new Adm();
        listaFuncionarios.add(funcionarioPadrao);
        listaFuncionarios.add(thiago);
        float count = 0;
        
        
        do{
            test.setUsuario(JOptionPane.showInputDialog("Usuário: "));
            test.setSenha(JOptionPane.showInputDialog("Senha: "));
            count++;
            if(count == 3){
                System.out.println("Usuario Bloqueado!");
                break;
            }
        }while(test.efetuarLogin(test, listaFuncionarios) == false);
        
        if(test.efetuarLogin(test, listaFuncionarios) == true){
            int indice = 0;
            for(int i=0; i<listaFuncionarios.size(); i++){
                if((test.getUsuario().equals(listaFuncionarios.get(i).getUsuario()))&&(test.getSenha().equals(listaFuncionarios.get(i).getSenha()))){
                    indice = i;
                    break;
                }
            }
            test.casdastrarFuncionario(listaFuncionarios, indice, test);
        }
    }
    
}
