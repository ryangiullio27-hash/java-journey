import java.util.Scanner;

public class conversorfareiwn {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao programa de conversão de graus Fahrenheit para Celsius!");
        System.out.println("Digite o valor em Fahrenheit para conversão em Celsius: ");
        Scanner scanner = new Scanner(System.in);
        Float valorFahrenheit = scanner.nextFloat();
        Float valorCelsius = (valorFahrenheit - 32) * 5.0f / 9.0f;
        System.out.println("O valor em Celsius é : " + valorCelsius + " graus Celsius.");
        scanner.close();
    }
}
