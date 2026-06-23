import java.util.ArrayList;
public class EmpresaRH {
    

    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
       

    
    public void removerFuncionario(Funcionario funcionario){
        funcionarios.remove(funcionario);
    }
    public void adicionarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }
    public void listarFuncionario(){
        for (Funcionario f: funcionarios){
                            System.out.println("Nome " + f.getNome());
                            System.out.println("Salario " + f.calcularSalario () + "R$");
                        }
    }
    public Funcionario buscarPorNome(String nome){
        for (Funcionario f: funcionarios){
            if (f.getNome().equals(nome)){
                return f;
            }
        }
        return null;
    }
}

