# Adapter Design Pattern

## Definition

Adapter Pattern is a Structural Design Pattern used to make incompatible interfaces work together.

It acts as a bridge or translator between two incompatible systems without modifying either side.

---

# Core Idea

Convert:

```text
one interface
```

into another compatible interface expected by the client.

---

# Main Problem Adapter Pattern Solves

Suppose your application expects:

```text
pay()
```

method.

But third-party payment gateway provides:

```text
makePayment()
```

method.

Both systems are incompatible.

Without Adapter Pattern:
- existing code must be modified
- tight coupling increases
- integration becomes messy

Adapter Pattern solves this compatibility problem.

---

# Real-world Analogy

Suppose:
- Indian charger
- US power socket

Direct connection impossible.

Need:
# Adapter

Adapter converts:
```text
one interface → another interface
```

without changing:
- charger
- socket

---

# Main Goal

Adapter Pattern solves:

> "How can incompatible interfaces work together?"

---

# Key Components

## 1. Target Interface

Interface expected by client system.

Example:
```text
PaymentProcessor
```

---

## 2. Adaptee

Existing incompatible class.

Example:
```text
StripeAPI
```

---

## 3. Adapter

Converts adaptee interface into target interface.

Example:
```text
StripeAdapter
```

---

## 4. Client

Uses target interface normally.

Example:
```text
PaymentService
```

---

# Flow of Adapter Pattern

```text
Client
   ↓
Target Interface
   ↓
Adapter
   ↓
Adaptee
```

---

# Why Adapter Pattern is Needed

Without Adapter Pattern:
- difficult third-party integration
- legacy system issues
- incompatible APIs
- repeated conversion logic
- tightly coupled code

Adapter Pattern provides:
- compatibility
- loose coupling
- clean integration
- scalability

---

# Types of Adapter Pattern

## 1. Class Adapter

Uses inheritance.

Less common in Java because Java does not support multiple class inheritance.

---

## 2. Object Adapter

Uses composition.

Most common and preferred approach in Java.

---

# Why Composition is Preferred

```text
composition > inheritance
```

because composition provides:
- flexibility
- loose coupling
- easier maintenance

---

# Advantages of Adapter Pattern

## 1. Makes Incompatible Systems Work Together

Main purpose of Adapter Pattern.

---

## 2. Improves Reusability

Existing classes can be reused without modification.

---

## 3. Better Scalability

New adapters can be added easily.

---

## 4. Loose Coupling

Client depends on abstraction.

---

## 5. Cleaner Integration

Third-party APIs remain isolated.

---

# Disadvantages of Adapter Pattern

## 1. Increased Number of Classes

Additional adapter classes required.

---

## 2. Extra Layer of Abstraction

Can slightly increase complexity.

---

## 3. Overkill for Small Systems

Simple systems may not require adapters.

---

# SOLID Principles Used

## Open Closed Principle (OCP)

New adapters can be added without modifying client code.

---

## Dependency Inversion Principle (DIP)

Client depends on abstraction instead of concrete implementation.

---

## Single Responsibility Principle (SRP)

Adapter only handles interface conversion.

---

# Adapter Pattern vs Decorator Pattern

Students commonly confuse these.

---

# Adapter Pattern

Goal:
```text
Compatibility
```

Makes incompatible interfaces work together.

---

# Decorator Pattern

Goal:
```text
Add functionality dynamically
```

without modifying original object.

---

# Adapter Pattern vs Facade Pattern

---

# Adapter Pattern

Converts one interface into another.

---

# Facade Pattern

Simplifies a complex subsystem behind one simple interface.

---

# Real-world Use Cases

## 1. Payment Gateway Integration
- Stripe
- Razorpay
- PayPal

---

## 2. Legacy System Integration

Old systems integrated with modern applications.

---

## 3. Logging Framework Migration

Converting old logger APIs into new interfaces.

---

## 4. Database Driver Wrappers

Different database APIs normalized.

---

## 5. External SDK Integration

Third-party SDK compatibility handling.

---

# Backend Relevance

Adapter Pattern is heavily used in backend systems because:
- external APIs rarely match internal architecture
- third-party services have different interfaces
- enterprise systems integrate legacy software frequently

---

# Important Interview Questions

## Why Adapter Pattern is needed?

To make incompatible interfaces work together.

---

## What problem does Adapter Pattern solve?

Compatibility problem between systems.

---

## Difference between Adapter and Decorator?

### Adapter
Changes interface.

### Decorator
Adds functionality.

---

## Difference between Adapter and Facade?

### Adapter
Converts interface.

### Facade
Simplifies subsystem.

---

## Why composition preferred in Adapter Pattern?

Because it provides better flexibility and loose coupling.

---

# Common Mistakes

## 1. Confusing Adapter with Decorator

Adapter changes interface.
Decorator adds behavior.

---

## 2. Modifying Existing Classes

Adapter should integrate systems without modifying them.

---

## 3. Overusing Adapter Pattern

Not every small mismatch needs an adapter.

---

# Best Interview Explanation

> Adapter Pattern is a Structural Design Pattern used to make incompatible interfaces work together. It acts as a bridge or translator between the client and an existing incompatible class without modifying either side. It is heavily used in backend systems for third-party API integration and legacy system compatibility.

---

# Quick Revision

- Adapter Pattern = compatibility pattern
- Converts incompatible interfaces
- Acts like translator/bridge
- Uses composition mostly
- Supports OCP + DIP + SRP
- Common in backend integrations
- Adapter = interface conversion
- Decorator = functionality addition
- Facade = subsystem simplification