/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1java;

import java.util.Scanner;

/**
 *
 * @author mauri
 */
public class Lista1Questao9Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
            Scanner teclado = new Scanner(System.in);
            System.out.println("Digite os números:");
            int num1= teclado.nextInt();
            int num2= teclado.nextInt();
                if(num1%num2==0){
                   System.out.println("Os números são mútiplos");
               }else if(num1%num2!=0){
                    System.out.println("Os números não são mútiplos");}    
    }
    }
    

