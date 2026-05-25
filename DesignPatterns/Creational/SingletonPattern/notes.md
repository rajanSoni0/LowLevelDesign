# Singleton Pattern

## Definition
Ensures only one object of a class exists
and provides global access to it.

---

## Why Needed?
Used when shared resource should have
single centralized object.

Examples:
- Logger
- Database Connection Manager
- Configuration Manager
- Cache Manager

---

## Core Requirements
1. Private constructor
2. Static instance variable
3. Public global access method

---

## Types of Singleton

### 1. Eager Loading
- Object created immediately
- Thread-safe
- Memory waste possible

### 2. Lazy Loading
- Object created only when needed
- Memory efficient
- NOT thread-safe

### 3. Thread-safe Singleton
- Uses synchronized keyword
- Safe in multithreading
- Slower due to locking

### 4. Double Checked Locking
- Optimized thread-safe singleton
- Reduces unnecessary synchronization

### 5. Bill Pugh Singleton
- Uses inner static helper class
- Lazy + thread-safe
- Best modern Java approach

---

## Advantages
- Controlled object creation
- Memory efficient
- Global access point
- Useful for shared resources

---

## Disadvantages
- Global state problem
- Difficult unit testing
- Tight coupling
- Multithreading complexity

---

## Real-world Use Cases
- Spring Beans
- Logging Frameworks
- DB Connection Pools
- Config Managers

---

## Thread Safety Issue
Multiple threads may create multiple objects
simultaneously in lazy loading.

---

## synchronized Keyword
Allows only one thread to enter method/block
at a time.

---

## Most Important Interview Points
- Difference between eager and lazy loading
- Why constructor is private
- Why thread safety needed
- Double checked locking
- Bill Pugh singleton
- Spring singleton scope

---

## Best Interview Answer
Bill Pugh Singleton is generally preferred
because it provides lazy initialization
and thread safety without synchronization overhead.