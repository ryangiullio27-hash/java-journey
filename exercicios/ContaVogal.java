public class ContaVogal {
    public static int contarVogais(String texto) {
        int contador = 0;
        String vogais = "AEIOUaeiou";

         for (char c : texto.toCharArray()) {  // percorre o TEXTO
        if (vogais.contains(String.valueOf(c))) { // verifica se é vogal
            contador++;
        }}
        
        return contador;
    }


public static void main(String[] args) {
        String texto = "Olá, Mundo!";
        int totalVogais = contarVogais(texto);
        System.out.println("Total de vogais em '" + texto + "': " + totalVogais);
    }
}
