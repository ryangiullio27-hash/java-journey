public class ContaBancaria {

    static double verificarsaldo(double saldo) {
        System.out.printf("O saldo atual é: R$ %.2f%n", saldo);
        return saldo;
    }
    static double depositar(double saldo, double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito realizado com sucesso! Novo saldo: R$ %.2f%n", saldo);
            return saldo;
        } else {
            System.out.println("Valor de depósito inválido! O valor deve ser positivo.");
            return saldo;
        }
    }
    static double sacar(double saldo, double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.printf("Saque realizado com sucesso! Novo saldo: R$ %.2f%n", saldo);
            return saldo;
        } else if (valor > saldo) {
            System.out.printf("Saldo insuficiente para realizar o saque! Saldo atual: R$ %.2f%n", saldo);
            return saldo;
        } else {
            System.out.println("Valor de saque inválido! O valor deve ser positivo.");
            return saldo;
        }
    }
        static double transferir(double saldo, double valor, String destinatario) {
            if (valor > 0 && valor <= saldo) {
                saldo -= valor;
                System.out.printf("Transferência de R$ %.2f para %s realizada com sucesso! Novo saldo: R$ %.2f%n", valor, destinatario, saldo);
                return saldo;
            } else if (valor > saldo) {
                System.out.printf("Saldo insuficiente para realizar a transferência! Saldo atual: R$ %.2f%n", saldo);
                return saldo;
            } else {
                System.out.println("Valor de transferência inválido! O valor deve ser positivo.");
                return saldo;
            }
        }
        static double pagarconta(double saldo, double valor, String conta) {
            if (valor > 0 && valor <= saldo) {
                saldo -= valor;
                System.out.printf("Pagamento da conta %s no valor de R$ %.2f realizado com sucesso! Novo saldo: R$ %.2f%n", conta, valor, saldo);
                return saldo;
            } else if (valor > saldo) {
                System.out.printf("Saldo insuficiente para realizar o pagamento! Saldo atual: R$ %.2f%n", saldo);
                return saldo;
            } else {
                System.out.println("Valor de pagamento inválido! O valor deve ser positivo.");
                return saldo;
            }
        }
        static double recebertransferencia(double saldo, double valor, String remetente) {
            if (valor > 0) {
                saldo += valor;
                System.out.printf("Recebimento de transferência de R$ %.2f de %s realizado com sucesso! Novo saldo: R$ %.2f%n", valor, remetente, saldo);
                return saldo;
            } else {
                System.out.println("Valor de transferência inválido! O valor deve ser positivo.");
                return saldo;
            }
        }
        static double sair(double saldo) {
            System.out.printf("Encerrando a conta bancária. Saldo final: R$ %.2f%n", saldo);
            return saldo;
        }
        
    public static void main(String[] args) {
        double saldo = 100.00; // Saldo inicial da conta
        System.out.println("Bem-vindo ao sistema bancário!");
        while (true) {
            System.out.println("Escolha uma operação:");
            System.out.println("1 - Verificar Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Transferir");
            System.out.println("5 - Pagar Conta");
            System.out.println("6 - Receber Transferência");
            System.out.println("7 - Sair");
            
             int escolha = Integer.parseInt(System.console().readLine());
             switch (escolha) {
                case 1:
                    verificarsaldo(saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor a ser depositado:");
                    double valorDeposito = Double.parseDouble(System.console().readLine());
                    saldo = depositar(saldo, valorDeposito);
                    break;
                case 3:
                    System.out.println("Digite o valor a ser sacado:");
                    double valorSaque = Double.parseDouble(System.console().readLine());
                    saldo = sacar(saldo, valorSaque);
                    break;
                case 4:
                    System.out.println("Digite o valor a ser transferido:");
                    double valorTransferencia = Double.parseDouble(System.console().readLine());
                    System.out.println("Digite o destinatário da transferência:");
                    String destinatario = System.console().readLine();
                    saldo = transferir(saldo, valorTransferencia, destinatario);
                    break;
                case 5:
                    System.out.println("Digite o valor da conta a ser paga:");
                    double valorConta = Double.parseDouble(System.console().readLine());
                    System.out.println("Digite o nome da conta a ser paga:");
                    String conta = System.console().readLine();
                    saldo = pagarconta(saldo, valorConta, conta);
                    break;
                case 6:
                    System.out.println("Digite o valor da transferência recebida:");
                    double valorRecebido = Double.parseDouble(System.console().readLine());
                    System.out.println("Digite o remetente da transferência:");
                    String remetente = System.console().readLine();
                    saldo = recebertransferencia(saldo, valorRecebido, remetente);
                    break;
                case 7:
                    sair(saldo);
                    return;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida."); 
            
        }
        
    }
}
}
