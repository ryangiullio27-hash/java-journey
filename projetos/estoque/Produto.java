import java.util.ArrayList;

public class Produto {
    private int id;
    private int estoque;
    private String name;
    private double preco;

    public int getEstoque() {
        return estoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco){
        if (preco <=0) throw new IllegalArgumentException("Preço inválido!");
        this.preco = preco;
    }
    public void setEstoque(int estoque){
        if (estoque < 0) throw new IllegalArgumentException("Estoque inválido");
        this.estoque = estoque;
    }
    public String getName(){
        return name;
    }
    public Produto(int id, int estoque, String name, double preco) {
        if (preco <=0) {
            throw new IllegalArgumentException("O preço não pode ser menor  ou igual a zero!");
            
        }
        // Falta isso também:
        if (estoque < 0) {
            throw new IllegalArgumentException("O estoque não pode ser negativo!");
        }
    

        this.id = id;
        this.preco = preco;
        this.estoque = estoque;
        this.name = name;
        
    }
    
    
}
