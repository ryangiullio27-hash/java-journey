import java.util.Scanner;

public class MelhorAluno {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao programa de avaliação de alunos!");
        System.out.println("Digite quantos alunos existem na turma: ");
        Scanner scanner = new Scanner(System.in);
        int quantidadeAlunos = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após o nextInt()

        String melhorAluno = "";
        double maiorNota = Double.MIN_VALUE;

        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println("Digite o nome do aluno: ");
            String nomeAluno = scanner.nextLine();
            System.out.println("Digite a nota do aluno: ");
            double notaAluno = scanner.nextDouble();
            scanner.nextLine(); // Consumir a quebra de linha após o nextDouble()

            if (notaAluno > maiorNota) {
                maiorNota = notaAluno;
                melhorAluno = nomeAluno;
            }
        }

        System.out.println("O melhor aluno é: " + melhorAluno + " com nota: " + maiorNota);
        scanner.close();
        }
    }