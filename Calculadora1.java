import java.util.Scanner;
import java.util.InputMismatchException;

public class Calculadora1 {

    static float somar(float a, float b) {
        // Método para somar dois números
        return a + b;   
    }

    static float subtrair(float a, float b) {
        // Método para subtrair dois números
        return a - b;   
    }
    static float multiplicar(float a, float b) {
        // Método para multiplicar dois números
        return a * b;   
    }
    static float dividir(float a, float b) {
        // Método para dividir dois números
        if (b != 0) {
            return a / b;   
        } else {
            System.out.println("Erro: Divisão por zero não é permitida.");
            return 0; // Retorna 0 ou pode lançar uma exceção dependendo do caso
        }
    }
    public static void main(String[] args) {
        new Calculadora1();
    }

    public Calculadora1 () {
        int escolha = 0;
        Scanner scanner = new Scanner(System.in);

        while (escolha != 5) {
            System.out.println("Bem-Vindo à calculadora!");
            System.out.println("Escolha uma operação para realizar com a sua calculadora:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");
            try {
    escolha = scanner.nextInt();
} catch (InputMismatchException e) {
    System.out.println("Opção inválida! Digite apenas números.");
    scanner.nextLine();
    escolha = 0;
}

            switch (escolha) {
                case 1:
                    System.out.println("Digite o primeiro número: ");
                    float numero1 = scanner.nextFloat();
                    System.out.println("Digite o segundo número: ");
                    float numero2 = scanner.nextFloat();
                    float resultadoSoma = somar(numero1, numero2);
                    System.out.println("O resultado da soma é : " + resultadoSoma);
                    break;
                case 2:
                    System.out.println("Digite o primeiro número: ");
                    float numero3 = scanner.nextFloat();
                    System.out.println("Digite o segundo número: ");
                    float numero4 = scanner.nextFloat();
                    float resultadoSubtração = subtrair(numero3, numero4);
                    System.out.println("O resultado da subtração é : " + resultadoSubtração);
                    break;
                case 3:
                    System.out.println("Digite o primeiro número: ");
                    float numero5 = scanner.nextFloat();
                    System.out.println("Digite o segundo número: ");
                    float numero6 = scanner.nextFloat();
                    float resultadoMultiplicação = multiplicar(numero5, numero6);
                    System.out.println("O resultado da multiplicação é : " + resultadoMultiplicação); 
                    break;
                case 4:    
                    System.out.println("Digite o primeiro número: ");
                    float numero7 = scanner.nextFloat();
                    System.out.println("Digite o segundo número: ");
                    float numero8 = scanner.nextFloat();
                    float resultadoDivisão = dividir(numero7, numero8);
                    System.out.println("O resultado da divisão é : " + resultadoDivisão);
                    break;
                case 5:
                    System.out.println("Saindo da calculadora. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma operação válida.");

             }
        }
    }
}