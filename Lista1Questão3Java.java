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
public class Lista1Questão3Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Informe um número inteiro, contendo 3 dígitos ou mais");
        Integer Inteiro;
        Inteiro = num.nextInt();
        String caracter = Inteiro.toString();
        String invertido = "";
        if (caracter.length()>=3){
        for (int i = caracter.length(); i > 0; i--) {
            invertido = invertido + caracter.substring(i - 1, i);
        }
        
        System.out.println("O numero invertido é :" + invertido);
        }
        else{
        
            System.out.println("O número não possui 3 dígitos");
        }
    }
    }
    

