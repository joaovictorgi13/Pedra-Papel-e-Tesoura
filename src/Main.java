import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] escolhas = {"pedra", "papel", "tesoura"};
        String escolhaUsuario;
        String escolhaPC;
        String jogarNovamente = "sim";

        do {
            System.out.print("Faça sua escolha (pedra, papel ou tesoura): ");
            escolhaUsuario = scanner.nextLine().toLowerCase();

            if(!escolhaUsuario.equals("pedra") && !escolhaUsuario.equals("papel") && !escolhaUsuario.equals("tesoura")){
                System.out.println("Escolha invalida!!");
                continue;
            }

            escolhaPC = escolhas[random.nextInt(3)];
            System.out.println("Computador: " + escolhaPC);

            if(escolhaUsuario.equals(escolhaPC)){
                System.out.println("Empate!!");
            } else if(escolhaUsuario.equals("pedra") && escolhaPC.equals("tesoura") ||
                    escolhaUsuario.equals("papel") && escolhaPC.equals("pedra") ||
                    escolhaUsuario.equals("tesoura") && escolhaPC.equals("papel")){
                System.out.println("Você Ganhou!!");
            }else {
                System.out.println("Você Perdeu!!");
            }

            System.out.println("Jogar novamente? (sim/nao)");
            jogarNovamente = scanner.nextLine().toLowerCase();

        } while(jogarNovamente.equals("sim"));

        System.out.println("Programa Encerrado!!");

        scanner.close();
    }
}