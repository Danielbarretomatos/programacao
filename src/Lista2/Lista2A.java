package Lista2;

import java.util.Scanner;

public class Lista2A {
    import java.util.Scanner;

    public class Lista2a {


        public static int copias;
        public static double total;
        public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Insira o numero de cópias:");
            copias = sc.nextInt();
            if (copias <= 100) {
                total = copias*0.25;

            }else{
                total = copias*0.2;
            }

            System.out.println("O Valor total a ser pago é de: "+ total + " REAIS!");

        }
    }

}
