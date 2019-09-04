package Lista2;

import java.util.Scanner;

public class Lista2H {
    import java.util.Scanner;

    public class Lista2h {
        public static double numero;
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("INSIRA UM NUMERO:");
            numero = sc.nextDouble();

            if((int)numero % 2 == 0){
                System.out.println("O numero "+(int)numero+" é par");
            }else{
                System.out.println("O numero "+(int)numero+" é impar");
            }
        }
    }

}
