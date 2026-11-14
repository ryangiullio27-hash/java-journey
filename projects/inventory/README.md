# Inventory System

A console application to manage product stock: add, edit, remove and list products, with validation on price and quantity.

## Concepts practiced

- Encapsulation and validation in constructors and setters
- Collections (`ArrayList`)
- Menu loops and input handling with `Scanner`

## How to run

Requires JDK 17 or newer.

```
cd projects/inventory
javac *.java
java InventoryApp
```

Exit the program by entering `0` at the menu.

## Planned improvements

- [ ] Fix input handling so an invalid menu entry doesn't repeat the previous action
- [ ] Use `BigDecimal` for prices
- [ ] Show the total stock value (`calculateTotalValue()` already exists)
- [ ] Persist data in a database
