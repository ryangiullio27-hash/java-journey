# Banking System

A console application that simulates basic banking operations. Built to practice object-oriented design, exception handling and collections in Java.

## Features

- Register a customer with name, tax ID (CPF) and initial balance
- Deposit and withdraw, with amount validation
- Check balance and customer details
- Transfer money between customers, looking up the recipient by tax ID
- List all registered customers

## Concepts practiced

- Classes and encapsulation (`Account`, `Customer`, `Bank`)
- Exception handling (`IllegalArgumentException`, `InputMismatchException`)
- Collections (`ArrayList`)
- User input validation with `Scanner`

## How to run

Requires JDK 17 or newer.

```
cd projects/banking
javac *.java
java BankApp
```

Two sample customers are preloaded so you can try transfers right away:

| Name  | Tax ID      |
|-------|-------------|
| Maria | 12345678900 |
| John  | 98765432100 |

## Planned improvements

- [ ] Replace `double` with `BigDecimal` for money
- [ ] Separate business logic from the menu/UI
- [ ] Let the user operate on any registered account, not only the one created at startup
- [ ] Persist data in a database (SQLite/PostgreSQL)
- [ ] Unit tests with JUnit
