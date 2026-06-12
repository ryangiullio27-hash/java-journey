import java.util.Scanner;

public class EscolhendoPeoples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta = "S";
        int quantity = 0;
        String Color = "";
         System.out.println("Welcome to the People Selector!");

        while (resposta.equalsIgnoreCase("S")) {

            System.out.println("Enter the quantity of people to add:");
            quantity = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character


            String[] people = new String[quantity];
            String[] haircolor = new String[Color.length()];
            int[] ages = new int[quantity];
            
            
            System.out.println("Enter the hair color of person " + (i + 1) + ":");
            Color = scanner.nextLine();
            scanner.nextLine(); // Consume the newline character
    
            

            for (int i = 0; i < quantity; i++) {
                System.out.println("Enter the name of person " + (i + 1) + ":");
                people[i] = scanner.nextLine();
            }

            int soma = 0;

            for (int i = 0; i < quantity; i++) {
                System.out.println("Enter the age of " + people[i] + ":");
                ages[i] = scanner.nextInt();
                soma += ages[i];
                scanner.nextLine(); // Consume the newline character
            }
            double media = (double) soma / quantity;
                String yellowHairColors = "";
            System.out.println("The average age of the people is: " + media);
            System.out.println("The people with hair color yellow are:" + yellowHairColors);

            if (media >= 18) {
                System.out.println("The people are adults.");
            } else {
                System.out.println("The people are minors.");
            }       
            System.out.println("Do you want to add more people? (S/N)");
            resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("N")) {
                System.out.println("Exiting the program...");
            }
            else if (!resposta.equalsIgnoreCase("S")) {
                System.out.println("Invalid response. Please enter 'S' to continue or 'N' to exit.");
                resposta = scanner.nextLine();  
            }
        }
    System.out.println("Programa encerrado.");
        scanner.close();}
    
}
