import java.util.Scanner;

public class TrainingForTabuada {
    public static void main(String[] args) {
        System.out.println("Digite o numero que deseja ver a tabuada:");
        int numero = new java.util.Scanner(System.in).nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            
        }
    }
}