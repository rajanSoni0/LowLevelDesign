# Factory Design Pattern

## Definition

Factory Pattern is a Creational Design Pattern that centralizes object creation logic and hides object creation details from the client.

Instead of creating objects directly using the `new` keyword everywhere, the client requests objects from a factory class.

---

# Core Idea

Client says:

> "Give me the required object"

Factory decides:
- which object to create
- how to create it
- when to create it

---

# Why Factory Pattern is Needed

Without Factory Pattern:
- object creation logic becomes scattered
- tight coupling increases
- large if-else chains appear
- scalability becomes difficult
- maintenance becomes harder

Factory Pattern solves this by centralizing object creation.

---

# Real-world Analogy

Suppose you order coffee at a cafe.

You simply request:
- Cappuccino
- Latte
- Espresso

You do NOT:
- prepare ingredients
- boil milk
- create coffee manually

The kitchen handles creation internally.

Kitchen acts as:
# Factory

---

# Main Goal

Factory Pattern solves:

> "Which object should be created?"

without exposing creation logic to the client.

---

# Key Components

## 1. Product Interface
Common abstraction shared by all products.

---

## 2. Concrete Products
Actual implementations.

Examples:
- EmailNotification
- SMSNotification
- PushNotification

---

## 3. Factory Class
Responsible for creating objects.

---

## 4. Client
Uses factory instead of directly creating objects.

---

# Flow of Factory Pattern

```text
Client
   ↓
Factory
   ↓
Creates Required Object
   ↓
Returns Abstraction
```

---

# Problems Without Factory Pattern

## 1. Tight Coupling

Client directly depends on concrete classes.

---

## 2. Repeated Object Creation Logic

Object creation logic gets duplicated.

---

## 3. Difficult Scalability

Adding new object types requires modifying multiple places.

---

## 4. Large if-else Chains

Code becomes messy and difficult to maintain.

---

# Advantages of Factory Pattern

## 1. Loose Coupling

Client depends on abstraction instead of concrete implementation.

---

## 2. Centralized Object Creation

All creation logic exists in one place.

---

## 3. Better Scalability

New object types can be added easily.

---

## 4. Cleaner Code

Removes repeated object creation logic.

---

## 5. Better Maintainability

Changes related to object creation happen only in factory.

---

# Disadvantages of Factory Pattern

## 1. Increased Number of Classes

More abstraction may increase file count.

---

## 2. Factory Class Can Become Large

Too many object types may make factory complicated.

---

## 3. Unnecessary for Small Applications

Sometimes simple object creation is enough.

---

# SOLID Principles Used

## Open Closed Principle (OCP)

New object types can be added without modifying client logic heavily.

---

## Dependency Inversion Principle (DIP)

Client depends on abstraction rather than concrete implementation.

---

# Real-world Use Cases

## 1. Notification Systems
- Email
- SMS
- Push Notifications

---

## 2. Payment Systems
- UPI
- Credit Card
- PayPal

---

## 3. Database Drivers
- MySQL
- PostgreSQL
- MongoDB

---

## 4. UI Frameworks
- Windows Button
- Mac Button

---

## 5. Game Development
Character and object creation.

---

# Factory Pattern vs Strategy Pattern

## Factory Pattern

Focus:
```text
Object Creation
```

Question solved:
> Which object should be created?

---

## Strategy Pattern

Focus:
```text
Behavior Selection
```

Question solved:
> Which algorithm/behavior should be used?

---

# Important Interview Questions

## Why Factory Pattern?

To centralize object creation and reduce tight coupling.

---

## Which SOLID principles are used?

- OCP
- DIP

---

## What problem does Factory Pattern solve?

Scattered object creation and tight coupling.

---

## Difference between Factory and Abstract Factory?

### Factory
Creates objects.

### Abstract Factory
Creates factories themselves.

---

## Why should client use abstraction?

To improve flexibility and scalability.

---

# Common Mistakes

## 1. Returning Concrete Types

Factory should return abstraction.

---

## 2. Huge Factory Classes

Too many responsibilities inside one factory.

---

## 3. Using Factory Everywhere

Small applications may not require it.

---

# Best Interview Explanation

> Factory Pattern is a Creational Design Pattern that centralizes object creation logic and hides implementation details from the client. Instead of directly creating objects using the new keyword everywhere, clients request objects from a factory class. This improves loose coupling, maintainability, scalability, and supports SOLID principles like OCP and DIP.

---

# Quick Revision

- Factory Pattern = centralized object creation
- Client depends on abstraction
- Factory decides which object to create
- Improves loose coupling
- Supports scalability
- Uses OCP + DIP
- Common in backend systems