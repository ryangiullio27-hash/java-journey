import java.util.Scanner;


public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta = "S";

        while (resposta.equalsIgnoreCase("S")) {
        System.out.println("Bem-vindo ao Programa de Fatorial!");
        System.out.println("Por favor, insira um número para calcular o fatorial:");
        
            int fatorial = 1;

        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
                fatorial *= i;
            }
            System.out.println("O fatorial de " + number + " é: " + fatorial);

        
        System.out.println("Você deseja continuar (S/N)?");
        resposta = scanner.next();
    
    
        if (resposta.equalsIgnoreCase("S")) {
        } else {
            System.out.println("Obrigado por usar o Programa de Fatorial! Até a próxima!");
            }
        }
        scanner.close();
    }
}
