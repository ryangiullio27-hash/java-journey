import java.util.Scanner;

public class DetectorDePesado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Detector de Pesado");
        int Novopeso = 0;
        String NovoNome = "";
        String resposta = "S";
        while (resposta.equalsIgnoreCase("S")) {
    
        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o peso: ");
        int peso = scanner.nextInt();
            if (peso > Novopeso) {
                Novopeso = peso;
                NovoNome = nome;
                System.out.println("O nome do mais pesado é: " + nome);
                System.out.println("O peso do mais pesado é: " + Novopeso);

                System.out.println("Deseja continuar (S/N)?");
                resposta = scanner.next();
                if (resposta.equalsIgnoreCase("S")) {
                    System.out.println("Digite o nome: ");
                    String nome2 = scanner.next();
                    System.out.println("Digite o peso: ");
                    int peso2 = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer do scanner
                    if (peso2 > Novopeso) {
                        Novopeso = peso2;
                        System.out.println("O nome do mais pesado é: " + nome2);
                        System.out.println("O peso do mais pesado é: " + Novopeso);
                    } else {
                        System.out.println("O nome do mais pesado é: " + nome);
                        System.out.println("O peso do mais pesado é: " + Novopeso);
                    }
                } else {
                    System.out.println("Obrigado por usar o Detector de Pesado! Até a próxima!");
                    }
                }
            }
        }
        }
