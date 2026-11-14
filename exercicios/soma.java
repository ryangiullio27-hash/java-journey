import java.util.Scanner;
public class soma {
    public static void main(String[] args) {
    System.out.println("Digite um número para obter a soma: ");
    Scanner scanner = new Scanner(System.in);  
    int numero1 = scanner.nextInt();
    System.out.println("Digite um outro número para obter a soma: ");       
    int numero2 = scanner.nextInt();
    int soma = numero1 + numero2;
    System.out.println("A soma entre " + numero1 + " e " + numero2  + " é igual a " + soma);
    }
    
}
