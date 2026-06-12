import java.util.InputMismatchException;
import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do cliente:");
        String name = scanner.nextLine();
    
        System.out.println("Digite o saldo inicial:");
        double saldoInicial = 0;
        ContaBanco banco = new ContaBanco();
    
        Conta contaMaria = new Conta("Maria", 0);
        Cliente maria = new Cliente("Maria", "12345678900", contaMaria);
        Conta contaJoao = new Conta("João", 0);
        Cliente joao = new Cliente("João", "98765432100", contaJoao);
        banco.adicionarCliente(joao);
        banco.adicionarCliente(maria);
        while (true) {
            try {
                saldoInicial = scanner.nextDouble();
                if (saldoInicial < 0) {
                    throw new IllegalArgumentException("Saldo inicial não pode ser negativo.");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Digite um número válido para o saldo inicial.");
                scanner.nextLine(); // Limpa o buffer do scanner
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    
        Conta conta1 = new Conta(name, saldoInicial);

        System.out.println("Digite o CPF do cliente:");
        String cpf = scanner.next();

        Cliente cliente1 = new Cliente(name, cpf, conta1);
        banco.adicionarCliente(cliente1);
        int opcaoPrincipal = 0;
       
        while (opcaoPrincipal != 6) {
            try {
                System.out.println("Para iniciar o aplicativo, escolha uma opção:");
                System.out.println("1 - Depositar");
                System.out.println("2 - Sacar");
                System.out.println("3 - Ver saldo");
                System.out.println("4 - Ver dados do cliente");
                System.out.println("5 - Transferir");
                System.out.println("6 - Sair");
                System.out.println("7 - Listar clientes");
                System.out.println("Digite a opção desejada:");
                opcaoPrincipal = scanner.nextInt();
            switch (opcaoPrincipal) {
                case 1:
                    System.out.println("Digite o valor a ser depositado:");
                    double valorDeposito = scanner.nextDouble();
                    conta1.depositar(valorDeposito);
                    System.out.println("Depósito realizado com sucesso!");
                    System.out.println("Saldo atual: " + conta1.getSaldo());
                    break;
                case 2:
                    System.out.println("Digite o valor a ser sacado:");
                    double valorSaque = scanner.nextDouble();
                    conta1.sacar(valorSaque);
                    System.out.println("Saque realizado com sucesso!");
                    System.out.println("Saldo atual: " + conta1.getSaldo());
                    break;
                case 3:
                    System.out.println("Saldo atual: " + conta1.getSaldo());
                    break;
                case 4:
                    System.out.println("Dados Cliente");
                    System.out.println("Nome: " + cliente1.getNome());
                    System.out.println("CPF: " + cliente1.getCpf());
                    System.out.println("Saldo: " + cliente1.getConta().getSaldo());
                    break;
                case 5:
                    System.out.println("Transferência");
                    System.out.println("Digite o CPF do destinatário:");
                    String cpfDestino = scanner.next();
                    Cliente destinatario = banco.buscarClientePorCpf(cpfDestino);

                        if (destinatario == null) {
                        System.out.println("Destinatario nao encontrado.");
                        break;
                        }
                    System.out.println("Digite o value a ser transferido:");
                    double valorTransferencia = scanner.nextDouble();
                    conta1.transferir(destinatario.getConta(), valorTransferencia);
                    System.out.println("Transferência realizada com sucesso!");
                    System.out.println("Saldo atual: " + conta1.getSaldo());
                    System.out.println("Destinatario: " + destinatario.getNome());
                    System.out.println("Saldo do destinatario: " + destinatario.getConta().getSaldo());
                    break;
                case 6:
                    System.out.println("Saindo do aplicativo...");
                    break;
               case 7:
                    System.out.println("Lista de Clientes:");
                    banco.listarClientes();
                    break;
                    
                }
             }  
             catch (InputMismatchException e) {
                System.out.println("Digite apenas numeros");
                scanner.nextLine();
        }   
            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    scanner.close();
    }
}
