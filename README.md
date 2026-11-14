# Java Journey

My path to becoming a software engineer, one Java project at a time. Each project is a small terminal application built to practice a specific set of concepts: object-oriented design, exception handling, collections and streams.

## Projects

| Project | What it does | Concepts |
|---|---|---|
| [`banking`](projects/banking) | Deposits, withdrawals and transfers between customers | Encapsulation, exceptions, collections |
| [`library`](projects/library) | Manage books, search by title, borrow and return | Inheritance, interfaces, polymorphism |
| [`inventory`](projects/inventory) | Add, edit, remove and list products with validation | Validation, collections, menu loops |
| [`employees`](projects/employees) | HR system with different salary rules per role | Inheritance, method overriding |
| [`petshop`](projects/petshop) | Register pets, vaccinate them, query with streams | Polymorphism, interfaces, Streams API |

## How to run

Requires JDK 17 or newer. From the repository root:

```
cd projects/banking
javac *.java
java BankApp
```

Each project's README lists its main class.

## Roadmap

- [ ] Use `BigDecimal` for money
- [ ] Separate business logic from the console UI
- [ ] Add unit tests with JUnit
- [ ] Persist data with SQL (JDBC)
- [ ] Build a REST API with Spring Boot
