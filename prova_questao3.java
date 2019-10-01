package com.company;

import java.util.Scanner;

public class prova_questao3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double altura, peso;

        System.out.println("------------------------------------------------------------------");
        System.out.println("                                    Peso");
        System.out.println("  Altura           | até 60   | entre 60 e 90 | acima de 90");
        System.out.println("  menores que 1.2m |    A     |        D      |    G       ");
        System.out.println("  entre 1.2 a 1.7  |    B     |        E      |    H       ");
        System.out.println("  maiores que 1.7  |    C     |        F      |    I       ");
        System.out.println("------------------------------------------------------------------");

        System.out.print("Informe a sua altura: ");
        altura = sc.nextDouble();

        System.out.print("Informe o seu peso: ");
        peso = sc.nextDouble();

        if(altura < 1.2){
            if (peso <=60){
                System.out.println("Você está na classificação: A");
            }
            if (peso > 60 && peso <=90){
                System.out.println("Você está na classificação: D");
            }
            if (peso > 90){
                System.out.println("Você está na classificação: G");
            }
        }
        if(altura >= 1.2 && altura <= 1.7){
            if (peso <=60){
                System.out.println("Você está na classificação: B");
            }
            if (peso > 60 && peso <=90){
                System.out.println("Você está na classificação: E");
            }
            if (peso > 90){
                System.out.println("Você está na classificação: H");
            }
        }
        if(altura > 1.7){
            if (peso <=60){
                System.out.println("Você está na classificação: C");
            }
            if (peso > 60 && peso <=90){
                System.out.println("Você está na classificação: F");
            }
            if (peso > 90){
                System.out.println("Você está na classificação: I");
            }
        }

    }
}
