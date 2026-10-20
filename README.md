# Java Data Structures, Algorithms, and Object-Oriented Design

### Modular Implementations of Foundational Data Structures, Graph Algorithms, and Core OOP Paradigms

[![Java](https://img.shields.io/badge/Java-SE_17%2F21-ED8B00?style=flat-square&logo=openjdk&logoColor=white)](https://openjdk.org)
[![Build](https://img.shields.io/badge/Build-javac-007396?style=flat-square)](https://oracle.com/java)
[![Paradigms](https://img.shields.io/badge/Paradigms-OOP_%7C_DSA-5382A1?style=flat-square)](https://oracle.com/java)
[![License](https://img.shields.io/badge/License-MIT-blue?style=flat-square)](LICENSE)

[Repository Scope](#repository-scope) | [Data Structures Catalog](#data-structures-catalog) | [Algorithms & Array Routines](#algorithms--array-routines) | [Object-Oriented Architecture](#object-oriented-architecture) | [Compilation & Execution](#compilation--execution)

---

## Repository Scope

This repository provides clean, dependency-free Java implementations of core computer science fundamentals. The codebase serves as a reference catalog covering fundamental linear and non-linear data structures, recursive divide-and-conquer routines, graph traversal paradigms, and clean object-oriented design patterns (encapsulation, polymorphism, abstraction, and custom exception handling).

---

## Data Structures Catalog

| Category | Source File | Structure & Mechanics | Time Complexity (Average) |
| :--- | :--- | :--- | :--- |
| **Singly Linked List** | `LinkedListDemo.java`, `insertinonlinkedlist.java` | Dynamic node allocation with forward traversal pointers | Access: O(n), Insert/Delete: O(1) at head |
| **Doubly Linked List** | `doublyLL.java` | Bidirectional node links supporting reverse scans | Access: O(n), Insert/Delete: O(1) with pointer |
| **Circular Linked List** | `circullarlinkedlist.java` | Ring topology where tail points back to root | Access: O(n), Traversal: Continuous cycle |
| **Stack** | `stackdemo.java` | LIFO (Last-In-First-Out) pointer architecture | Push/Pop: O(1) |
| **Heap** | `heap.java` | Binary heap array tree with bubble-up / bubble-down | Insert: O(log n), Extract-Min/Max: O(log n) |
| **Graph (Adjacency List)**| `graphsdemo.java`, `graphadjlist.java` | Vertex-indexed array of dynamic edge lists | Traversal (DFS/BFS): O(V + E) |
| **2D Matrix / Grid** | `twodarray.java`, `sunofmatrix.java` | Row-major memory layout and multidimensional scans | Cell Access: O(1), Full Scan: O(R x C) |

---

## Algorithms & Array Routines

| Routine | File | Description | Complexity |
| :--- | :--- | :--- | :--- |
| **Graph Traversal (DFS)** | `graphsdemo.java` | Recursive depth-first graph traversal using boolean visited tracking | O(V + E) |
| **In-Place Sorting** | `sorting.java`, `sortingarray.java` | Element comparison and positional swaps across arrays | O(n^2) - O(n log n) |
| **Move Zeroes** | `movezeros.java`, `movezero.java` | Two-pointer partitioning shifting zero elements to the tail | O(n) Time, O(1) Space |
| **Sliding Window K-Sum** | `maxsumofkthterm.java` | Maximum subsegment sum across fixed window size `k` | O(n) Time, O(1) Space |
| **Linked List Search** | `nthnodefromend.java` | Two-pointer offset technique to find the nth node from tail | O(n) Time, O(1) Space |
| **Recursion Mechanics** | `recursion.java` | Call stack frame execution and base-case termination | O(n) Call Stack |
| **Matrix Row/Col Sums** | `sumofallrows.java`, `sumofallcolums.java` | Vectorized row and column accumulator scans | O(R x C) |

---

## Object-Oriented Architecture

The repository illustrates core Java object-oriented principles through modular classes:

- **Abstraction (`abstraction.java`):** Demonstrates abstract base classes with abstract method contracts, enforcing structural compliance across concrete extensions.
- **Encapsulation (`Encapsulation.java`):** Illustrates private state isolation, constructor invariants, and controlled mutation via getter/setter interfaces.
- **Polymorphism (`polymorphism.java`):** Implements dynamic method dispatch (runtime polymorphism) across hierarchical inheritance chains.
- **Method Overloading (`overloading.java`):** Compares compile-time polymorphism via distinct method signatures (argument arity and parameter typing).
- **Interface Contracts (`MyInterface.java`):** Decouples behavioral definitions from execution logic using Java interfaces.
- **Exception Flow (`finallyblock.java`, `throwsdemo.java`):** Explores structured exception handling, method throws propagation, and deterministic resource teardown in `finally` blocks.

---

## Compilation & Execution

### Prerequisites

- Java SE Development Kit (JDK 17 or higher)

### Compiling and Running Individual Routines

All programs are structured as standalone runnable classes with dedicated `main` entrypoints:

```bash
# Compile graph traversal routine
javac graphsdemo.java

# Execute DFS traversal
java graphsdemo
```

```bash
# Compile and test array algorithms
javac movezeros.java
java movezeros
```

```bash
# Compile and test OOP polymorphism demo
javac polymorphism.java
java polymorphism
```

---

## License

Distributed under the MIT License. See `LICENSE` for details.
