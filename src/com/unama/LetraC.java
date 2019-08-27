package com.unama;

import java.util.Scanner;

public class LetraC {
    public static void main(String[] args){
        double base;
        double altura;
        double area;

        Scanner sc = new Scanner(System.in);
        System.out.println("informe a base: ");
        base = sc.nextDouble();
        System.out.println("informe a altura: ");
        altura = sc.nextDouble();
        area = (base*altura/2);
        System.out.println("a area do triangulo é: "+area+" MTS");

    }
}
