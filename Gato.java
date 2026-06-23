public class Gato extends Animal implements Vacinavel {
    public Gato(String nome, String especie, int idade, double peso) {
        super(nome, "Gato", idade, peso);
    }
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " o gato mia: Miau!");
    }
    @Override
    public void vacinar() {
        System.out.println(getNome() + " foi vacinado contra leucemia felina.");
    }
}
