import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AccountTest {

    private Account account;

    @BeforeEach
    void setUp() {
        account = new Account("Ryan", new BigDecimal("100.00"));
    }

    @Test
    void depositIncreasesBalance() {
        account.deposit(new BigDecimal("25.50"));

        assertEquals(new BigDecimal("125.50"), account.getBalance());
    }

    @Test
    void withdrawDecreasesBalance() {
        account.withdraw(new BigDecimal("30.00"));

        assertEquals(new BigDecimal("70.00"), account.getBalance());
    }

    @Test
    void withdrawMoreThanBalanceThrowsAndKeepsBalance() {
        assertThrows(IllegalArgumentException.class,
                () -> account.withdraw(new BigDecimal("100.01")));

        assertEquals(new BigDecimal("100.00"), account.getBalance());
    }

    @Test
    void depositOfZeroOrNegativeAmountThrows() {
        assertThrows(IllegalArgumentException.class,
                () -> account.deposit(BigDecimal.ZERO));
        assertThrows(IllegalArgumentException.class,
                () -> account.deposit(new BigDecimal("-5")));
    }

    @Test
    void transferMovesMoneyBetweenAccounts() {
        Account destination = new Account("Maria", BigDecimal.ZERO);

        account.transfer(destination, new BigDecimal("40.00"));

        assertEquals(new BigDecimal("60.00"), account.getBalance());
        assertEquals(new BigDecimal("40.00"), destination.getBalance());
    }

    @Test
    void failedTransferLeavesBothBalancesUnchanged() {
        Account destination = new Account("Maria", new BigDecimal("10.00"));

        assertThrows(IllegalArgumentException.class,
                () -> account.transfer(destination, new BigDecimal("500.00")));

        assertEquals(new BigDecimal("100.00"), account.getBalance());
        assertEquals(new BigDecimal("10.00"), destination.getBalance());
    }

    @Test
    void amountsAreRoundedToTwoDecimals() {
        account.deposit(new BigDecimal("30.456"));

        assertEquals(new BigDecimal("130.46"), account.getBalance());
    }

    @Test
    void tenDepositsOfTenCentsAddUpToExactlyOneDollar() {
        Account empty = new Account("Test", BigDecimal.ZERO);

        for (int i = 0; i < 10; i++) {
            empty.deposit(new BigDecimal("0.10"));
        }

        // With double this would be 0.9999999999999999
        assertEquals(new BigDecimal("1.00"), empty.getBalance());
    }
}