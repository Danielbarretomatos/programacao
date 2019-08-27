package com.unama;


import java.util.Scanner;

public class LetraD {
    public static void main(String[] args){
        double raio;
        double perímetro;
        double area;

        Scanner sc = new Scanner(System.in);
        System.out.println("informe o raio: ");
        raio = sc.nextDouble();
        double quadrado = Math.pow(raio,2);
        area = 3.14*raio;
        perímetro = 2*3.14*raio;
        System.out.println("o perimetro do circulo é: "+perímetro);
        System.out.println("A area do circulo é: "+area);







    }
}
