# Strategy Design Pattern

## Definition

Strategy Pattern is a Behavioral Design Pattern that defines a family of algorithms, encapsulates each algorithm separately, and makes them interchangeable at runtime.

Instead of placing multiple algorithms inside one large class using huge if-else chains, each algorithm is separated into its own strategy class.

---

# Core Idea

Encapsulate behaviors/algorithms separately and switch them dynamically at runtime.

---

# Main Problem Strategy Pattern Solves

Suppose a Ride Matching System supports:

- Nearest Driver Matching
- Highest Rated Driver Matching
- Cheapest Ride Matching
- VIP Priority Matching

Without Strategy Pattern:

```text
Huge if-else chains
inside RideService
```

Problems:
- difficult scalability
- tight coupling
- poor maintainability
- code duplication
- difficult testing

Strategy Pattern solves this problem.

---

# Real-world Analogy

Suppose you are traveling.

You can choose:
- Car
- Bike
- Train
- Flight

Your destination remains same.

Only:
```text
travel strategy changes
```

This interchangeable behavior concept is:
# Strategy Pattern

---

# Main Goal

Strategy Pattern solves:

> "Which algorithm/behavior should execute?"

at runtime.

---

# Key Components

## 1. Strategy Interface

Common abstraction for all algorithms.

Example:
```text
RideMatchingStrategy
```

---

## 2. Concrete Strategies

Actual algorithm implementations.

Examples:
- NearestDriverStrategy
- CheapestRideStrategy
- HighestRatedDriverStrategy

---

## 3. Context Class

Class that uses strategy dynamically.

Example:
```text
RideService
```

---

# Flow of Strategy Pattern

```text
Client
   ↓
Context Class
   ↓
Strategy Interface
   ↑
Different Strategy Implementations
```

---

# Why Strategy Pattern is Needed

Without Strategy Pattern:
- large conditional logic
- repeated code
- tightly coupled algorithms
- difficult feature additions

Strategy Pattern provides:
- runtime flexibility
- loose coupling
- cleaner architecture
- scalability

---

# Runtime Polymorphism Connection

Strategy Pattern heavily uses:
# Runtime Polymorphism

Example idea:

```text
RideMatchingStrategy strategy
```

can point to:
- NearestDriverStrategy
- CheapestRideStrategy
- HighestRatedDriverStrategy

at runtime.

---

# Advantages of Strategy Pattern

## 1. Removes Huge if-else Chains

Algorithms become separated cleanly.

---

## 2. Supports Runtime Behavior Switching

Behavior can change dynamically.

---

## 3. Better Scalability

New strategies can be added easily.

---

## 4. Loose Coupling

Context class depends on abstraction.

---

## 5. Better Maintainability

Each algorithm isolated in separate class.

---

## 6. Better Testing

Strategies can be tested independently.

---

# Disadvantages of Strategy Pattern

## 1. Increased Number of Classes

Each algorithm requires separate class.

---

## 2. Client Must Understand Strategies

Client sometimes needs awareness of available strategies.

---

## 3. Overkill for Small Logic

Simple applications may not require it.

---

# SOLID Principles Used

## Open Closed Principle (OCP)

New strategies can be added without modifying existing context class.

---

## Dependency Inversion Principle (DIP)

Context depends on strategy abstraction instead of concrete implementations.

---

## Single Responsibility Principle (SRP)

Each strategy handles only one algorithm.

---

# Strategy Pattern vs Factory Pattern

Students confuse these frequently.

---

# Factory Pattern

Focus:
```text
Object Creation
```

Question solved:
> Which object should be created?

---

# Strategy Pattern

Focus:
```text
Behavior Selection
```

Question solved:
> Which algorithm should execute?

---

# Strategy vs Builder

## Strategy

Changes:
```text
behavior/algorithm
```

---

## Builder

Changes:
```text
step-by-step object construction
```

---

# Real-world Use Cases

## 1. Ride Matching Systems
- nearest driver
- cheapest ride
- VIP priority

---

## 2. Payment Systems
- UPI
- Credit Card
- Wallet

---

## 3. Recommendation Systems
- trending
- genre-based
- AI recommendations

---

## 4. Sorting Algorithms
- merge sort
- quick sort
- heap sort

---

## 5. Authentication Systems
- OAuth
- JWT
- Biometric

---

## 6. Compression Systems
- ZIP
- RAR
- 7zip

---

# Important Interview Questions

## Why Strategy Pattern is needed?

To remove large conditional logic and support interchangeable algorithms.

---

## What problem does Strategy Pattern solve?

Dynamic behavior/algorithm selection at runtime.

---

## Why runtime polymorphism important here?

Because strategy reference can point to different implementations dynamically.

---

## Difference between Strategy and Factory?

### Factory
Creates objects.

### Strategy
Changes behavior dynamically.

---

## Why does Strategy Pattern improve scalability?

New algorithms can be added without modifying existing context class.

---

# Common Mistakes

## 1. Putting Logic Back Inside Context Class

Violates purpose of Strategy Pattern.

---

## 2. Too Many Tiny Strategies

Can increase unnecessary complexity.

---

## 3. Using Strategy for Simple Conditions

May become overengineering.

---

# Best Interview Explanation

> Strategy Pattern is a Behavioral Design Pattern that defines a family of algorithms, encapsulates each algorithm separately, and makes them interchangeable at runtime. It helps remove large conditional logic, improves scalability, supports runtime polymorphism, and follows SOLID principles like OCP and DIP.

---

# Quick Revision

- Strategy Pattern = interchangeable algorithms
- Encapsulates behaviors separately
- Supports runtime behavior switching
- Removes huge if-else chains
- Uses runtime polymorphism
- Uses OCP + DIP + SRP
- Context depends on abstraction
- Common in backend systems
- Strategy = behavior selection
- Factory = object creation