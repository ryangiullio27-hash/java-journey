import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class CombinadorDePeçasPorCor {
    public static void main(String[] args) {
        HashMap<String, List<String>> peçasPorCor = new HashMap<>();
        peçasPorCor.put("Vermelho", Arrays.asList("Peça Camisa", "Peça Bermuda"));
        peçasPorCor.put("Azul", Arrays.asList("Peça Calça", "Peça Jaqueta"));
        peçasPorCor.put("Verde", Arrays.asList("Peça Sapato", "Peça Meia"));
        System.out.println("Escolha uma cor para combinar as peças: Vermelho, Azul ou Verde");
        System.out.println("Digite a cor desejada:");
        Scanner scanner = new Scanner(System.in);
        String corEscolhida = scanner.nextLine();

        List<String> peçasCombinadas = peçasPorCor.get(corEscolhida);
        if (peçasCombinadas != null) {
            System.out.println("Peças combinadas para a cor " + corEscolhida + ": " + peçasCombinadas);
        } else {
            System.out.println("Nenhuma peça encontrada para a cor " + corEscolhida);
        }

        scanner.close();

    }
}