public class LivroFisico extends Livro implements Pesquisavel {
    private int numeroPaginas;

    public LivroFisico(String titulo, String autor, String anoPublicacao, int numeroPaginas, String resumo) {
    super(titulo, autor, anoPublicacao, resumo);
    this.numeroPaginas = numeroPaginas;
}
    @Override
    public void exibirInformacoes() {
    super.exibirInformacoes();
    System.out.println("Tipo: Físico");
    System.out.println("Páginas: " + numeroPaginas);
    }
    public int getNumeroPaginas() {
        return numeroPaginas;
    }
}
