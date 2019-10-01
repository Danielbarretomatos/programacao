package com.company;

import java.util.Scanner;

public class prova_questao1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double bonus,salario;
        int anoT,anoA,ano;
        anoA = 2019;


        System.out.print("Informe o valor do salário: ");
        salario = sc.nextDouble();

        System.out.print("Informe o ano de entrada na empresa: ");
        ano = sc.nextInt();

        anoT = anoA - ano;

        if(anoT >= 5){
            bonus = 0.2;
            double hue = salario*bonus;
            salario = salario + (salario*bonus);
            System.out.println("Você recebeu um bonus de 20% no valor de: "+hue);

        }else{
            bonus = 0.1;
            double hue = salario*bonus;
            salario = salario + (salario*bonus);
            System.out.println("Você recebeu um bonus de 10% no valor de: "+hue);
        }

        System.out.println("Seu salario agora é de "+ salario);

    }
}

// Feito por Lucas Alves e Daniel Barreto
//04046843  --------- 04045177//////