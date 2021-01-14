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
public class BancoAPS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta c1 = new Conta();
        Cadastro cad1 = new Cadastro();
        Depositar d1 = new Depositar();
        Sacar s1 = new Sacar();
        Extrato e1 = new Extrato();
        
        int cont=1;
        int escolha;
        escolha=Integer.parseInt(JOptionPane.showInputDialog(null,"Seja Bem Vindo ao Banco Brasilesco\n"
                + "Para Criar sua Conta digite 1: \nPara acessar sua conta digite 2: "));
        if (escolha==1){
// ESCOLHA CRIAR CONTA            
            cad1.criarConta(c1);
            do{
            int escolha2=Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha qual tipo de conta utilizar \nConta Normal digite 1: \nConta Poupança "
                    + "digite 2: \nConta Cinco Estrelas digite 3 \nPara Finalizar digite 4 "));
            switch(escolha2){
                case 1:
                    int cont2=1;
                    do{
                    int escolhaN1=Integer.parseInt(JOptionPane.showInputDialog(null,"Conta Normal:\nPara Deposito digite 1: \nPara Saque digite 2: \nPara Extrato digite 3: "));
                    switch(escolhaN1){
                        case 1:
                            d1.depositarContaN(c1);break;
                        case 2:
                            s1.sacarContaN(c1);break;
                        case 3:
                            e1.extratoContaN(c1);break;
                        default:
                            System.out.println("Opção Incorreta");break;
                    }
                    cont2=Integer.parseInt(JOptionPane.showInputDialog("Para Continuar transações em Conta Normal Digite 1\nPara Encerrar Digite 2: "));
                    }while(cont2==1);
                    break;
                case 2:
                    int cont3=1;
                    do{
                    int escolhaP1=Integer.parseInt(JOptionPane.showInputDialog(null,"Conta Poupança:\nPara Deposito digite 1: \nPara Saque digite 2: \nPara Extrato digite 3: "));
                    switch(escolhaP1){
                        case 1:
                            d1.depositarContaP(c1);break;
                        case 2:
                            s1.sacarContaP(c1);break;
                        case 3:
                            e1.extratoContaP(c1);break;
                        default:
                            System.out.println("Opção Incorreta");break;
                    }
                    cont3=Integer.parseInt(JOptionPane.showInputDialog("Para Continuar transações em Conta Poupança Digite 1\nPara Encerrar Digite 2: "));
                    }while(cont3==1);
                    break;
                case 3:
                    int cont4=1;
                    do{
                    int escolha5stars1=Integer.parseInt(JOptionPane.showInputDialog(null,"Conta 5 Estrelas:\nPara Deposito digite 1: \nPara Saque digite 2: \nPara Extrato digite 3: "));
                    switch(escolha5stars1){
                        case 1:
                            d1.depositarConta5stars(c1);break;
                        case 2:
                            s1.sacarConta5stars(c1);break;
                        case 3:
                            e1.extratoConta5stars(c1);break;
                        default:
                            System.out.println("Opção Incorreta");break;
                    }
                    cont4=Integer.parseInt(JOptionPane.showInputDialog("Para Continuar transações em Conta 5 Estrelas Digite 1\nPara Encerrar Digite 2: "));
                    }while(cont4==1);
                    break;
                case 4: 
                    System.out.println("Finalizando Operações \nAgradecemos a Preferencia");
                    System.exit(0);
                default:
                    System.out.println("Opção Escolhida Incorreta");
                    break;
            }
        }while(cont<2); 
///////////////////////////////////////////////////////////////////////////////           
        }else if (escolha==2){
// OPÇÃO CONTA JÁ EXISTENTE            
            cad1.acessoCliente(c1);
            do{
            int escolha2=Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha qual tipo de conta utilizar \nConta Normal digite 1: \nConta Poupança "
                    + "digite 2: \nConta Cinco Estrelas digite 3 \nPara Finalizar digite 4 "));
            switch(escolha2){
                case 1:
                    int cont2=1;
                    do{
                    int escolhaN1=Integer.parseInt(JOptionPane.showInputDialog(null,"Conta Normal:\nPara Deposito digite 1: \nPara Saque digite 2: \nPara Extrato digite 3: "));
                    switch(escolhaN1){
                        case 1:
                            d1.depositarContaN(c1);break;
                        case 2:
                            s1.sacarContaN(c1);break;
                        case 3:
                            e1.extratoContaN(c1);break;
                        default:
                            System.out.println("Opção Incorreta");break;
                    }
                    cont2=Integer.parseInt(JOptionPane.showInputDialog("Para Continuar transações em Conta Normal Digite 1\nPara Encerrar Digite 2: "));
                    }while(cont2==1);
                    break;
                case 2:
                    int cont3=1;
                    do{
                    int escolhaP1=Integer.parseInt(JOptionPane.showInputDialog(null,"Conta Poupança:\nPara Deposito digite 1: \nPara Saque digite 2: \nPara Extrato digite 3: "));
                    switch(escolhaP1){
                        case 1:
                            d1.depositarContaP(c1);break;
                        case 2:
                            s1.sacarContaP(c1);break;
                        case 3:
                            e1.extratoContaP(c1);break;
                        default:
                            System.out.println("Opção Incorreta");break;
                    }
                    cont3=Integer.parseInt(JOptionPane.showInputDialog("Para Continuar transações em Conta Poupança Digite 1\nPara Encerrar Digite 2: "));
                    }while(cont3==1);
                    break;
                case 3:
                    int cont4=1;
                    do{
                    int escolha5stars1=Integer.parseInt(JOptionPane.showInputDialog(null,"Conta 5 Estrelas:\nPara Deposito digite 1: \nPara Saque digite 2: \nPara Extrato digite 3: "));
                    switch(escolha5stars1){
                        case 1:
                            d1.depositarConta5stars(c1);break;
                        case 2:
                            s1.sacarConta5stars(c1);break;
                        case 3:
                            e1.extratoConta5stars(c1);break;
                        default:
                            System.out.println("Opção Incorreta");break;
                    }
                    cont4=Integer.parseInt(JOptionPane.showInputDialog("Para Continuar transações em Conta 5 Estrelas Digite 1\nPara Encerrar Digite 2: "));
                    }while(cont4==1);
                    break;
                case 4: 
                    System.out.println("Finalizando Operações \nAgradecemos a Preferencia");
                    System.exit(0);
                default:
                    System.out.println("Opção Escolhida Incorreta");
                    break;
            }
        }while(cont<2);
        }else{
            JOptionPane.showMessageDialog(null,"Opção Incorreta");
        }   
    }
}
