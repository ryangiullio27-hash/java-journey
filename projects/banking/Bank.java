import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public Customer findCustomerByTaxId(String taxId) {
        for (Customer customer : customers) {
            if (customer.getTaxId().equals(taxId)) {
                return customer;
            }
        }
        System.out.println("Customer not found.");
        return null;
    }

    public void listCustomers() {
        for (Customer customer : customers) {
            System.out.println("Name: " + customer.getName());
            System.out.println("Tax ID: " + customer.getTaxId());
            System.out.println("Balance: " + customer.getAccount().getBalance());
        }
    }
}
