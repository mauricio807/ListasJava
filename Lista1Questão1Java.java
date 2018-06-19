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
public class Lista1Questão1Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner n = new Scanner(System.in);
        float quantia = 550;
        float tot =0;
        float desconto;
        float naodesconto = 0;
        float reajuste;
        int contador;
        float valorF = 0; 
        for (contador= 1; contador <= 4; contador++) {
            if (contador == 1) {
                quantia = 550;
                tot = quantia * 12;
                naodesconto = tot + naodesconto;
            
            }
            
            else if (contador == 2) {
                reajuste = (float) (quantia* 0.1);
                quantia = reajuste + quantia;
                tot = quantia * 12;
                naodesconto = tot + naodesconto;
            }
            
            else if (contador == 3) {
                reajuste = (float) (quantia * 0.1);
                quantia = reajuste + quantia;
                tot = quantia* 12;
                naodesconto = tot + naodesconto;
            }
            
            else if (contador == 4) {
                reajuste = (float) (quantia* 0.1);
                quantia= reajuste + quantia;
                tot = quantia * 12;
                naodesconto = tot + naodesconto;
            }
        }
                    System.out.println("Esse é o valor sem desconto:"+naodesconto);
                System.out.println("Digite o valor do desconto: ");
        desconto = n.nextFloat();
        desconto= (naodesconto  * desconto/ 100);
        valorF=naodesconto-desconto;
            System.out.printf("O preço sem  o desconto é : %.2f e o valor de %.2f é o valor com desconto!\n",naodesconto,valorF);
    }    
    }
    

