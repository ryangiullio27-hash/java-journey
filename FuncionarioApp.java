import java.util.Scanner;  


public class FuncionarioApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        EmpresaRH rh = new EmpresaRH(); // ← objeto da EmpresaRH

        int opcao = -1;
        while (opcao !=4) {
            System.out.println("Bem vindo ao programa do patrão");
            System.out.println("Digite a opção desejada: ");
            System.out.println("1 - Adicionar funcionario");
            System.out.println("2- Remover funcionario");
            System.out.println("3- Listar funcionarios");
            System.out.println("4- Sair do programa");
            
            try {
                opcao = scanner.nextInt();
                scanner.nextLine(); // limpa o buffer
          
            } catch (Exception e) {
                System.out.println("Erro: digite um valor válido!");
                scanner.nextLine();
            }
            
                switch (opcao) {
                    case 1: 
                    System.out.println("Digite o nome do funcionario");
                    String nome = scanner.nextLine();
                    System.out.println("Qual o salario Base do funcionario");
                    double salarioBase = scanner.nextDouble();
                    System.out.println("Qual o cargo do funcionario, 1 para padrão, 2 para gerente e 3 para vendedor");
                    int cargo = scanner.nextInt();
                         
                    
                    Funcionario novofuncionario;
                    if (cargo == 1) {
                        novofuncionario = new Funcionario(nome, salarioBase);
                        System.out.println("Funcionario adicionado com sucesso!");
                        System.out.println("Gerente adicionado com sucesso!");
                        novofuncionario = new Funcionario(
                        nome,
                        salarioBase

                    );
                    rh.adicionarFuncionario(novofuncionario);
                    }
                    if (cargo == 2) {
                        novofuncionario = new Gerente(nome, salarioBase);
                        System.out.println("Gerente adicionado com sucesso!");
                        novofuncionario = new Gerente(
                        nome,
                        salarioBase

                    );
                    rh.adicionarFuncionario(novofuncionario);
                    }
                    if (cargo == 3) {
                        System.out.println("Digite a quantidade de vendas:");
                            int quantidadeVendas = scanner.nextInt();

                        System.out.println("Digite a comissão:");
                        double comissao = scanner.nextDouble();
                        System.out.println("Vendedor adicionado com sucesso!");

                        novofuncionario = new Vendedor(
                        nome,
                        quantidadeVendas,
                        salarioBase,
                        comissao
                        
                            );
                                
                    rh.adicionarFuncionario(novofuncionario);}
                    break;
                    case 2:
                    System.out.println("Digite o nome do funcionario: ");
                    String nome1 = scanner.nextLine();
                    Funcionario funcionarioEncontrado = rh.buscarPorNome(nome1);

                    if (funcionarioEncontrado == null) {
                        System.out.println("Funcionario não foi encontrado por esse nome");
                        
                    }
                    else {
                        rh.removerFuncionario(funcionarioEncontrado);
                    }break;
                    case 3:
                        System.out.println("---Funcionarios---");
                   
                        rh.listarFuncionario();
                    break;
                    case 4: 
                    System.out.println("Obrigado por usar nosso app de funcionarios!");
                    break;
                    }}scanner.close();
                    
            
                
        }

    }
    

