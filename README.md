# ⭐ Java Pattern Programs

A collection of Java programs to learn and practice **pattern printing** using loops.

This repository contains Java pattern programs that help build a strong understanding of nested loops, rows, columns, spaces, stars, numbers, and pattern logic.

---

## 📚 Table of Contents

- [What is Pattern Printing?](#-what-is-pattern-printing)
- [Why Practice Patterns?](#-why-practice-patterns)
- [Patterns in This Repository](#-patterns-in-this-repository)
- [How Pattern Programs Work](#-how-pattern-programs-work)
- [Basic Pattern Example](#-basic-pattern-example)
- [Nested Loops](#-nested-loops)
- [Common Pattern Concepts](#-common-pattern-concepts)
- [Learning Progress](#-learning-progress)
- [Technologies Used](#-technologies-used)
- [Learning Goals](#-learning-goals)
- [Future Topics](#-future-topics)
- [Author](#-author)

---

## 🧠 What is Pattern Printing?

Pattern printing is a common programming exercise used to practice **loops and logical thinking**.

Patterns can be created using:

- `*`
- Numbers
- Characters
- Spaces
- Combinations of different elements

### Example

```text
*
**
***
****
*****
```

The number of stars increases as the row number increases.

---

## 🤔 Why Practice Patterns?

Pattern problems are useful for learning:

- `for` loops
- Nested loops
- Rows and columns
- Spaces
- Conditional statements
- Increment and decrement logic
- Problem-solving
- Logical thinking

Pattern problems are especially useful when learning Java programming basics.

---

## 📂 Patterns in This Repository

The repository currently contains the following Java pattern programs:

| File | Description |
|---|---|
| `pattern1.java` | Pattern program 1 |
| `pattern2.java` | Pattern program 2 |
| `pattern3.java` | Pattern program 3 |
| `pattern4.java` | Pattern program 4 |
| `pattern5.java` | Pattern program 5 |
| `pattern6.java` | Pattern program 6 |
| `pattern7.java` | Pattern program 7 |
| `pattern8.java` | Pattern program 8 |

These programs are part of my practice with different pattern-printing techniques in Java.

---

## ⚙️ How Pattern Programs Work

Most pattern programs use two or more loops.

A common structure is:

```java
for (int row = 1; row <= n; row++) {

    for (int col = 1; col <= n; col++) {

        System.out.print("* ");
    }

    System.out.println();
}
```

The outer loop controls the **rows**.

The inner loop controls the **columns** or elements printed in each row.

---

## 💻 Basic Pattern Example

### Square Pattern

```text
*****
*****
*****
*****
*****
```

Java:

```java
public class Pattern {

    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
```

---

## 🔺 Increasing Triangle

Example:

```text
*
**
***
****
*****
```

The number of elements increases by one in every row.

Java:

```java
int n = 5;

for (int row = 1; row <= n; row++) {

    for (int col = 1; col <= row; col++) {
        System.out.print("*");
    }

    System.out.println();
}
```

---

## 🔻 Decreasing Triangle

Example:

```text
*****
****
***
**
*
```

Java:

```java
int n = 5;

for (int row = 1; row <= n; row++) {

    for (int col = 1; col <= n - row + 1; col++) {
        System.out.print("*");
    }

    System.out.println();
}
```

---

## 🔢 Number Pattern

Patterns can also be created using numbers.

Example:

```text
1
12
123
1234
12345
```

Java:

```java
int n = 5;

for (int row = 1; row <= n; row++) {

    for (int col = 1; col <= row; col++) {
        System.out.print(col);
    }

    System.out.println();
}
```

---

## 🔄 Nested Loops

Nested loops are one of the most important concepts in pattern printing.

A nested loop means placing one loop inside another loop.

Example:

```java
for (int row = 1; row <= 5; row++) {

    for (int col = 1; col <= 5; col++) {

        System.out.print("*");
    }

    System.out.println();
}
```

Here:

- The outer loop controls the rows.
- The inner loop controls the columns.
- `println()` moves the output to the next row.

---

## 🧩 Common Pattern Concepts

### 1. Rows

The outer loop usually represents the number of rows.

```java
for (int row = 1; row <= n; row++)
```

### 2. Columns

The inner loop usually controls the number of elements printed in each row.

```java
for (int col = 1; col <= n; col++)
```

### 3. Spaces

Spaces can be used to create centered patterns.

```text
    *
   ***
  *****
 *******
```

### 4. Stars

Stars are commonly used for basic pattern exercises.

```text
*
**
***
****
```

### 5. Numbers

Numbers can be printed using the row or column value.

```text
1
22
333
4444
```

### 6. Conditions

`if` statements can be used to decide whether to print a star, number, or space.

```java
if (condition) {
    System.out.print("*");
} else {
    System.out.print(" ");
}
```

---

## 🔄 Pattern Building Process

```text
Understand the Pattern
        ↓
Count the Rows
        ↓
Identify Columns
        ↓
Identify Spaces
        ↓
Identify Stars / Numbers
        ↓
Create Outer Loop
        ↓
Create Inner Loop
        ↓
Add Conditions if Required
        ↓
Print the Pattern
```

---

## 🧠 How to Solve a New Pattern

When solving a pattern problem, follow these steps:

### Step 1: Count the Rows

First determine how many rows the pattern has.

### Step 2: Identify What Changes

Check whether the number of:

- Stars
- Numbers
- Spaces
- Characters

changes from row to row.

### Step 3: Create the Outer Loop

The outer loop usually represents the rows.

### Step 4: Create the Inner Loop

The inner loop controls what is printed inside each row.

### Step 5: Add Conditions

Use conditions when different elements need to be printed depending on their position.

### Step 6: Test With a Small Value

Try the program with:

```text
n = 3
```

Then increase the value after the logic works.

---

## 📈 Learning Progress

```text
Basic Loops
     ↓
Nested Loops
     ↓
Simple Star Patterns
     ↓
Number Patterns
     ↓
Increasing Patterns
     ↓
Decreasing Patterns
     ↓
Centered Patterns
     ↓
Complex Patterns
```

---

## 🛠️ Technologies Used

- ☕ Java
- 💻 IntelliJ IDEA
- 🔧 Git
- 🐙 GitHub

---

## 🎯 Learning Goals

This repository helps me practice:

- Understanding loops
- Understanding nested loops
- Working with rows and columns
- Printing stars
- Printing numbers
- Printing spaces
- Using conditions
- Building patterns step by step
- Improving logical thinking
- Improving problem-solving skills in Java

---

## 🚀 Future Topics

More Java and Data Structures & Algorithms topics will be added as I continue learning.

Planned topics include:

- Arrays
- Searching Algorithms
- Sorting Algorithms
- Recursion
- Strings
- Linked Lists
- Stacks
- Queues
- Trees
- Heaps
- Hashing
- Graphs
- Dynamic Programming

---

## 👨‍💻 Author

**Betha Hemanth**

This repository is part of my journey to learn **Java and Data Structures & Algorithms**.

---

⭐ If you find this repository useful, feel free to explore the pattern programs and follow my learning journey.
