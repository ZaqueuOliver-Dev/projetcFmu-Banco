/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoaps;

/**
 *
 * @author felip
 */
public class Extrato {
    public void extratoContaN(Conta Conta){
        System.out.println("Numero da conta:"+Conta.getNum_conta());
        System.out.println("Conta Normal\nSaldo: "+Conta.getContaN());
    }
    public void extratoContaP(Conta Conta){
        System.out.println("Numero da conta:"+Conta.getNum_conta());
        System.out.println("Conta Poupança\nSaldo: "+Conta.getContaP());
    }
    public void extratoConta5stars(Conta Conta){
        System.out.println("Numero da conta:"+Conta.getNum_conta());
        System.out.println("Conta 5 Estrelas\nSaldo: "+Conta.getConta5stars());
    }
}
