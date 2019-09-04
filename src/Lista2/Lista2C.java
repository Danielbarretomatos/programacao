package Lista2;

import java.util.Scanner;

public class Lista2C
import java.util.Scanner;

public class Lista2c {

    public static int idade;
    public static boolean infantil = false, juvenil = false, senior = false;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira sua idade:");
        idade = sc.nextInt();
        if(idade <= 10){
            infantil = true;
        }else if(idade > 10 && idade <= 17){
            juvenil = true;
        }else if(idade > 17){
            senior = true;
        }

        if(infantil == true){
            System.out.println("Sua categoria é: INFANTIL!");
        }else if(juvenil == true){
            System.out.println("Sua categoria é: JUVENIL!");

        }else if(senior == true){
            System.out.println("Sua categoria é: SENIOR!");
        }


    }
}
{
}
