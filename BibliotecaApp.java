import java.util.Scanner;


public class BibliotecaApp {
    
    public static void main(String[] args) {
     Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        
        
        

        while (true) {
            System.out.println("Bem-vindo à Biblioteca!");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Listar Livros");
            System.out.println("3. Buscar Livro por Título");
            System.out.println("4. Emprestar Livro");
            System.out.println("5. Devolver Livro");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.println("Digite o título do livro:");
                    String titulo = scanner.nextLine();
                    System.out.println("Digite o autor do livro:");
                    String autor = scanner.nextLine();
                    System.out.println("Digite o ano de publicação do livro:");
                    String anoPublicacao = scanner.nextLine();
                    System.out.println("Digite o Resumo do livro:");
                    String resumo = scanner.nextLine();
                    System.out.println("Digite o tipo do livro (1 para Físico, 2 para Digital):");
                    int tipoLivro = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha
                        if (tipoLivro == 1) {
                            System.out.println("Digite o número de páginas do livro físico:");
                            int numeroPaginas = scanner.nextInt();
                            scanner.nextLine(); // Consumir a nova linha
                            LivroFisico livroFisico = new LivroFisico(titulo, autor, anoPublicacao, numeroPaginas, resumo);
                            biblioteca.adicionarLivro(livroFisico);
                        } else if (tipoLivro == 2) {
                            System.out.println("Digite o tamanho do arquivo em MB do livro digital:");
                            float tamanhoMB = scanner.nextFloat();
                            scanner.nextLine(); // Consumir a nova linha
                            LivroDigital livroDigital = new LivroDigital(titulo, autor, anoPublicacao, tamanhoMB, resumo);
                            biblioteca.adicionarLivro(livroDigital);
                        } else {
                            System.out.println("Tipo de livro inválido. Adicionando como livro genérico.");
                    Livro novoLivro = new Livro(titulo, autor, anoPublicacao, resumo);
                    biblioteca.adicionarLivro(novoLivro);
                    
                        }
                        break;
                case 2:
                    biblioteca.listarLivros();
                    break;
                case 3:
                    System.out.println("Digite o título do livro para buscar:");
                    String tituloBusca = scanner.nextLine();
                    biblioteca.buscarLivroPortitulo(tituloBusca);
                    break;
                case 4:
                    System.out.println("Digite o título do livro para emprestar:");
                    String tituloEmprestar = scanner.nextLine();
                    Livro livroEncontrado = biblioteca.buscarLivroPortitulo(tituloEmprestar);
                    if (livroEncontrado == null) {
                        System.out.println("Livro não encontrado para emprestar: " + tituloEmprestar);
                    } else {
                        livroEncontrado.emprestar();
                    }
                    break;
                case 5:
                    System.out.println("Digite o título do livro para devolver:");
                    String tituloDevolver = scanner.nextLine();
                    Livro livroDevolver = biblioteca.buscarLivroPortitulo(tituloDevolver);
                    if (livroDevolver == null) {
                        System.out.println("Livro não encontrado para devolver: " + tituloDevolver);
                    } else {
                        livroDevolver.devolver();
                    }
                    break;
                case 6:
                    System.out.println("Saindo da Biblioteca...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                
            }
        }
    } 
    }
