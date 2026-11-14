import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        System.out.println("Digite um número para a contagem regressiva: ");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }
    }
}