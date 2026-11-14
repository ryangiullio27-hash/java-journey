import javax.swing.JOptionPane;


public class CalculadoraSwing {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bem-vindo a calculadora!");

        String operacao = JOptionPane.showInputDialog("Escolha a operação:\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
        int soma = 0;
        switch (operacao) {
            case "1":
                for (int i = 0; i < 2; i++) {
                    String input = JOptionPane.showInputDialog("Digite o número " + (i + 1) + ":");
                    int numero = Integer.parseInt(input);
                    soma += numero;
                }
                JOptionPane.showMessageDialog(null, "A soma dos números é: " + soma);
                break;
            case "2":
                for (int i = 0; i < 2; i++) {
                    String input = JOptionPane.showInputDialog("Digite o número " + (i + 1) + ":");
                    int numero = Integer.parseInt(input);
                    if (i == 0) {
                        soma = numero;
                    } else {
                        soma -= numero;
                    }
                }
                JOptionPane.showMessageDialog(null, "O resultado da subtração é: " + soma);
                break;
            case "3":
                    for (int i = 0; i < 2; i++) {
                        String input = JOptionPane.showInputDialog("Digite o número " + (i + 1) + ":");
                        int numero = Integer.parseInt(input);
                        if (i == 0) {
                            soma = numero;
                        } else {
                            soma *= numero;
                        }
                    }
                    JOptionPane.showMessageDialog(null, "O resultado da multiplicação é: " + soma);
                    break;
            case "4":
                    for (int i = 0; i < 2; i++) {
                        String input = JOptionPane.showInputDialog("Digite o número " + (i + 1) + ":");
                        int numero = Integer.parseInt(input);
                        if (i == 0) {
                            soma = numero;
                        } else {
                            if (numero != 0) {
                                soma /= numero;
                            } else {
                                JOptionPane.showMessageDialog(null, "Divisão por zero não é permitida!");
                                return;
                            }
                        }
                    }
                    JOptionPane.showMessageDialog(null, "O resultado da divisão é: " + soma);
                    break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
        }
    }
}