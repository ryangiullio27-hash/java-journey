import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.Optional;

public class Produto1 {
    private String nome;
    private String categoria;
    private double preco;
public Produto1(String nome, String categoria, double preco){
    this.nome = nome;
    this.categoria = categoria;
    this.preco = preco;

}
public double getPreco() {
    return preco;
}

public String getCategoria() {
    return categoria;
}

public String getNome() {
    return nome;
}

    public static void main(String[] args) {
        ArrayList<Produto1> produtos = new ArrayList<>();
    produtos.add(new Produto1("computador","eletronico", 80));
    produtos.add(new Produto1("volei","esporte", 1180));
    produtos.add(new Produto1("golfe","esporte", 180));
    produtos.add(new Produto1("crepom","papel", 70));
    produtos.add(new Produto1("pizza","comida", 80));
    produtos.add(new Produto1("celular","eletronico", 100));

    OptionalDouble media = produtos.stream()
    .mapToDouble(p -> p.getPreco())
    .average();
    
    System.out.println("Média: R$ " + media.getAsDouble());

    // "agrupe por categoria e conte quantos tem em cada grupo"
        Map<String, Long> porCategoria = produtos.stream()
        .collect(Collectors.groupingBy(
        p -> p.getCategoria(),   // critério de agrupamento
        Collectors.counting()    // o que fazer em cada grupo
        ));

// pra imprimir:
porCategoria.forEach((categoria, qtd) -> 
    System.out.println(categoria + ": " + qtd + " produtos"));  

        Optional<Produto1> maiornumero = produtos.stream()
    .max((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco()));

    System.out.println("Maior preço: " + maiornumero.get().getNome() 
    + " - R$ " + maiornumero.get().getPreco());

        Optional<Produto1> menornumero = produtos.stream()
    .min((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco()));

    System.out.println("Menor preço: " + menornumero.get().getNome() 
    + " - R$ " + menornumero.get().getPreco());

    }
    
}
