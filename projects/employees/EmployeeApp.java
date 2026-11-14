import java.util.Scanner;

public class EmployeeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HumanResources hr = new HumanResources();

        int option = -1;
        while (option != 4) {
            System.out.println("Welcome to the boss's program");
            System.out.println("Enter the desired option: ");
            System.out.println("1 - Add employee");
            System.out.println("2 - Remove employee");
            System.out.println("3 - List employees");
            System.out.println("4 - Exit the program");

            try {
                option = scanner.nextInt();
                scanner.nextLine(); // clear the buffer
            } catch (Exception e) {
                System.out.println("Error: enter a valid value!");
                scanner.nextLine();
            }

            switch (option) {
                case 1:
                    System.out.println("Enter the employee's name");
                    String name = scanner.nextLine();
                    System.out.println("What is the employee's base salary");
                    double baseSalary = scanner.nextDouble();
                    System.out.println("What is the employee's role: 1 for standard, 2 for manager and 3 for salesperson");
                    int role = scanner.nextInt();

                    Employee newEmployee;
                    if (role == 1) {
                        System.out.println("Employee added successfully!");
                        newEmployee = new Employee(name, baseSalary);
                        hr.addEmployee(newEmployee);
                    }
                    if (role == 2) {
                        System.out.println("Manager added successfully!");
                        newEmployee = new Manager(name, baseSalary);
                        hr.addEmployee(newEmployee);
                    }
                    if (role == 3) {
                        System.out.println("Enter the number of sales:");
                        int salesCount = scanner.nextInt();

                        System.out.println("Enter the commission:");
                        double commission = scanner.nextDouble();
                        System.out.println("Salesperson added successfully!");

                        newEmployee = new Salesperson(name, salesCount, baseSalary, commission);
                        hr.addEmployee(newEmployee);
                    }
                    break;
                case 2:
                    System.out.println("Enter the employee's name: ");
                    String nameToRemove = scanner.nextLine();
                    Employee foundEmployee = hr.findByName(nameToRemove);

                    if (foundEmployee == null) {
                        System.out.println("No employee was found with that name");
                    } else {
                        hr.removeEmployee(foundEmployee);
                    }
                    break;
                case 3:
                    System.out.println("---Employees---");
                    hr.listEmployees();
                    break;
                case 4:
                    System.out.println("Thank you for using our employee app!");
                    break;
            }
        }
        scanner.close();
    }
}
