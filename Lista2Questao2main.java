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
public class Lista2Questao2main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
         Lista2Questao2 av = new Lista2Questao2();
         Scanner teclado= new Scanner(System.in);
         System.out.println("Informe a cidade o país de origem  e o  destino");
            String locatep = teclado.nextLine();
            String locatec = teclado.nextLine();
         System.out.println("Informe a data de partida e a data prevista para a  chegada:");
           String  datep= teclado.nextLine();
           String datec= teclado.nextLine();
         System.out.println("Informe seu nome e o CPF");
            String nome= teclado.nextLine();
            String cpf= teclado.nextLine();
         System.out.println("Informe a forma de pagamento que Deseja");
            String fpg= teclado.nextLine();
            av.setLocalDePartida(locatep);
            av.setLocalDeChegada(locatec);
            av.setDataDePartida(datep);
            av.setDataDeChegada(datec);
            av.setNome(nome);
            av.setCpf(cpf);
            av.setFormaDePagamento(fpg);
         
         System.out.println("Obrigado por escolher a nossa agência aéria");
         System.out.printf("Origem: %s\t Destino:%s\n",av.getLocalDePartida(),av.getLocalDeChegada());
         System.out.printf("Valor:R$500,00\n");
         System.out.println("Nome do passageiro:"+av.getNome());
         System.out.println("CPF:"+av.getCpf());
         System.out.println("Data de ida:"+av.getDataDePartida());
         System.out.println("Data de volta:"+av.getDataDeChegada());
         System.out.println("Desejamos que tenha um excelete vôo!!!");
        }
    
    }
