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
public class Lista1Questao6java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Informe um Número");
        int n1 =teclado.nextInt();
        System.out.println("Informe o segundo número");
        int n2 = teclado.nextInt();
        int soma = (n1 + n2);
        int produto =(n1*n2);
        int dif = (n1-n2);
        float q = (n1/n2);
         System.out.printf("Os números digitados foram: %d e %d, a soma dos dois dá %d, o produto dos dois dá: %d, A difença dá:%d ",n1,n2,soma,produto,dif);
        System.out.printf("e a divisão é:%.2f",q);
    }
    
}
