import java.util.Scanner;
import java.util.ArrayList;
public class Estoque {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }
    public Produto buscarProdutoPorNome(String nomeBuscado){
        
        for (Produto produto: produtos) {
            if (produto.getName().equals(nomeBuscado)) {
                return produto;
                
            }
            
        }
        return null;
    }

    public void removerProduto(Produto produto){
        produtos.remove(produto);
    }
    public double calcularValorTotal(){
        double soma = 0;
        for (Produto produto: produtos) {
        soma += produto.getPreco() * produto.getEstoque();
        }
        return soma;
    }
    public void listarProdutos() {
    for (Produto produto : produtos) {
        System.out.println(produto.getName() + " - R$ " + produto.getPreco() + " - Qtd: " + produto.getEstoque());
    }
}
    
}