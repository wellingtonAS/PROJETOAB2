
package com.netassist;

import java.util.ArrayList;
import java.util.Scanner;

public class NetAssist {

    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        ArrayList<Funcionario> listaFuncionarios = new ArrayList();
        ArrayList<Endereco> listaEndFuncionarios = new ArrayList();
        Endereco end1 = new Endereco("Arapiraca", "AL", "11.555-000", "Rua Sem Saída", 11);
        Funcionario funcionario1 = new Funcionario("aracomp", "123", 0, 1, "Floretino de Melo Sales", "123.456.789-89", end1);
        Funcionario test = new Funcionario();
        listaFuncionarios.add(funcionario1);
        
        System.out.print("Usuario:");
        test.setUsuario(scan.nextLine());
        System.out.print("Senha:");
        test.setSenha(scan.next());
        System.out.println(listaFuncionarios.get(0).getUsuario());
        if(test.getUsuario() == listaFuncionarios.get(0).getUsuario()){
            System.out.println("Entrando do Sistema! Aguarde um pouco!");
        }

        funcionario1.efetuarLogin();
    }
    
}
