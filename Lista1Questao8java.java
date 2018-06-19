
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
public class Lista1Questao8java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Informe o Primeiro número");
        int n1= teclado.nextInt();
        System.out.println("Informe o Segundo número");
        int n2= teclado.nextInt();
        System.out.println("Informe o Terceiro número");
        int n3= teclado.nextInt();
        int soma= (n1+n2+n3);
        int media= (n1+n2+n3)/3;
        int produt= (n1*n2*n3);
        int maior;
        int menor;
        
            if (n1 >= n3 && n1 >= n2) {
                System.out.println(n1 + " é maior ");
            }
            if (n1 <= n3 && n1 <= n2) {
                System.out.println(n1 + " é menor ");
            }
            if (n2 >= n3 && n2 >= n1) {
                System.out.println(n2 + " é maior ");
            }
            if (n2 <= n3 && n2 <= n1) {
                System.out.println(n2 + " é menor");
            }
            if (n3 >= n2 && n3 >= n1) {
                System.out.println(n3 + " é maior  ");
            }
            if (n3 <= n2 && n3 <= n1) {
                System.out.println(n3 + " é menor ");
            }
            
            System.out.println("a soma é "+soma+"a media é "+media+" o produto é "+produt);
}
}
