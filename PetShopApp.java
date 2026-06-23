import java.util.ArrayList;
import java.util.Scanner;

public class PetShopApp {

    public static void main(String[] args) {
        ArrayList<Animal> pets = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n--- PET SHOP ---");
            System.out.println("1 - Adicionar pet");
            System.out.println("2 - Listar pets");
            System.out.println("3 - Vacinar pet");
            System.out.println("4 - Listar nomes dos gatos");
            System.out.println("5 - Listar idade humana dos pets");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            try {
                opcao = scanner.nextInt();
                scanner.nextLine(); // limpa o buffer

                switch (opcao) {
                    case 1:
                        System.out.print("Nome: ");
                        String nome = scanner.nextLine();
                        System.out.print("Tipo (1-Cachorro, 2-Gato): ");
                        int tipo = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Idade: ");
                        int idade = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Peso: ");
                        double peso = scanner.nextDouble();
                        scanner.nextLine();

                        if (tipo == 1) {
                            pets.add(new Cahorro(nome, "Cachorro", idade, peso));
                        } else {
                            pets.add(new Gato(nome, "Gato", idade, peso));
                        }
                        System.out.println("Pet adicionado!");
                        break;

                    case 2:
                        System.out.println("--- Pets cadastrados ---");
                        for (Animal pet : pets) {
                            System.out.println(pet.getNome() + " - " + pet.getEspecie());
                            pet.emitirSom(); // polimorfismo em ação!
                            
                                
                        }
                        long total = pets.stream().count();
                                System.out.println("Total de pets: " + total);
                        break;

                    case 3:
                        System.out.print("Nome do pet para vacinar: ");
                        String nomeVacinar = scanner.nextLine();
                        for (Animal pet : pets) {
                            if (pet.getNome().equalsIgnoreCase(nomeVacinar)) {
                                if (pet instanceof Vacinavel) {
                                    ((Vacinavel) pet).vacinar();
                                }
                            }
                        }
                        break;
                    case 4:
                        System.out.println("--- Nomes dos gatos ---");
                        pets.stream()
                            .filter(p -> p instanceof Gato)
                            .forEach(g -> System.out.println(g.getNome()));
                        break;
                    case 5:
                        System.out.println("--- Idade humana dos pets ---");
                        pets.stream()
                        .map(pet -> pet.getNome() + ": " + pet.getIdade() * 7)
                        .forEach(idadeHumana -> System.out.println("Idade Humana: " + idadeHumana + " anos"));
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                }

            } catch (Exception e) {
                System.out.println("Erro: digite um valor válido!");
                scanner.nextLine(); // limpa entrada inválida
            }
        }

        scanner.close();
    }
}