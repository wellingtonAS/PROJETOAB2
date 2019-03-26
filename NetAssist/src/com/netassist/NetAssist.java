
package com.netassist;

import java.util.ArrayList;
import java.util.Scanner;

public class NetAssist {

    public static void main(String[] args) {
        //ArrayList<Funcionario> cadastro1 = new ArrayList();
        //Scanner scan = new Scanner(System.in);
        //Endereco endereco = new Endereco();
        //Funcionario f1 = new Funcionario();
        //Endereco endereco = new Endereco();
        //System.out.println("BEM VINDO A NET ASSIST!");
        //System.out.print("Usuário: ");
        //f1.setUsuario(scan.nextLine());
        //f1.setNome("wellington Araújo Santos");
        //f1.setCpf("108.747.724-78");
        //f1.setCargo("Administrador");
        
        //cadastro1.add(f1);
        //System.out.println(cadastro1.contains(f1));
        
        ArrayList<Funcionario> listaFuncionarios = new ArrayList();
        ArrayList<Endereco> listaEndFuncionarios = new ArrayList();
        Endereco end1 = new Endereco("Arapiraca", "AL", "11.555-000", "Rua Sem Saída", 11);
        Funcionario funcionario1 = new Funcionario("aracomp", "123", 0, "Administrador", "Floretino de Melo Sales", "123.456.789-89", end1);
        /*funcionario1.setNome("Florentino de Melo Sales");
        funcionario1.setCpf("123.456.789.98");
        end1.setCidade("Arapiraca");
        end1.setEstado("AL");
        end1.setCep("57.330-000");
        end1.setNumero(26);
        end1.setRua("Sem Saída");
        funcionario1.setUsuario("aracomp");
        funcionario1.setSenha("admin123");
        funcionario1.setIdFuncionario(0);
        funcionario1.setCargo("Administrador");
        */
        
        listaFuncionarios.add(funcionario1);
        listaEndFuncionarios.add(end1);
        
        System.out.println(listaFuncionarios.get(0));
    }
    
}
