import java.util.InputMismatchException;
import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the customer's name:");
        String name = scanner.nextLine();

        System.out.println("Enter the initial balance:");
        double initialBalance = 0;
        Bank bank = new Bank();

        // Sample customers so transfers can be tested right away
        Account mariaAccount = new Account("Maria", 0);
        Customer maria = new Customer("Maria", "12345678900", mariaAccount);
        Account johnAccount = new Account("John", 0);
        Customer john = new Customer("John", "98765432100", johnAccount);
        bank.addCustomer(john);
        bank.addCustomer(maria);

        while (true) {
            try {
                initialBalance = scanner.nextDouble();
                if (initialBalance < 0) {
                    throw new IllegalArgumentException("Initial balance cannot be negative.");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Enter a valid number for the initial balance.");
                scanner.nextLine(); // clear the scanner buffer
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        Account account1 = new Account(name, initialBalance);

        System.out.println("Enter the customer's tax ID (CPF):");
        String taxId = scanner.next();

        Customer customer1 = new Customer(name, taxId, account1);
        bank.addCustomer(customer1);
        int mainOption = 0;

        while (mainOption != 6) {
            try {
                System.out.println("Choose an option to start:");
                System.out.println("1 - Deposit");
                System.out.println("2 - Withdraw");
                System.out.println("3 - Check balance");
                System.out.println("4 - View customer details");
                System.out.println("5 - Transfer");
                System.out.println("6 - Exit");
                System.out.println("7 - List customers");
                System.out.println("Enter the desired option:");
                mainOption = scanner.nextInt();

                switch (mainOption) {
                    case 1:
                        System.out.println("Enter the amount to deposit:");
                        double depositAmount = scanner.nextDouble();
                        account1.deposit(depositAmount);
                        System.out.println("Deposit successful!");
                        System.out.println("Current balance: " + account1.getBalance());
                        break;
                    case 2:
                        System.out.println("Enter the amount to withdraw:");
                        double withdrawAmount = scanner.nextDouble();
                        account1.withdraw(withdrawAmount);
                        System.out.println("Withdrawal successful!");
                        System.out.println("Current balance: " + account1.getBalance());
                        break;
                    case 3:
                        System.out.println("Current balance: " + account1.getBalance());
                        break;
                    case 4:
                        System.out.println("Customer details");
                        System.out.println("Name: " + customer1.getName());
                        System.out.println("Tax ID: " + customer1.getTaxId());
                        System.out.println("Balance: " + customer1.getAccount().getBalance());
                        break;
                    case 5:
                        System.out.println("Transfer");
                        System.out.println("Enter the recipient's tax ID:");
                        String recipientTaxId = scanner.next();
                        Customer recipient = bank.findCustomerByTaxId(recipientTaxId);

                        if (recipient == null) {
                            System.out.println("Recipient not found.");
                            break;
                        }
                        System.out.println("Enter the amount to transfer:");
                        double transferAmount = scanner.nextDouble();
                        account1.transfer(recipient.getAccount(), transferAmount);
                        System.out.println("Transfer successful!");
                        System.out.println("Current balance: " + account1.getBalance());
                        System.out.println("Recipient: " + recipient.getName());
                        System.out.println("Recipient balance: " + recipient.getAccount().getBalance());
                        break;
                    case 6:
                        System.out.println("Exiting the application...");
                        break;
                    case 7:
                        System.out.println("Customer list:");
                        bank.listCustomers();
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Enter numbers only");
                scanner.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}
