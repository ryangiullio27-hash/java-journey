import java.util.Scanner;

public class SuperContador {
    public static void main(String[] args) {
        System.out.println("Welcome to the Super Contador!");
        String resposta = "S";
        Scanner scanner = new Scanner(System.in);

        while (resposta.equalsIgnoreCase("S")) {
            System.out.println("Enter 1, para ver de 1 a 100");
            System.out.println("Enter 2, para ver de 100 a 1");
            System.out.println("Enter 3, para sair");
            int choice = scanner.nextInt();
            if (choice == 1) {
                for (int i = 1; i <= 100; i++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            } else if (choice == 2) {
                for (int i = 100; i >= 1; i--) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
             else if (choice == 3) {
                System.out.println("Thank you for using Super Contador! Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please enter 1, 2 or 3.");
            }
            System.out.println("Do you want to continue (S/N)?");
            resposta = scanner.next();
        } 
        scanner.close();
        }
}
