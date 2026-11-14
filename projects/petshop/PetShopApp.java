import java.util.ArrayList;
import java.util.Scanner;

public class PetShopApp {

    public static void main(String[] args) {
        ArrayList<Animal> pets = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int option = -1;

        while (option != 0) {
            System.out.println("\n--- PET SHOP ---");
            System.out.println("1 - Add pet");
            System.out.println("2 - List pets");
            System.out.println("3 - Vaccinate pet");
            System.out.println("4 - List cat names");
            System.out.println("5 - List pets' human age");
            System.out.println("0 - Exit");
            System.out.print("Choose: ");

            try {
                option = scanner.nextInt();
                scanner.nextLine(); // clear the buffer

                switch (option) {
                    case 1:
                        System.out.print("Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Type (1-Dog, 2-Cat): ");
                        int type = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Age: ");
                        int age = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Weight: ");
                        double weight = scanner.nextDouble();
                        scanner.nextLine();

                        if (type == 1) {
                            pets.add(new Dog(name, "Dog", age, weight));
                        } else {
                            pets.add(new Cat(name, "Cat", age, weight));
                        }
                        System.out.println("Pet added!");
                        break;

                    case 2:
                        System.out.println("--- Registered pets ---");
                        for (Animal pet : pets) {
                            System.out.println(pet.getName() + " - " + pet.getSpecies());
                            pet.makeSound(); // polymorphism in action!
                        }
                        long total = pets.stream().count();
                        System.out.println("Total pets: " + total);
                        break;

                    case 3:
                        System.out.print("Name of the pet to vaccinate: ");
                        String nameToVaccinate = scanner.nextLine();
                        for (Animal pet : pets) {
                            if (pet.getName().equalsIgnoreCase(nameToVaccinate)) {
                                if (pet instanceof Vaccinable) {
                                    ((Vaccinable) pet).vaccinate();
                                }
                            }
                        }
                        break;
                    case 4:
                        System.out.println("--- Cat names ---");
                        pets.stream()
                            .filter(p -> p instanceof Cat)
                            .forEach(c -> System.out.println(c.getName()));
                        break;
                    case 5:
                        System.out.println("--- Pets' human age ---");
                        pets.stream()
                            .map(pet -> pet.getName() + ": " + pet.getAge() * 7)
                            .forEach(humanAge -> System.out.println("Human age: " + humanAge + " years"));
                        break;
                    case 0:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid option!");
                }

            } catch (Exception e) {
                System.out.println("Error: enter a valid value!");
                scanner.nextLine(); // clear invalid input
            }
        }

        scanner.close();
    }
}
