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
public class Lista1Questão2Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner num= new Scanner(System.in);
        float temp, perimetro, veloM = 20;
        System.out.println("Digite qual a distancia, (KM) percorrida pelo Tsunami");
        perimetro = num.nextFloat();
        if(perimetro<=12){
        temp = perimetro/veloM;
        temp= temp*60;
        
        System.out.printf("O Tsunami demorou para chegar %.1fkm percorrido é de: %.2fmin\n",perimetro,temp);
    }
        else if(perimetro>12){
            System.out.println("distancia maior q 12km");}
    }
}
