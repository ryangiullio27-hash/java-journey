public class Customer {
    private String name;
    private String taxId; // CPF (Brazilian individual taxpayer ID)
    private Account account;

    public Customer(String name, String taxId, Account account) {
        this.name = name;
        this.taxId = taxId;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public String getTaxId() {
        return taxId;
    }

    public Account getAccount() {
        return account;
    }
}
