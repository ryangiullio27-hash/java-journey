import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.Optional;

public class StreamDesafio2 {
    private String nome;
    private String categoria;
    private double preco;

    public StreamDesafio2(String nome, String categoria, double preco){
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;

    }
    public String getNome(){
        return nome;
    }
    public String getCategoria(){
        return categoria;
    }
    public double getPreco(){
        return preco;
    }

    public static void main(String[] args) {
        ArrayList<StreamDesafio2> produtos = new ArrayList<>();
        produtos.add(new StreamDesafio2("pc", "eletronico", 19999));
        produtos.add(new StreamDesafio2("celular", "eletronico", 9));
        produtos.add(new StreamDesafio2("peixe", "comida", 198));
        produtos.add(new StreamDesafio2("carne", "comida", 999));
        produtos.add(new StreamDesafio2("strike", "boliche", 19));
OptionalDouble media = produtos.stream()
.mapToDouble(p -> p.getPreco())
.average();

System.out.println("Média " + media.getAsDouble() + "R$");

Optional<StreamDesafio2> menornumero = produtos.stream()
.min((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco()));

System.out.println("Menor preço " + menornumero.get().getNome() + "- R$ " + menornumero.get().getPreco());

Optional<StreamDesafio2> maiornumero = produtos.stream()
.max((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco()));

System.out.println("Maior preço " + maiornumero.get().getNome() + "- R$ " + maiornumero.get().getPreco());

Map<String, Long> porCategoria = produtos.stream()
.collect(Collectors.groupingBy(
    p -> p.getCategoria(),
    Collectors.counting()));

    porCategoria.forEach((categoria, qtd) ->
    System.out.println(categoria + " : "  + qtd + " Produtos"));


        
    }
    
}
