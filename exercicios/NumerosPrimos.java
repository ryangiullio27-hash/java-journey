import java.util.Arrays;
import java.util.Scanner;

public class NumerosPrimos {
    public static boolean isPrimo(int n) {
    //Verificar os numeros primos de 1 ate n
        if (n <= 1) {
            return false; // Números menores ou iguais a 1 não são primos
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Se n for divisível por algum número entre 2 e a raiz quadrada de n, não é primo
            }
        }
        return true; // Se passar por todas as verificações, é primo
       
    }
    public static void main(String[] args) {
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        System.out.println("Números primos de 1 a " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (isPrimo(i)) {
                System.out.print(i + " ");
                contador++;
            }
        }
        System.out.println(); // Imprimir uma quebra de linha no final
        System.out.println("Quantidade de números primos: " + contador);
        
        }
        
    }

