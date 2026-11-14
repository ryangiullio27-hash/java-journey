public class Livro implements Pesquisavel {
    private String titulo;
    private String autor;
    private String anoPublicacao;
    private boolean emprestado;
    private String resumo;

    
    public Livro(String titulo, String autor, String anoPublicacao, String resumo) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.emprestado = false;
        this.resumo = resumo;
    }
    
    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Resumo: " + resumo);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println("Status: " + (emprestado ? "Emprestado" : "Disponível"));
    }
    @Override
    public String getResumo() {
         return titulo + " de " + autor + " (" + anoPublicacao + ")";
    }
    
    public String getTitulo() {
        return titulo;
    }
    public String getTipo() {
        return (this instanceof LivroFisico ? "Físico" : this instanceof LivroDigital ? "Digital" : "Genérico");
    }
    public String getAutor() {
        return autor;
    }
    public String getAnoPublicacao() {
        return anoPublicacao;
    }
    public boolean isEmprestado() {
        return emprestado;
    }

    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("Livro emprestado: " + titulo);
        } else {
            System.out.println("Livro já está emprestado: " + titulo);
        }
    }
    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("Livro devolvido: " + titulo);
        } else {
            System.out.println("Livro não estava emprestado: " + titulo);
        }
    }
    public void status() {
        if (emprestado) {
            System.out.println("Livro '" + titulo + "' está emprestado.");
        } else {
            System.out.println("Livro '" + titulo + "' está disponível.");
        }
    }
}