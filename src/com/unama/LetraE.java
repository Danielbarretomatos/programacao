package com.unama;

import java.util.Scanner;

public class LetraE {
    public static void main(String[] args){
double vendas,comissao;
        Scanner sc = new Scanner(System.in);
        System.out.println("informe o total de vendas: ");
        vendas = sc.nextDouble();
        comissao = (vendas*0.1);
       System.out.println("sua comissao deste mes é de: "+comissao+" R$");
    }
}
