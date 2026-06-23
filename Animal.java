public class Animal {
    private String nome;
    String especie;
    private int idade;
    private double peso;

    public Animal(String nome, String especie, int idade, double peso) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }
    public String getEspecie() {
        return especie;
    }
    public int getIdade() {
        return idade;
    }
    public double getPeso() {
        return peso;
    }
    public void emitirSom() {
        System.out.println(nome + " emite um sons.");
    }
    public void setPeso(double peso) {
        if (peso <=0) {
            throw new IllegalArgumentException("O peso deve ser maior que zero.");
            
        }
        this.peso = peso;
    }
    
}
