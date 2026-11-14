import java.util.ArrayList;
public class Biblioteca {
    private ArrayList<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }
    public void Resumo() {
        for (Livro livro : livros) {
            System.out.println(livro.getResumo());
        }
    }
    public void listarLivros() {
        for (Livro livro : livros) {
            livro.exibirInformacoes();
            System.out.println("-----------------------");
        }
    }
    public Livro buscarLivroPortitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Livro encontrado: " + livro.getTitulo() + " por " + livro.getAutor()
                        + " (" + livro.getAnoPublicacao() + ")");
                return livro;
            }
        }
        System.out.println("Livro não encontrado: " + titulo);
        return null;
    }
    
}
