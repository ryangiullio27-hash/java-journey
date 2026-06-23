public class Cahorro extends Animal implements Vacinavel {
    public Cahorro(String nome, String especie, int idade, double peso) {
        super(nome, "Cachorro", idade, peso);
    }
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " o cachorro late: Au Au!");
    }
    @Override
    public void vacinar() {
        System.out.println(getNome() + " foi vacinado contra a raiva.");
    }
}
