public class Conta {
    private double saldo;
    private String titular;

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }
    public void transferir(Conta destino, double valor) {
        sacar(valor);
        destino.depositar(valor);
    }
    public String getTitular() {
        return titular;
    }
    public void depositar(double valor) {
        if (valor <=0) {
           throw new IllegalArgumentException("Valor inválido.");
            
        }
        this.saldo += valor;
    }
    public void sacar(double valor) {
        if (valor <=0) {
            throw new IllegalArgumentException("Valor inválido.");
            
        }
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente.");
            
        }
        this.saldo -= valor;
    }
}
