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
public class Lista1Questao7Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner (System.in);
        System.out.println("Informe o primeiro número");
        int n1=teclado.nextInt();
        System.out.println("Informe o segundo número");
        int n2=teclado.nextInt();
        if (n1>n2){
            System.out.println("is a larger "+n1);
        }
            else if(n1<n2){
            System.out.println("is a larger "+n2);
        }
            else if(n1==n2){
            System.out.println("These numbers are equal ");    
         
        }
    }
    
}
