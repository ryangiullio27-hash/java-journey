import java.util.Scanner;

public class SomadorNumerioc {

    public static void main(String[] args) {
        System.out.println("Programa de soma 10 vezes");

        Scanner scanner = new Scanner(System.in);
        
        int soma = 0;
        int i = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        
        while (i < 10) {
            System.out.println("Digite o  número: ");
            int numero = scanner.nextInt();
            
            soma += numero;

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }

            i++;
        }
        System.out.println("A soma dos números é: " + soma);
        System.out.println("O maior número digitado é: " + maior);
        System.out.println("O menor número digitado é: " + menor);

    }
}
