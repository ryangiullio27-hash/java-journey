import java.util.Scanner;
import java.lang.Math;
import java.lang.System;

public class Calculator {

    static double soma(double num1, double num2) {
            double resultado = num1 + num2;
            System.out.println("A soma é: " + resultado);
            return resultado;
        }
        static double subtracao(double num1, double num2) {
            double resultado = num1 - num2;
            System.out.println("A subtração é: " + resultado);
            return resultado;
        }
        static double multiplicacao(double num1, double num2) {
            double resultado = num1 * num2;
            System.out.println("A multiplicação é: " + resultado);
            return resultado;
        }
        static double divisao(double num1, double num2) {
            if (num2 != 0) {
                double resultado = num1 / num2;
                System.out.println("A divisão é: " + resultado);
                return resultado;
            } else {
                System.out.println("Erro: Divisão por zero não é permitida.");
                return Double.NaN;
            }
        }
        static double potencia(double base, double expoente) {
            double resultado = Math.pow(base, expoente);
            System.out.println("A potência é: " + resultado);
            return resultado;
        }
        static double raizQuadrada(double num) {
            if (num >= 0) {
                double resultado = Math.sqrt(num);
                System.out.println("A raiz quadrada é: " + resultado);
                return resultado;
            } else {
                System.out.println("Erro: Não é possível calcular a raiz quadrada de um número negativo.");
                return Double.NaN;
            }
            }
        static double logaritmo(double num) {
            if (num > 0) {
                double resultado = Math.log(num);
                System.out.println("O logaritmo é: " + resultado);
                return resultado;
            } else {
                System.out.println("Erro: O logaritmo só é definido para números positivos.");
                return Double.NaN;  
            }
        }
        static int fatorial(int num) {
            if (num >= 0) {
                long resultado = 1;
                for (int i = 1; i <= num; i++) {
                    resultado *= i;
                }
                System.out.println("O fatorial é: " + resultado);
                return (int) resultado;
            } else {
                System.out.println("Erro: O fatorial só é definido para números inteiros não negativos.");
                return -1;
            }
        }
        static double porcentagem(double valor, double percentual) {
            double resultado = (valor * percentual) / 100;
            System.out.println("A porcentagem é: " + resultado);
            return resultado;
        }
        static double media(double num1, double num2) {
            double resultado = (num1 + num2) / 2;
            System.out.println("A média é: " + resultado);
            return resultado;
        }
        static double maximo(double num1, double num2) {
            double resultado = Math.max(num1, num2);
            System.out.println("O máximo é: " + resultado);
            return resultado;
        }
        static double minimo(double num1, double num2) {
            double resultado = Math.min(num1, num2);
            System.out.println("O mínimo é: " + resultado);
            return resultado;
        }
        static double arredondar(double num) {
            double resultado = Math.round(num);
            System.out.println("O número arredondado é: " + resultado);
            return resultado;
        }
        static double truncar(double num) {
            double resultado = Math.floor(num);
            System.out.println("O número truncado é: " + resultado);
            return resultado;
        }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Calculadora de operações matemáticas");
            System.out.println("Escolha uma operação: soma, subtração, multiplicação, divisão, potência, raiz quadrada, logaritmo, fatorial, porcentagem, média, máximo, mínimo, arredondar ou truncar");
            String operacao = System.console().readLine();
            System.out.println("Digite o primeiro número:");
            double num1 = Double.parseDouble(System.console().readLine());
            double num2 = 0;
            if (operacao.equals("soma") || operacao.equals("subtração") || operacao.equals("multiplicação") || operacao.equals("divisão") || operacao.equals("potência") || operacao.equals("média") || operacao.equals("máximo") || operacao.equals("mínimo") || operacao.equals("porcentagem")) {
                System.out.println("Digite o segundo número:");
                num2 = Double.parseDouble(System.console().readLine());
            }
            switch (operacao) {
                case "soma":
                    soma(num1, num2);
                    break;
                case "subtração":
                    subtracao(num1, num2);
                    break;
                case "multiplicação":
                    multiplicacao(num1, num2);
                    break;
                case "divisão":
                    divisao(num1, num2);
                    break;
                case "potência":
                    potencia(num1, num2);
                    break;
                case "raiz quadrada":
                    raizQuadrada(num1);
                    break;
                case "logaritmo":
                    logaritmo(num1);
                    break;
                case "fatorial":
                    fatorial((int) num1);
                    break;
                case "porcentagem":
                    porcentagem(num1, num2);
                    break;
                case "média":
                    media(num1, num2);
                    break;
                case "máximo":
                    maximo(num1, num2);
                    break;
                case "mínimo":
                    minimo(num1, num2);
                    break;
                case "arredondar":
                    arredondar(num1);
                    break;
                case "truncar":
                    truncar(num1);
                    break;
                default:
                    System.out.println("Operação inválida. Por favor, escolha uma operação válida.");
            } 
            System.out.println("Deseja realizar outra operação? (sim/não)");
            String resposta = System.console().readLine();
            if (!resposta.matches("(?i)sim|s")) {
                System.out.println("Encerrando a calculadora. Obrigado por usar!");
                break;
            }

        }

    }
}

