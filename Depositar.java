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
public class Depositar {
    public  void depositarContaN (Conta Conta){
        double saldo=Double.parseDouble(JOptionPane.showInputDialog("Digite a qualtidade a ser depositada: "));
        Conta.setSaldo(saldo);
        
        Conta.contaN= saldo+Conta.contaN;
    }
    public void depositarContaP (Conta Conta){
       double saldo=Double.parseDouble(JOptionPane.showInputDialog("Digite a qualtidade a ser depositada: "));
        Conta.setSaldo(saldo);
        
        Conta.contaP= saldo+Conta.contaP;
    }
    public void depositarConta5stars (Conta Conta){
       double saldo=Double.parseDouble(JOptionPane.showInputDialog("Digite a qualtidade a ser depositada: "));
        Conta.setSaldo(saldo);
        
        Conta.conta5stars= saldo+Conta.conta5stars;
    }
}
