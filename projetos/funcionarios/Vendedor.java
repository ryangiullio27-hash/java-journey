public class Vendedor extends Funcionario {
    public Vendedor(String nome, int quantidadeVendas, double salarioBase, double comissao){
        super(nome, salarioBase); 
    
        this.quantidadeVendas = quantidadeVendas;
        this.comissao = comissao;
   
    }
    private int quantidadeVendas;
    private double comissao;
    @Override 
    public double calcularSalario(){
        return getSalarioBase() + quantidadeVendas * comissao;
    }

    
}
