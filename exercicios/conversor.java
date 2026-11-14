import java.util.Scanner;

public class conversor {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao programa de conversão de real para dolar!");
        System.out.println("Digite o valor em real para conversão em dolar: ");
        Scanner scanner = new Scanner(System.in);
        Float valorReal = scanner.nextFloat();
        Float valorDolar = valorReal / 5.0f;
        System.out.println("O valor em dolar é : " + valorDolar + " dolares.");
        scanner.close();
    } 
}