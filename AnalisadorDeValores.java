import java.util.Scanner;

public class AnalisadorDeValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Analisador de Valores");
        System.out.println("Digite o valor 1: ");
        int valor1 = scanner.nextInt();
        System.out.println("Digite o valor 2: ");
        int valor2 = scanner.nextInt();
        System.out.println("Digite o valor 3: ");
        int valor3 = scanner.nextInt();
        System.out.println("Digite o valor 4: ");
        int valor4 = scanner.nextInt();
        System.out.println("Digite o valor 5: ");
        int valor5 = scanner.nextInt();
        int MaiorValor = valor1;
        if (valor2 > MaiorValor) {
            MaiorValor = valor2;
        }
        if (valor3 > MaiorValor) {
            MaiorValor = valor3;
        }
        if (valor4 > MaiorValor) {
            MaiorValor = valor4;
        }
        if (valor5 > MaiorValor) {
            MaiorValor = valor5;
        }
        System.out.println("O maior valor é: " + MaiorValor);
        int MenorValor = valor1;
        if (valor2 < MenorValor) {
            MenorValor = valor2;
        }
        if (valor3 < MenorValor) {
            MenorValor = valor3;
        }
        if (valor4 < MenorValor) {
            MenorValor = valor4;
        }
        if (valor5 < MenorValor) {
            MenorValor = valor5;
        }
        System.out.println("O menor valor é: " + MenorValor);
        int Soma = valor1 + valor2 + valor3 + valor4 + valor5;
        System.out.println("A soma dos valores é: " + Soma);
        double Media = Soma / 5.0;
        System.out.println("A média dos valores é: " + Media);
        int Nulo = 0;
        if (valor1 == 0) {
            Nulo++;
        }   
        if (valor2 == 0) {
            Nulo++;
        }
        if (valor3 == 0) {
            Nulo++;
        }
        if (valor4 == 0) {
            Nulo++;
        }
        if (valor5 == 0) {
            Nulo++;
        }
        System.out.println("A quantidade de valores nulos é: " + Nulo);

        scanner.close();
    }
}