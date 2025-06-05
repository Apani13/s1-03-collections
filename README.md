# s1-03-collections
🛠️ Java Collections Practice

---

## 📝 Description

This repository contains structured Java exercises focused on practicing Java Collections, especially `HashSet`, `ArrayList`, iteration, and sorting with custom comparators. Through the implementation of real-world examples such as handling month names and managing restaurant data, you'll improve your understanding of how to store, organize, and retrieve data efficiently using Java's Collection Framework.

---

## 🚀 Objectives

- Learn to use Java Collections like `ArrayList`, `HashSet`, and `List`.
- Understand how insertion order and uniqueness work in different collection types.
- Iterate over collections using `for` loops and `Iterator`.
- Implement custom sorting logic with the `Comparator` interface.
- Apply concepts of clean code, encapsulation, and separation of concerns.
- Strengthen understanding of data structures in practical applications.

---

## 📚 Exercise Overview

### Level 1
**Exercise 1 – Month List and HashSet**

- Create a class named `Month` with a `name` attribute (String) that stores the name of a month.
- Add 11 `Month` objects to an `ArrayList`, each with a unique name — **excluding "Agost"**.
- Insert the missing month "Agost" (August) in its correct chronological position (after "Juliol").
- Display the `ArrayList` to confirm that the order is correct.
- Convert the `ArrayList` into a `HashSet` and ensure no duplicate months are allowed.
- Traverse the collection using both a `for` loop and an `Iterator`.

---

### Level 2
**Exercise 1 – Restaurant Model and Service**

- Create a `Restaurant` class with two attributes: `name` (String) and `score` (int).
- Implement proper encapsulation (private fields, getters/setters) and override `toString()` for display.
- Create a `RestaurantService` class that maintains a `HashSet<Restaurant>` as its data source.
- Allow adding restaurants, listing them, and applying sorting logic later.

---

**Exercise 2 – Sorting Restaurants**

- Implement a `RestaurantComparator` class to sort:
  - First by `name` in **ascending alphabetical order**.
  - If the names are the same, by `score` in **descending numeric order**.
- Convert the `HashSet` from the service to an `ArrayList`.
- Use `Collections.sort()` with the comparator to sort the list.
- Use a `StringBuilder` to format and print the sorted restaurant list.

---

## ⚙️ Technologies Used

- Java
- IntelliJ IDEA
- GitHub

---

## 📋 Requirements

- Java JDK 17 or higher
- Git for version control
- IntelliJ IDEA

---

## 🛠️ Installation

```bash
git clone https://github.com/Apani13/s1-03-collections.git
```

Open the project in IntelliJ IDEA or Eclipse.

Make sure Java 17+ is selected as the SDK.

---

## ▶️ Execution

Navigate to the `Main` class or to any class with a `main()` method.

Run it through the IDE or via terminal:

```bash
java Main
```

💡 Make sure the correct class has the `public static void main(String[] args)` entry point.

---

## 🤝 Contributions

Fork the repository.

Create a new branch:

```bash
git checkout -b feature/MyFeature
```

Commit your changes:

```bash
git commit -m "Add MyFeature"
```

Push to your fork:

```bash
git push origin feature/MyFeature
```

Submit a pull request.

---

## ✅ Author Notes

These collection-focused exercises are essential for mastering Java's data structure capabilities.
Whether you're dealing with unique sets, maintaining order, or applying custom sorting, this module is designed to help you build professional-level confidence with Java Collections.

Happy coding! 🚀



