package com.company;

import java.util.Scanner;

public class prova_questao2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int codigo;
        double hue,salario,salarioR;
        salarioR=0;

        System.out.println("------------------------------------");
        System.out.println("CODIGO | CARGO        | PERCENTUAL ");
        System.out.println("   1   | Escriturário |     50%    ");
        System.out.println("   2   | Secretário   |     35%    ");
        System.out.println("   3   | Caixa        |     20%    ");
        System.out.println("-------------------------------------");

        System.out.print("Informe o codigo do seu cargo: ");
        codigo = sc.nextInt();

        System.out.print("Informe o seu salário: ");
        salario = sc.nextDouble();

        if(codigo == 1){
            System.out.println("O seu cargo é de Escriturário");
            hue = (salario*0.5);
            System.out.println("O reajuste do seu salario foi de: R$"+hue);
            salarioR = salario + (salario*0.5);
        }
        if(codigo == 2){
            System.out.println("O seu cargo é de Secretário");
            hue = (salario*0.35);
            System.out.println("O reajuste do seu salario foi de: R$"+hue);
            salarioR = salario + (salario*0.35);
        }
        if(codigo == 3){
            System.out.println("O seu cargo é de Caixa");
            hue = (salario*0.20);
            System.out.println("O reajuste do seu salario foi de: R$"+hue);
            salarioR = salario + (salario*0.20);

        }

        System.out.println("O seu salário agora é de: "+salarioR);

    }
}
