# Employee Management

A console HR application where each role has its own salary rule:

| Role | Salary |
|---|---|
| Employee | base salary |
| Manager | base salary + 20% |
| Salesperson | base salary + (sales × commission) |

## Concepts practiced

- Inheritance (`Manager` and `Salesperson` extend `Employee`)
- Method overriding (`calculateSalary()`)
- Polymorphism: the HR class works with `Employee` and each role calculates its own pay

## How to run

Requires JDK 17 or newer.

```
cd projects/employees
javac *.java
java EmployeeApp
```

## Planned improvements

- [ ] Use `BigDecimal` for salaries
- [ ] Handle invalid input in the "add employee" flow
- [ ] Unit tests for each salary rule
