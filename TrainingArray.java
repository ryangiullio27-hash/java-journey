import java.util.Scanner;

public class TrainingArray {
    public static void main(String[] args) {
        System.out.println("Welcome to the Program of name!");
        
        String[] names = new String[5];
        
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 5; i++) {
            System.out.println("Please, enter the name of person " + (i + 1) + ":");
            names[i] = scanner.nextLine();
        }
        System.out.println("The names you entered are:");
        for(int i = 0; i < 5; i++) {
            System.out.println(names[i]);
        }
        System.out.println("The quantity of names was: " + names.length);

        }        
    }
