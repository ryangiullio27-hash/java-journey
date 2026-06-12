import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class MelhorNotaSwing {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Bem-vindo a calculadora de melhor nota!");
        String input1 = JOptionPane.showInputDialog("Digite a primeira nota:");
        String input2 = JOptionPane.showInputDialog("Digite a segunda nota:");
        try {
            double nota1 = Double.parseDouble(input1);
            double nota2 = Double.parseDouble(input2);
            double melhorNota = Math.max(nota1, nota2);
            JOptionPane.showMessageDialog(null, "A melhor nota é: " + melhorNota);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira números válidos.");
        }
        JFrame janela = new JFrame("Melhor Nota");
        janela.setLocationRelativeTo(null); // Centraliza a janela na tela
        JLabel label = new JLabel("Melhor nota: " + Math.max(Double.parseDouble(input1), Double.parseDouble(input2)));
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
