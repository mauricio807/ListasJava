/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2java;

import java.util.Scanner;

/**
 *
 * @author mauri
 */
public class Lista2Questao1main {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        
            Scanner teclado = new Scanner(System.in);
        
       int opc; 
        Lista2Questao1 tr = new Lista2Questao1();
        do{
            System.out.println("Menu\n\n"
 +"1. Sacar\n"
 +"2. Depositar\n"
 +"3. Imprimir saldo\n"
 +"4. sair \n"                   
 +"Informe o numero que corresponde as operações a cima");                   
            opc = teclado.nextInt();
            switch(opc){ 
            case 1:
                System.out.println("Informe a quantia que deseja  sacar: ");
             float  saque = teclado.nextFloat();
                tr.setSaque(saque);
            case 2:
                System.out.println("Informe a quantia que quer depositar: ");
             float deposito = teclado.nextFloat();
                
                tr.setDeposito(deposito);
                break;
                    
            case 3:
                tr.Impsaldo();
                break;
            }
        }while(opc != 4); 
    }
    
}
