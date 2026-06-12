import java.util.Scanner;

public class emprestimoKreusa {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao programa de calculo de empréstimo!");
        System.out.println("Digite o valor do empréstimo: ");
        Scanner scanner = new Scanner(System.in);
        Float valorEmprestimo = scanner.nextFloat();
        Float valorJuros = valorEmprestimo * 0.20f;
        Float valorTotal = valorEmprestimo + valorJuros;    
        System.out.println("O valor total do empréstimo com os juros são: " + valorTotal + " reais.");
        System.out.println("O emprestimo com o valor total pode ser dividido em até 12 vezes.");
        System.out.println("Você deseja dividir em quantas vezes?");
        Scanner scanner2 = new Scanner(System.in);
        int numeroParcelas = scanner2.nextInt();
        Float valorParcela = valorTotal / numeroParcelas;
        System.out.println("O valor de cada parcela é : " + valorParcela + " reais.");
        System.out.println("Obrigado pela preferencia em nosso banco agradecemos!");
        scanner.close();
        scanner2.close();
    }
}
