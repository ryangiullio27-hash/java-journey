public class Dog extends Animal implements Vaccinable {
    public Dog(String name, String species, int age, double weight) {
        super(name, "Dog", age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " the dog barks: Woof Woof!");
    }

    @Override
    public void vaccinate() {
        System.out.println(getName() + " was vaccinated against rabies.");
    }
}
