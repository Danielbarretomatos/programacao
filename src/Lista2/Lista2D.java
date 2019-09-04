package Lista2;

import java.util.Scanner;

public class Lista2D {
    import java.util.Scanner;

    public class Lista2d {

        public static double lado1, lado2, lado3;
        public static boolean isosceles = false, equilatero = false, escaleno = false, notri = false;
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Insira o primeiro lado");
            lado1 = sc.nextDouble();
            System.out.println("Insira o segundo lado");
            lado2 = sc.nextDouble();
            System.out.println("Insira o terceiro lado");
            lado3 = sc.nextDouble();



            if(lado1 == lado2 && lado2 == lado3){
                equilatero = true;
            }else if(lado1 != lado2 && lado2 != lado3 && lado1 !=lado3){
                escaleno = true;
            }else if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3 && lado1 != lado2 || lado2 != lado3 || lado1 != lado3){
                isosceles = true;
            }

            if(lado1+lado2 <lado3 || lado1+lado3 < lado2 || lado2+lado3 < lado1) {
                notri = true;
                isosceles = false;
                escaleno = false;
                equilatero = false;
            }

            if(equilatero == true){
                System.out.println("Este é um triangulo EQUILATERO");
            }else if(isosceles == true){
                System.out.println("Este é um triangulo ISOSCELES");
            }else if(escaleno){
                System.out.println("Este é um triangulo ESCALENO");
            }else if(notri == true){
                System.out.println("Não se pode formar um triangulo!");
            }

        }
    }
}
