import java.util.Scanner;
import java.time.LocalDate;

public class carteira {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();
        int anoAtual = LocalDate.now().getYear();
        int idade = anoAtual - anoNascimento;
        if (idade >= 18) {
            System.out.println("Você tem " + idade + " anos. Você é maior de idade.");
        } else {
            System.out.println("Você tem " + idade + " anos. Você é menor de idade.");
            
        }
        scanner.close();
    }
    
}
