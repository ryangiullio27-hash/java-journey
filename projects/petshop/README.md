# Pet Shop

A console application to register pets, vaccinate them and run simple queries with the Streams API.

## Concepts practiced

- Inheritance (`Dog` and `Cat` extend `Animal`)
- Interfaces (`Vaccinable`)
- Polymorphism (`makeSound()` and `vaccinate()` differ per animal)
- Streams (`filter`, `map`, `forEach`)

## How to run

Requires JDK 17 or newer.

```
cd projects/petshop
javac *.java
java PetShopApp
```

## Planned improvements

- [ ] Tell the user when a pet to vaccinate isn't found
- [ ] Add more animal types
- [ ] Persist the pets to a file or database
