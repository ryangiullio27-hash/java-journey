import java.util.Scanner;

public class JogosVersoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   


        System.out.println("Bem-vindo ao programa de combinação de jogos!");

        String[] jogos = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome do jogo " + (i + 1) + ": ");
            jogos[i] = scanner.nextLine();
        }

        System.out.println("As combinações possíveis de jogos são:");
        for (int i = 0; i < jogos.length; i++) {
            for (int j = i + 1; j < jogos.length; j++) {
                System.out.println(jogos[i] + " + " + jogos[j]);
            }

        }
    }
}
