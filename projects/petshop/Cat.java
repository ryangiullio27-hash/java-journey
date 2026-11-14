public class Cat extends Animal implements Vaccinable {
    public Cat(String name, String species, int age, double weight) {
        super(name, "Cat", age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " the cat meows: Meow!");
    }

    @Override
    public void vaccinate() {
        System.out.println(getName() + " was vaccinated against feline leukemia.");
    }
}
