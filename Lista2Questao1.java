/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2java;

/**
 *
 * @author mauri
 */
public class Lista2Questao1 {
    
    private float saldo;
    private float deposito;
    private float saque;
    
    
    public float getDeposito(){
        return this.deposito;
    }
    public void setDeposito(float deposito){
        this.deposito = deposito;
        depositar();
        System.out.println("Quantia do deposito en R$:" + getDeposito() + " transação realizada com sucesso!");
    }
     
    public float getSaque(){
        return this.saque;
    }
    public void setSaque(float saque){
        this.saque = saque;
        sacar();
    }
     
    private void depositar(){
        saldo = deposito + saldo;
    }     
                
    private void sacar(){
        
        if (saque <= saldo){
            
            saldo = saldo - saque;
        
            System.out.println("Saque de R$:" + getSaque() + " Saque realizado com sucesso!");   
        }
        
        else if (saque > saldo){
            System.out.println("Saldo Insuficiente!");
        }  
    }
    
    public void Impsaldo(){
        System.out.println("Seu saldo Bancario é de: R$" + this.saldo);
}
}