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
public class Conta {
    double saldo,contaN,contaP,conta5stars;
    int num_conta,senha;
    String nome_dono;  
//Contrutores
    public Conta(int num_conta, double saldo, String nome_dono,int senha, double contaN, double contaP, double conta5stars) {
        this.num_conta = num_conta;
        this.saldo = saldo;
        this.nome_dono = nome_dono;
        this.senha=senha;
        this.contaN=contaN;
        this.contaP=contaP;
        this.conta5stars=conta5stars;           
    }
    public Conta() {
    }
//Gets e Sets
    public int getNum_conta() {
        return num_conta;
    }
    public void setNum_conta(int num_conta) {
        this.num_conta = num_conta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getNome_dono() {
        return nome_dono;
    }
    public void setNome_dono(String nome_dono) {
        this.nome_dono = nome_dono;
    }
    public int getSenha(){
        return senha;
    }
    public void setSenha(int senha){
        this.senha=senha;
    }
    public double getContaN() {
        return contaN;
    }
    public void setContaN(double contaN) {
        this.contaN = contaN;
    }
    public double getContaP() {
        return contaP;
    }
    public void setContaP(double contaP) {
        this.contaP = contaP;
    }
    public double getConta5stars() {
        return conta5stars;
    }
    public void setConta5stars(double conta5stars) {
        this.conta5stars = conta5stars;
    }
//Metodos
    public void criarConta (){
    }
    public void acessoCliente(){
    }
//Deposito    
    public  void depositarContaN (){
    }
    public void depositarContaP (){
    }
    public void depositarConta5stars (){
    }
//Saque    
    public void sacarContaN (){
    }
    public void sacarContaP (){
    }
    public void sacarConta5stars (){
    }
// Extrato   
    public void extratoContaN(){
    }
    public void extratoContaP(){
    }
    public void extratoConta5stars(){
    }
}
