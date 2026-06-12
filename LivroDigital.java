public class LivroDigital extends Livro implements Pesquisavel {
    private float tamanhoMB;

    public LivroDigital(String titulo, String autor, String anoPublicacao, float tamanhoMB, String resumo) {
        super(titulo, autor, anoPublicacao, resumo);
        this.tamanhoMB = tamanhoMB;
    
    }
    @Override
    public void exibirInformacoes() {
    super.exibirInformacoes();
    System.out.println("Tipo: Digital");
    System.out.println("Tamanho: " + tamanhoMB + " MB");
    }
    
    public float getTamanhoMB() {
        return tamanhoMB;
    }
}
