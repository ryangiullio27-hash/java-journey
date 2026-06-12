import java.util.Scanner;

public class NotasAlunosArray {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao programa de notas dos alunos!");
        System.out.println("Digite a quantidade de alunos:");
        Scanner scanner = new Scanner(System.in);
        int quantidadeAlunos = scanner.nextInt();
        double[] notas = new double[quantidadeAlunos];
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println("Digite a nota do aluno " + (i + 1) + ":");
            notas[i] = scanner.nextDouble();
        }
        double somaNotas = 0;
        for (int i = 0; i < notas.length; i++) {
            somaNotas += notas[i];
        }
        double mediaNotas = somaNotas / notas.length;
        System.out.println("A média das notas dos alunos é: " + mediaNotas);
    }
    
}
