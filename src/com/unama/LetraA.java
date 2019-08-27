package com.unama;
import java.util.Scanner;
public class LetraA {

    public static void main(String[] args) {
        double numero;
        double dobro;
        Scanner scanner = new Scanner(System.in);


        System.out.println("informe o numero: ");
        numero = scanner.nextDouble();

        dobro = numero * 2;
        System.out.println("o dobro do seu numero é:" + dobro );

   }
}
