/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoaps;

import javax.swing.JOptionPane;

/**
 *
 * @author felip
 */
public class Cadastro {
    public void criarConta (Conta Conta){
        JOptionPane.showMessageDialog(null, "Para Prosseguir com a criação da conta preencha os campos a seguir: ");
        String nome_dono=JOptionPane.showInputDialog(null,"Digite seu nome completo:");
        Conta.setNome_dono(nome_dono);
        int senha=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite uma senha para conta:"));
        Conta.setSenha(senha);
        Conta.setNum_conta(0000001);
        Conta.setContaN(100.00);
        Conta.setContaP(0);
        Conta.setConta5stars(500.00);
        JOptionPane.showMessageDialog(null, "Numero da conta:"+Conta.getNum_conta());
    }
    public void acessoCliente(Conta Conta){
        Conta.setContaN(100.00);
        Conta.setContaP(0);
        Conta.setConta5stars(500.00);
        int num_conta=Integer.parseInt(JOptionPane.showInputDialog("Digite o Numero da conta:"));
        Conta.setNum_conta(num_conta);
        JOptionPane.showMessageDialog(null, "Seja Bem Vindo:");
    }
}
