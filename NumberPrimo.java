import java.util.Scanner;
import java.lang.Math;

public class NumberPrimo {
    public static void main(String[] args) {
        String resposta = "S";
        Scanner scanner = new Scanner(System.in);


        while (resposta.equalsIgnoreCase("S")) {
        resposta = "S";
            
        
        System.out.println("Welcome, the Prime Number Checker!");
        System.out.println("Please, enter the number to check if it's prime:");
        int number = scanner.nextInt();
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }   
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        for (int i = 0; i < 1; i++) {
            System.out.println("Do you want to check another number (S/N)?");
            resposta = scanner.next();
        
            } 
        }
        scanner.close();
    }
}
