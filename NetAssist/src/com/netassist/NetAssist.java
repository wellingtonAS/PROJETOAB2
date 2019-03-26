
package com.netassist;

import java.util.Scanner;

public class NetAssist {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Funcionario f1 = new Funcionario();
        System.out.println("BEM VINDO A NET ASSIST!");
        System.out.print("Usuário: ");
        f1.setUsuario(scan.nextLine());
        System.out.print("Senha: ");
        f1.setSenha(scan.nextLine());
        
        System.out.println("Usuario: " + f1.getUsuario() + "Senha: " + f1.getSenha());
    }
    
}
