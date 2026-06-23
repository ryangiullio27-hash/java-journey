import java.util.Scanner;

public class Validador {

    public static void validarSenha(String senha) {

        boolean temMaiuscula = false;
        boolean temMinuscula = false;
        boolean temNumero = false;
        boolean temEspecial = false;

        if (senha.length() < 8) {
            System.out.println("❌ A senha deve conter pelo menos 8 caracteres.");
        }

        for (char c : senha.toCharArray()) {

            if (Character.isUpperCase(c)) {
                temMaiuscula = true;
            }

            if (Character.isLowerCase(c)) {
                temMinuscula = true;
            }

            if (Character.isDigit(c)) {
                temNumero = true;
            }

            if (!Character.isLetterOrDigit(c)) {
                temEspecial = true;
            }
        }

        if (!temMaiuscula) {
            System.out.println("❌ Falta uma letra maiúscula.");
        }

        if (!temMinuscula) {
            System.out.println("❌ Falta uma letra minúscula.");
        }

        if (!temNumero) {
            System.out.println("❌ Falta um número.");
        }

        if (!temEspecial) {
            System.out.println("❌ Falta um caractere especial.");
        }

        if (senha.length() >= 8 &&
            temMaiuscula &&
            temMinuscula &&
            temNumero &&
            temEspecial) {

            System.out.println("✅ Senha válida!");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma senha: ");
        String senha = scanner.nextLine();

        validarSenha(senha);

        scanner.close();
    }
}