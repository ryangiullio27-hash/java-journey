public class roupa {
    String cor;
    int tamanho;
    String marca;

    public void vestir() {
        System.out.println("A roupa está sendo vestida.");
    }
    public boolean mixCores() {
        return cor.contains("vermelho") && cor.contains("azul");
    }
    public void corbranca() {
        System.out.println("A roupa é branca.");
    }
    
}
