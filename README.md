# s1-03-collections
🛠️ Java Collections Practice

---

## 📝 Description

This repository contains structured Java exercises focused on practicing Java Collections, especially `HashSet`, `ArrayList`, and sorting with custom comparators. Through the implementation of real-world examples such as managing restaurants, you'll improve your understanding of how to store, sort, and retrieve data efficiently using Java's Collection Framework.

---

## 🚀 Objectives

- Learn to use Java Collections like `HashSet`, `ArrayList`, and `List`.
- Implement custom sorting logic with the `Comparator` interface.
- Apply concepts of clean code, data encapsulation, and separation of concerns.
- Improve your understanding of data structures in practical applications.

---

## 📚 Exercise Overview

### Level 1
**Exercise 1 – Restaurant Model and Service**

- Create a `Restaurant` class with attributes: `name` (String) and `score` (int).
- Implement proper encapsulation and `toString()` method.
- Create a `RestaurantService` class to manage a `HashSet<Restaurant>`, simulating a data source.

### Level 2
**Exercise 2 – Sorting Restaurants**

- Implement a custom `RestaurantComparator` to sort by:
    - Name (ascending alphabetical order)
    - Score (descending numerical order if names match)
- Use `Collections.sort()` on an `ArrayList` derived from the `HashSet`.
- Display sorted results in a readable format using `StringBuilder`.

**Output example:**

