# Builder Design Pattern

## Definition

Builder Pattern is a Creational Design Pattern used to construct complex objects step-by-step.

Instead of creating objects using huge constructors with many parameters, Builder Pattern provides a cleaner and more readable way to create objects.

---

# Core Idea

Separate:
- object construction
from
- object representation

Object is built gradually using small configurable steps.

---

# Main Problem Builder Pattern Solves

## Telescoping Constructor Problem

Suppose a User object has:

- id
- name
- email
- age
- address
- phone
- country
- company
- gender

Creating object using constructor becomes:

```text
new User(
    id,
    name,
    email,
    age,
    address,
    phone,
    country,
    company,
    gender
)
```

Problems:
- difficult to read
- difficult to remember parameter order
- optional fields become messy
- constructor overloading explosion

Builder Pattern solves this problem.

---

# Real-world Analogy

Suppose you order a custom burger.

You choose:
- bread
- cheese
- sauce
- vegetables
- patty

step-by-step.

Restaurant assembles final burger.

This step-by-step construction process is:
# Builder Pattern

---

# Main Goal

Builder Pattern solves:

> "How to create complex objects step-by-step?"

---

# Key Components

## 1. Product

Actual object being created.

Example:
- User
- Car
- House

---

## 2. Builder

Responsible for step-by-step object construction.

Example:
- UserBuilder

---

## 3. Build Method

Creates and returns final object.

---

# Flow of Builder Pattern

```text
Client
   ↓
Builder
   ↓
Step-by-step configuration
   ↓
build()
   ↓
Final Object
```

---

# Why Builder Pattern is Needed

Without Builder Pattern:
- huge constructors
- poor readability
- optional parameter problems
- constructor overloading
- maintenance difficulties

Builder Pattern provides:
- readability
- flexibility
- maintainability

---

# Advantages of Builder Pattern

## 1. Improves Readability

Object creation becomes very clean.

---

## 2. Handles Optional Parameters Easily

No constructor explosion required.

---

## 3. Step-by-step Construction

Object created gradually.

---

## 4. Better Maintainability

Adding fields becomes easier.

---

## 5. Supports Immutable Objects

Very useful in backend systems.

---

## 6. Method Chaining

Provides fluent API style.

Example idea:

```text
builder
   .setName()
   .setEmail()
   .setAge()
```

---

# Disadvantages of Builder Pattern

## 1. More Classes

Extra builder class required.

---

## 2. Slightly More Boilerplate

More setup code compared to simple constructors.

---

## 3. Overkill for Small Objects

Simple objects may not require builder.

---

# Method Chaining

Builder Pattern heavily uses:
# Method Chaining

Each setter method:
- sets value
- returns current builder object

This allows chaining multiple calls together.

---

# Why build() Method is Important

`build()` finalizes object creation.

Without build():
- object construction remains incomplete.

---

# Builder vs Constructor

## Constructor

- fixed parameter order
- poor readability
- difficult optional fields handling

---

## Builder

- readable
- flexible
- configurable
- cleaner object creation

---

# Builder Pattern vs Factory Pattern

Students confuse these frequently.

---

# Factory Pattern

Focus:
```text
Which object should be created?
```

---

# Builder Pattern

Focus:
```text
How to create complex object step-by-step?
```

---

# Factory vs Builder Intuition

## Factory

```text
Give me a car.
```

---

## Builder

```text
Build custom car:
- red color
- sports engine
- leather seats
- sunroof
```

---

# SOLID Principles Used

## Single Responsibility Principle (SRP)

Builder handles construction separately from product class.

---

## Open Closed Principle (OCP)

New fields/features can be added easily.

---

# Real-world Use Cases

## 1. DTO Objects

Large backend DTOs with many optional fields.

---

## 2. HTTP Request Builders

Common in APIs.

---

## 3. Configuration Objects

Very common in Spring Boot.

---

## 4. Query Builders

Database query construction.

---

## 5. Immutable Objects

Builder helps create immutable objects cleanly.

---

# Lombok Connection

Very important for Java interviews.

Lombok annotation:

```text
@Builder
```

automatically generates Builder Pattern internally.

Frequently asked in backend interviews.

---

# Spring Boot Connection

Builder Pattern commonly used in:
- DTOs
- Configurations
- API Requests
- Response Objects

---

# Important Interview Questions

## Why Builder Pattern is needed?

To solve telescoping constructor problem and improve readability.

---

## What problem does Builder Pattern solve?

Complex object creation with many optional parameters.

---

## Why method chaining is used?

To create fluent and readable APIs.

---

## Why build() method is needed?

To finalize object creation.

---

## Difference between Builder and Factory?

### Factory
Focuses on object selection.

### Builder
Focuses on step-by-step object construction.

---

## Why Builder Pattern useful for immutable objects?

Object can be fully configured before creation and then made immutable.

---

# Common Mistakes

## 1. Using Builder for Very Small Objects

Unnecessary complexity.

---

## 2. Forgetting Validation

Builder should validate required fields when needed.

---

## 3. Too Many Responsibilities in Builder

Builder should only focus on construction.

---

# Best Interview Explanation

> Builder Pattern is a Creational Design Pattern used to construct complex objects step-by-step. It improves readability, handles optional parameters cleanly, avoids telescoping constructors, and is commonly used in Java backend systems for DTOs, configurations, immutable objects, and API request construction.

---

# Quick Revision

- Builder Pattern = step-by-step object creation
- Solves telescoping constructor problem
- Improves readability
- Supports optional parameters
- Uses method chaining
- Uses build() method
- Common in backend systems
- Lombok @Builder uses Builder Pattern internally
- Builder = construction
- Factory = object selection