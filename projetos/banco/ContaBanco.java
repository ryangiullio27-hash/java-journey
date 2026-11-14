import java.util.ArrayList;

public class ContaBanco {
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    public Cliente buscarClientePorCpf(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        System.out.println("Cliente não encontrado.");
        return null;
    }
    public void listarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCpf());
            System.out.println("Saldo: " + cliente.getConta().getSaldo());
        }
    }
}