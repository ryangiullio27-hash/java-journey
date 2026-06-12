import java.util.Scanner;

public class TrainingSwitchString {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Programa de sorte!");
        System.out.println("Por favor, selecione um dia da semana (Segunda, Terça, Quarta, Quinta, Sexta, Sábado, Domingo) para ver seu treinamento para esse dia.");
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        String sorte = "Verde";

        switch (day) {
            case "Segunda":
                sorte = "Verde";
                break;
            case "Terça":
                sorte = "Amarelo";
                break;
            case "Quarta":
                sorte = "Vermelho";
                break;
            case "Quinta":
                sorte = "Roxo";
                break;
            case "Sexta":
                sorte = "Laranja";
                break;
            case "Sábado":
                sorte = "Preto";
                break;
            case "Domingo":
                sorte = "Branco";
                break;
            default:
                sorte = "Dia inválido";
        }

        System.out.println("Seu sorte para hoje é: " + sorte);

    }

}