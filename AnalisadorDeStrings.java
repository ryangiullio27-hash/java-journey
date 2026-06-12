import java.util.Scanner;


public class AnalisadorDeStrings {
    public static void main(String[] args) {
        System.out.println("Analisador de Strings");
        System.out.println("Digite uma string: ");
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();
        int comprimento = texto.length();
        System.out.println("O comprimento da string é: " + comprimento);
        System.out.println("A string em letras maiúsculas é: " + texto.toUpperCase());      
        System.out.println("A string em letras minúsculas é: " + texto.toLowerCase());
        System.out.println("A string invertida é: " + new StringBuilder(texto).
reverse().toString());
        System.out.println("A string sem espaços é: " + texto.replaceAll("\\s+", ""));
        System.out.println("A string com espaços substituídos por hífens é: " + texto.replaceAll("\\s+", "-"));
        System.out.println("A string com as vogais removidas é: " + texto.replaceAll("[AEIOUaeiou]", ""));
        System.out.println("A string com as consoantes removidas é: " + texto.replaceAll("[BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz]", ""));
        System.out.println("A string com as letras 'a' substituídas por '@' é: " + texto.replaceAll("a", "@").replaceAll("A", "@"));
        System.out.println("A string com as letras 'e' substituídas por '3  ' é: " + texto.replaceAll("e", "3").replaceAll("E", "3"));
        System.out.println("A string com as letras 'i' substituídas por '1' é: " + texto.replaceAll("i", "1").replaceAll("I", "1"));
        System.out.println("A string com as letras 'o' substituídas por '0' é: " + texto.replaceAll("o", "0").replaceAll("O", "0"));
        System.out.println("A string com as letras 's' substituídas por '5' é: " + texto.replaceAll("s", "5").replaceAll("S", "5"));
        System.out.println("A primeira letra da string é: " + texto.charAt(0));
        System.out.println("A última letra da string é: " + texto.charAt(comprimento - 1));
        System.out.println("A string sem a primeira e a última letra é: " + texto.substring(1, comprimento - 1));
    }
}

    

