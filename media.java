import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        System.out.println("Digite a primeira nota: ");
        Scanner scanner = new Scanner(System.in);
        float nota1 = scanner.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float nota2 = scanner.nextFloat();
        float media = (nota1 + nota2) / 2;
        System.out.println("A média é: " + media);
        scanner.close();
    }
    
}
