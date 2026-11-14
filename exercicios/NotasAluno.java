public class NotasAluno {
    
    static int AdicionarAluno(String[] nomes, double[][] notas, int totalAlunos, String nome, double nota1, double nota2, double nota3, double nota4) {
        if (totalAlunos >=5) {
            System.out.println("Limite de alunos atingido! Não é possível adicionar mais alunos.");
            return totalAlunos; 
        }
        nomes[totalAlunos] = nome;
        notas[totalAlunos][0] = nota1;
        notas[totalAlunos][1] = nota2;
        notas[totalAlunos][2] = nota3;
        notas[totalAlunos][3] = nota4;
        totalAlunos++;
        System.out.printf("Aluno %s adicionado com sucesso! Total de alunos: %d%n", nome, totalAlunos);
        return totalAlunos;
    }
    static void ListarAlunos(String[] nomes, double[][] notas, int totalAlunos) {
       if (totalAlunos == 0) {
            System.out.println("Nenhum aluno cadastrado! Não há alunos para listar.");
            return;
       }
        System.out.println("Lista de Alunos:");
        for (int i = 0; i < totalAlunos; i++) {
            double media = (notas[i][0] + notas[i][1] + notas[i][2] + notas[i][3]) / 4;
            String status = media >= 7.0 ? "Aprovado" : "Reprovado";
            System.out.printf("Aluno: %s - Notas: %.2f, %.2f, %.2f, %.2f - Status: %s%n", nomes[i], notas[i][0], notas[i][1], notas[i][2], notas[i][3], status);
        }
    }
    static double MostrarAlunoComMaiorMedia(String[] nomes, double[][] notas, int totalAlunos) {
        if (totalAlunos == 0) {
                System.out.println("Nenhum aluno cadastrado! Não é possível calcular a média.");
                return 0.0;
            }
        double maiorMedia = 0.0;
        String alunoMaiorMedia = "";
        for (int i = 0; i < totalAlunos; i++) {
            double media = (notas[i][0] + notas[i][1] + notas[i][2] + notas[i][3]) / 4;
            if (media > maiorMedia) {
                maiorMedia = media;
                alunoMaiorMedia = nomes[i];
            
            }
        }
        System.out.printf("Aluno com maior média: %s (Média: %.2f)%n", alunoMaiorMedia, maiorMedia);
        return maiorMedia;
    }
    static double MostrarAlunoComMenorMedia(String[] nomes, double[][] notas, int totalAlunos) {
        if (totalAlunos == 0) {
                System.out.println("Nenhum aluno cadastrado! Não é possível calcular a média.");
                return 0.0;
            }
        double menorMedia = 10.0;
        String alunoMenorMedia = "";
        for (int i = 0; i < totalAlunos; i++) {
            double media = (notas[i][0] + notas[i][1] + notas[i][2] + notas[i][3]) / 4;
            if (media < menorMedia) {
                menorMedia = media;
                alunoMenorMedia = nomes[i];
            }
        }
        System.out.printf("Aluno com menor média: %s (Média: %.2f)%n", alunoMenorMedia, menorMedia);
        return menorMedia;
    }
    static void Sair() {
        System.out.println("Encerrando o sistema de notas dos alunos. Até mais!");
    }

    public static void main(String[] args) {
        String[] nomes = new String[5];
        int totalAlunos = 0;
        double[][] notas = new double[5][4];
        System.out.println("Bem-vindo ao sistema de notas dos alunos!");
        while (true) {
            System.out.println("Escolha uma operação:");
            System.out.println("1 - Adicionar Aluno");
            System.out.println("2 - Listar Alunos");
            System.out.println("3 - Mostrar Aluno com Maior Média");
            System.out.println("4 - Mostrar Aluno com Menor Média");
            System.out.println("5 - Sair");
            
             int escolha = Integer.parseInt(System.console().readLine());
             switch (escolha) {
                case 1:
                    System.out.println("Digite o nome do aluno:");
                    String nome = System.console().readLine();
                    System.out.println("Digite a nota 1:");
                    double nota1 = Double.parseDouble(System.console().readLine());
                    System.out.println("Digite a nota 2:");
                    double nota2 = Double.parseDouble(System.console().readLine());
                    System.out.println("Digite a nota 3:");
                    double nota3 = Double.parseDouble(System.console().readLine());
                    System.out.println("Digite a nota 4:");
                    double nota4 = Double.parseDouble(System.console().readLine());
                    totalAlunos = AdicionarAluno(nomes, notas, totalAlunos, nome, nota1, nota2, nota3, nota4);
                    break;
                case 2:
                    System.out.println("Os alunos cadastrados são:");
                    ListarAlunos(nomes, notas, totalAlunos);
                    break;
                case 3:
                    MostrarAlunoComMaiorMedia(nomes, notas, totalAlunos);
                    break;
                case 4:
                    MostrarAlunoComMenorMedia(nomes, notas, totalAlunos);
                    break;
                case 5:
                    Sair();
                    return;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
            }
            
        }
       
    }
    
}
