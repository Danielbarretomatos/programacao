package Lista2;

import java.util.Scanner;

public class Lista2G {
    import java.util.Scanner;

    public class Lista2g {
        public static double n1,n2;
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("INSIRA O PRIMEIRO NUMERO");
            n1 = sc.nextDouble();
            System.out.println("INSIRA O SEGUNDO NUMERO");
            n2 = sc.nextDouble();

            if(n2>n1){
                System.out.println("O MAIOR É: "+n2);
            }else if(n1>n2){
                System.out.println("O MAIOR É: "+n1);
            }
        }
    }

}
