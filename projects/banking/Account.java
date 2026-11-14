import java.math.BigDecimal;
import java.math.RoundingMode;

public class Account {
    private BigDecimal balance;
    private String holder;

    public Account(String holder, BigDecimal balance) {
        this.holder = holder;
        this.balance = balance.setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }

    public void deposit(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Invalid amount.");
        }
        this.balance = this.balance.add(amount.setScale(2, RoundingMode.HALF_UP));
    }

    public void withdraw(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Invalid amount.");
        }
        if (amount.compareTo(balance) > 0) {
            throw new IllegalArgumentException("Insufficient balance.");
        }
        this.balance = this.balance.subtract(amount.setScale(2, RoundingMode.HALF_UP));
    }

    public void transfer(Account destination, BigDecimal amount) {
        withdraw(amount);
        destination.deposit(amount);
    }
}
