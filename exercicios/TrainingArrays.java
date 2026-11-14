import java.util.Scanner;

public class TrainingArrays {
    public static void main(String[] args) {
        System.out.println("Welcome to the Program of name!");
        System.out.println("Please, enter the quantity of names you want to enter:");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.println("Please, enter the names:");
        

        String[] names = new String[quantity];
        for(int i = 0; i < quantity; i++) {
            System.out.println("Please, enter the name of person " + (i + 1) + ":");
            names[i] = scanner.nextLine();
        }
        System.out.println("The names you entered are:");
        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("The quantity of names was: " + names.length);
    }
}
  