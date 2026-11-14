import java.util.ArrayList;

public class Funcionario {
    private String nome;
    private double salarioBase;
    

    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
       

    }
    public double calcularSalario(){
        return salarioBase;
        }
       
    
    
    
    
    
    public double getSalarioBase() {
        return salarioBase;
    }
    public String getNome(){
        return nome;
    }
    
    public void setSalarioBase(int salarioBase){
        if(salarioBase <= 0)throw new IllegalArgumentException("O salario deve ser maior que 0");
        this.salarioBase = salarioBase;
    }
}
    

