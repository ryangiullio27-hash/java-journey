import java.util.Scanner;

public class oop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        roupa roupa1 = new roupa();
        System.out.println("Digite a cor da roupa:");
        roupa1.cor = scanner.nextLine();
        System.out.println("A cor da roupa é: " + roupa1.cor);
            if (roupa1.mixCores()) {
                System.out.println("A cor da roupa tem cores misturadas.");
                
            }else {
                System.out.println("A cor da roupa não tem cores misturadas.");
            }
            scanner.close();
    }
        
    }   


    

