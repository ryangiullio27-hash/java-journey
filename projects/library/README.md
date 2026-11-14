# Library System

A console application to manage a small library: add physical or digital books, search by title, borrow and return them.

## Concepts practiced

- Inheritance (`PhysicalBook` and `DigitalBook` extend `Book`)
- Interfaces (`Searchable`)
- Polymorphism (`displayInfo()` behaves differently per book type)
- Collections and simple search

## How to run

Requires JDK 17 or newer.

```
cd projects/library
javac *.java
java LibraryApp
```

## Planned improvements

- [ ] Store the publication year as an `int`
- [ ] Prevent duplicate titles
- [ ] Persist the catalog to a file or database
- [ ] Unit tests with JUnit
