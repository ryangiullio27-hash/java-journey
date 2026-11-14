import java.util.Scanner;
import java.time.Year;

public class idade {

    public static void main(String[] args) {
        System.out.println("Bem-Vindo ao programa de cálculo de idade!");
        System.out.println("Digite o ano de nascimento: ");
        Scanner scanner = new Scanner(System.in);
        int anoNascimento = scanner.nextInt();
        int anoAtual = Year.now().getValue();
        int idade = anoAtual - anoNascimento;
        System.out.println("Sua idade é : " + idade + " anos.");
    }
}