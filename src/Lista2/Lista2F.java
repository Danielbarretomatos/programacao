package Lista2;

import java.util.Scanner;

public class Lista2F {
    import java.util.Scanner;

    public class Lista2f {
        public static boolean aprovado = false, reprovado = false, recuperacao = false;
        public static int faltas;
        public static double nota1,nota2,notamedia;
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Insira a nota da primeira avaliação:");
            nota1 = sc.nextDouble();
            System.out.println("Insira a nota da segunda avaliação:");
            nota2 = sc.nextDouble();
            notamedia = (nota1+nota2)/2;
            System.out.println("Insira o seu número de faltas:");
            faltas = sc.nextInt();

            if(notamedia >= 7 && faltas <= 15){
                aprovado = true;
                recuperacao = false;
                reprovado = false;
            }else if(notamedia < 7 && faltas <=15){
                aprovado = false;
                recuperacao = true;
                reprovado = false;
            }else if(notamedia < 7 && faltas > 15){
                aprovado = false;
                recuperacao = false;
                reprovado = true;
            }else if(notamedia >= 7 && faltas >15){
                aprovado = false;
                recuperacao = false;
                reprovado = true;
            }

            if(aprovado == true){
                System.out.println("Sua média é: "+notamedia);
                System.out.println("Sua quantidade de faltas é: "+faltas);
                System.out.println("Você foi APROVADO");
            }else if(reprovado == true){
                System.out.println("Sua média é: "+notamedia);
                System.out.println("Sua quantidade de faltas é: "+faltas);
                System.out.println("Você foi REPROVADO");
            }else if(recuperacao == true){
                System.out.println("Sua média é: "+notamedia);
                System.out.println("Sua quantidade de faltas é: "+faltas);
                System.out.println("Você foi pra RECUPERAÇÃO");
            }
        }
    }

}
