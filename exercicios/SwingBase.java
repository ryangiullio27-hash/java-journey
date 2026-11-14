import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Component;
import java.awt.Font;

public class SwingBase {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Calculadora");
        janela.setLocationRelativeTo(null); // Centraliza a janela na tela
        janela.setSize(400, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JOptionPane.showMessageDialog(janela, "Bem-vindo à Calculadora!");
        JLabel labelSwitch = new JLabel("Escolha uma operação:");
        String[] opcoes = {"Soma", "Subtração", "Multiplicação", "Divisão"};
        String escolha = (String) JOptionPane.showInputDialog(janela, labelSwitch.getText(), "Operação", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        
        JLabel label = new JLabel("Número 1:");
        JTextField campo = new JTextField(5);
        JLabel label2 = new JLabel("Número 2:");
        JTextField campo2 = new JTextField(5);
        JButton botao = new JButton("Calcular");
        JLabel resultado = new JLabel("");

        switch (escolha) {
            case "Soma":
                botao.addActionListener(e -> {
                    try {
                        int num1 = Integer.parseInt(campo.getText());
                        int num2 = Integer.parseInt(campo2.getText());
                        int soma = num1 + num2;
                        resultado.setText("Resultado: " + soma);
                    } catch (NumberFormatException ex) {
                        resultado.setText("Por favor, insira números válidos.");
                    }
                });
                break;
            case "Subtração":
                botao.addActionListener(e -> {
                    try {
                        int num1 = Integer.parseInt(campo.getText());
                        int num2 = Integer.parseInt(campo2.getText());
                        int subtracao = num1 - num2;
                        resultado.setText("Resultado: " + subtracao);
                    } catch (NumberFormatException ex) {
                        resultado.setText("Por favor, insira números válidos.");
                    }
                });
                break;
            case "Multiplicação":
                botao.addActionListener(e -> {
                    try {
                        int num1 = Integer.parseInt(campo.getText());
                        int num2 = Integer.parseInt(campo2.getText());
                        int multiplicacao = num1 * num2;
                        resultado.setText("Resultado: " + multiplicacao);
                    } catch (NumberFormatException ex) {
                        resultado.setText("Por favor, insira números válidos.");
                    }
                });
                break;
            case "Divisão":
                botao.addActionListener(e -> {
                    try {
                        int num1 = Integer.parseInt(campo.getText());
                        int num2 = Integer.parseInt(campo2.getText());
                        int divisao = num1 / num2;
                        resultado.setText("Resultado: " + divisao);
                    } catch (NumberFormatException ex) {
                        resultado.setText("Por favor, insira números válidos.");
                    }
                        catch (ArithmeticException ex) {
                            resultado.setText("Erro: Divisão por zero não é permitida.");
                        }
                });
                break;
            default:
                break;
        }
    
        label.setForeground(Color.BLACK);
        label2.setForeground(Color.BLACK);
        resultado.setForeground(Color.BLACK);
        label.setFont(new Font("Arial", Font.BOLD, 15));
        label2.setFont(new Font("Arial", Font.BOLD, 15));
        resultado.setFont(new Font("Arial", Font.BOLD, 15));

        botao.setOpaque(true);
        botao.setBackground(Color.BLACK);
        botao.setForeground(Color.WHITE);
        botao.setFocusPainted(false);
        botao.setBorderPainted(false);
        janela.setLayout(new GridLayout(3, 2, 10, 10)); // Layout de grade com 3 linhas e 2 colunas
        janela.getContentPane().setBackground(Color.LIGHT_GRAY); // Cor de fundo da janela
        janela.add(label);
        janela.add(campo);
        janela.add(label2);
        janela.add(campo2);
        janela.add(botao);
        janela.add(resultado);
        janela.setVisible(true);
}
}
