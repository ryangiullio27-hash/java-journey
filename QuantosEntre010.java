import java.util.Scanner;

public class QuantosEntre010 {
    public static void main(String[] args) {
        System.out.println("Digite quantos números deseja verificar: ");
        Scanner scanner = new Scanner(System.in);
        

        while (true) {
            int quantidade = scanner.nextInt();

            int contador = 0;
            int soma = 0;
            String impares = "";
                
            for (int i = 0; i < quantidade; i++) {
                    System.out.println("Digite um número: ");
                    int numero = scanner.nextInt();
                    if (numero > 0 && numero < 10) {
                        contador++;
                    }
                    if (numero % 2 == 1) {
                        impares += numero + " ";
                    }

                    if (numero % 2 == 1) {
                        soma += numero;
                    }
                }
                System.out.println("Quantidade de números entre 0 e 10: " + contador);
                System.out.println("Ímpares: " + impares);
                System.out.println("Soma dos ímpares: " + soma);
                   break;
            }
        scanner.close();
    }
}
                   
                
            
        
        
