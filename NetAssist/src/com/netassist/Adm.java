package com.netassist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Adm extends Funcionario{

    public Adm(){}

    public Adm(String usuario, String senha, int idFuncionario, int cargo, String nome, String cpf, Endereco end) {
        super(usuario, senha, idFuncionario, cargo, nome, cpf, end);
    }
    
    public void casdastrarFuncionario(ArrayList<Funcionario> listaFuncionario, int ind, Funcionario funcionario){
        Funcionario novoFuncionario = new Funcionario();
        System.out.println(listaFuncionario.get(ind).getNome());
        int ver = 1;
        
        do{
            novoFuncionario.setNome(JOptionPane.showInputDialog("Digite o NOME: "));
            novoFuncionario.setNome(JOptionPane.showInputDialog("Digite o CPF: "));
            for(int i=0; i<listaFuncionario.size(); i++){
                if((funcionario.getNome().equals(listaFuncionario.get(i).getNome()))&&(funcionario.getCpf().equals(listaFuncionario.get(i).getCpf()))){
                    ver = 0;
                    break;
                }
        }
            
        }while(ver == 1);
        
        novoFuncionario.setNome(JOptionPane.showInputDialog("Digite o : "));
        novoFuncionario.setNome(JOptionPane.showInputDialog("Digite o nome: "));
        novoFuncionario.setNome(JOptionPane.showInputDialog("Digite o nome: "));
        novoFuncionario.setNome(JOptionPane.showInputDialog("Digite o nome: "));
        novoFuncionario.setNome(JOptionPane.showInputDialog("Digite o nome: "));
        novoFuncionario.setNome(JOptionPane.showInputDialog("Digite o nome: "));
        novoFuncionario.setNome(JOptionPane.showInputDialog("Digite o nome: "));
        novoFuncionario.setNome(JOptionPane.showInputDialog("Digite o nome: "));
        novoFuncionario.setNome(JOptionPane.showInputDialog("Digite o nome: "));
        novoFuncionario.setNome(JOptionPane.showInputDialog("Digite o nome: "));
        novoFuncionario.setNome(JOptionPane.showInputDialog("Digite o nome: "));
        
        
    }
}
