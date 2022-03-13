
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random r = new Random();

        boolean acertou = false;
        int escolha1, escolha2, escolha3;
        int numero1, numero2, numero3;
        int tentativa = 10;
        numero1 = r.nextInt(9)+1; numero2 = r.nextInt(9)+1; numero3 = r.nextInt(9)+1;


        System.out.println("Bem vindo ao Labririnto: Você deve acertar a sequencia de numeros para sair!!");
        System.out.println("Você deve escolher entre os numeros de 1 a 9: ");
        System.out.println("Em cada painel a numeração varia de 1 a 9!!");
        while(tentativa > 0 && !acertou){
            System.out.println("Escolha o primeiro numero: \n");
            escolha1 = scan.nextInt();
            System.out.println("Escolha o segundo numero: \n");
            escolha2 = scan.nextInt();
            System.out.println("Essa é sua ultima escolha: \n");
            escolha3 = scan.nextInt();

            if (escolha1 == numero1 && escolha2 == numero2 && escolha3 == numero3){
                System.out.println("Parabens voce concluiu o labirinto!!");
                acertou = true;
            }else {
                --tentativa;
                System.out.println("Você não acertou todos os numeros tente novamente " + tentativa + " Tentativas restante.");
            }
        }





    }
}


