import java.util.Scanner;

public class aproveitamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        float nota1 = scanner.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float nota2 = scanner.nextFloat();
        float media = (nota1 + nota2) / 2;
        if (media >= 9) {
            System.out.println("Aproveitamento: A");
        } else if (media >= 7.5) {
            System.out.println("Aproveitamento: B");
        } else if (media >= 6) {
            System.out.println("Aproveitamento: C");
        } else if (media >= 4) {
            System.out.println("Aproveitamento: D");
        } else {
            System.out.println("Aproveitamento: E");
        }
        scanner.close();

    }
    
}
