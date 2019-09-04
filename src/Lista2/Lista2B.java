package Lista2;

import java.util.Scanner;

public class Lista2B {
    import java.util.Scanner;

    public class Lista2b {
        public static int pecaDefeito,producao;
        public static double pcem;
        public static boolean manutencao;
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Insira o total de peças produzidas:");
            producao = sc.nextInt();
            System.out.println("Insira o total de peças com defeito:");
            pecaDefeito = sc.nextInt();
            pcem = producao*0.1;
            if(pecaDefeito <= pcem) {
                manutencao = false;
            }
            if(pecaDefeito > pcem){
                manutencao = true;

            }

            if(manutencao == true) {
                System.out.println("A máquina precisa de manutenção!");
            }
            if(manutencao == false){
                System.out.println("A máquina nao precisa de manutenção!");
            }


        }
    }
}
