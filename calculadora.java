
import java.util.Scanner;

public class calculadora {

    public calculadora() {
        System.out.println("Bem-Vindo à calculadora!");
        System.out.println("Escolha uma operação para realizar:");
        System.out.println("1 - Soma"); 
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        Scanner scanner = new Scanner(System.in);
        int escolha = scanner.nextInt();
        System.out.println("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int numero2 = scanner.nextInt();
        switch (escolha) {
            case 1:
                int resultadoSoma = somar(numero1, numero2);
                System.out.println("O resultado da soma é : " + resultadoSoma);
                break;
            case 2:
                int resultadoSubtração = subtrair(numero1, numero2);
                System.out.println("O resultado da subtração é : " + resultadoSubtração);
                break;
            case 3:
                int resultadoMultiplicação = multiplicar(numero1, numero2);
                System.out.println("O resultado da multiplicação é : " + resultadoMultiplicação);
                break;
            case 4: 
                int resultadoDivisão = dividir(numero1, numero2);
                System.out.println("O resultado da divisão é : " + resultadoDivisão);
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha uma operação válida.");

        }
    }
    


    static int subtrair(int a, int b) {
        // Método para subtrair dois números
        return a - b;   
    }

    static int multiplicar(int a, int b) {
        // Método para multiplicar dois números
        return a * b;   
    }

    static int dividir(int a, int b) {
        // Método para dividir dois números
        if (b != 0) {
            return a / b;   
        } else {
            System.out.println("Erro: Divisão por zero não é permitida.");
            return 0; // Retorna 0 ou pode lançar uma exceção dependendo do caso
        }
    }

    static int somar(int a, int b) {
        // Método para somar dois números
        return a + b;   
    }

    public static void main(String[] args) {
        new calculadora();
    }
    
}