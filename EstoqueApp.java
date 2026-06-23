import java.util.Scanner;

public class EstoqueApp {
   public static void main(String[] args) {
       int escolha = -1;
        Scanner scanner = new Scanner(System.in);
        Estoque estoque = new Estoque();
        

        while (escolha !=0) {
            System.out.println("Bem vindo ao EstoqueApp, escolha uma opção");
            System.out.println("1- Adicionar produto");
            System.out.println("2- Editar produto");
            System.out.println("3- Remover produto");
            System.out.println("4- Listar produtos: ");
        
           try {
                escolha = scanner.nextInt();
                scanner.nextLine(); // limpa o buffer
    
            } catch (Exception e) {
                System.out.println("Erro: digite um valor válido!");
                scanner.nextLine();
            }
        
        switch (escolha) {
            case 1: 
                System.out.println("Digite o nome do produto: ");
                String name = scanner.nextLine();
                System.out.println("Digite o id do produto a ser adicionado: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Digite o estoque atual do produto: ");
                int quantidadeEstoque = scanner.nextInt();
                System.out.println("Digite o valor do produto: ");
                double preco = scanner.nextDouble();
                scanner.nextLine();
                Produto novoProduto = new Produto(id, quantidadeEstoque, name, preco);
                estoque.adicionarProduto(novoProduto);
                System.out.println("Produto adicionado com sucesso!");
                break; 
            case 2: {
            System.out.println("Para alterar o produto digite o nome do produto: ");
            name = scanner.nextLine();
            Produto produtoEncontrado = estoque.buscarProdutoPorNome(name);

            if (produtoEncontrado == null) {
                System.out.println("Produto não encontrado!");
            }
            else {
                System.out.println("Digite o novo preço: ");
                double novoPreco = scanner.nextDouble();
                System.out.println("Digite o novo estoque: ");
                int novoEstoque = scanner.nextInt();
                produtoEncontrado.setEstoque(novoEstoque);
                produtoEncontrado.setPreco(novoPreco);
            }
            break;}
            case 3: {
                System.out.println("Para remover o produto digite o  nome do mesmo: ");
                name = scanner.nextLine();
                Produto produtoEncontrado = estoque.buscarProdutoPorNome(name);

                if (produtoEncontrado == null) {
                System.out.println("Produto não encontrado!");
            }
            else {
                estoque.removerProduto(produtoEncontrado); 
                System.out.println("Produto removido com sucesso!");

               }
                break;}
            case 4: {
                System.out.println("---produtos---");
                estoque.listarProdutos();
            }
            break;
        }
           }scanner.close();
        }
    }
