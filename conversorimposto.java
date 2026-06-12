import java.util.Scanner;

public class conversorimposto {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao programa de convrsão de imposto!");
        System.out.println("Digite o valor do produto para conversão do imposto: ");
        Scanner scanner = new Scanner(System.in);
        Float valorProduto = scanner.nextFloat();
        Float valorImposto = valorProduto * 0.60f;
        System.out.println("O valor do imposto é : " + valorImposto + " reais.");
        scanner.close();

        }
}
