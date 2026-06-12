import java.util.Scanner;

public class oop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        soma1 soma = new soma1();
        System.out.println("Digite o primeiro número:");
        soma.num1 = scanner.nextFloat();
        System.out.println("Digite o segundo número:");
        soma.num2 = scanner.nextFloat();
        soma.somar();
        scanner.close();
    }
    
}
