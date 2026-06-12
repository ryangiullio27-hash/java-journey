import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;


public class RestoDaDivisaoSwing {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bem-vindo a calculadora de resto da divisão!");
        JLabel label = new JLabel("Resto da divisão:");
        
        String input1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        String input2 = JOptionPane.showInputDialog("Digite o segundo número:");
        try {
            int numero1 = Integer.parseInt(input1);
            int numero2 = Integer.parseInt(input2);
            if (numero2 != 0) {
                int resto = numero1 % numero2;
                JOptionPane.showMessageDialog(null, "O resto da divisão é: " + resto);
                label.setText("Resto da divisão: " + resto);
            } else {
                JOptionPane.showMessageDialog(null, "Divisão por zero não é permitida!");
                label.setText("Divisão por zero não é permitida!");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira números válidos.");
        }
        
        JFrame janela = new JFrame("Resto da Divisão");
        janela.setLocationRelativeTo(null); // Centraliza a janela na tela
        label.setBounds(50, 150, 200, 30);
        label.setFont(new Font("Arial", Font.BOLD, 16));
        label.setForeground(Color.BLUE);
        janela.setLayout(null);
        janela.add(label);
        janela.setSize(400, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        
    }     
}
