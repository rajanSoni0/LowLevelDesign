# Producer Consumer Problem using wait() and notify()

# What is Producer Consumer Problem?

Producer Consumer is a classic synchronization problem in multithreading.

There are two types of threads:

* Producer → produces data/items
* Consumer → consumes data/items

Both share a common resource called:

```text
Buffer
```

---

# Real Life Example

```text
Chef prepares food  -> Producer
Waiter serves food -> Consumer
Dining Table       -> Buffer
```

---

# Main Problem

## Scenario 1

Producer is faster.

Buffer becomes full.

Producer must wait.

---

## Scenario 2

Consumer is faster.

Buffer becomes empty.

Consumer must wait.

---

# Goal

We need proper synchronization between threads.

---

# Why wait() and notify()?

Without them:

Consumer may continuously check:

```java
while(buffer empty) {
}
```

This wastes CPU.

Called:

```text
Busy Waiting
```

Bad approach.

---

# Better Approach

Instead of continuously checking:

```text
Put thread into waiting state
until another thread notifies it
```

This is done using:

* wait()
* notify()

---

# Important Rule

wait() and notify() belong to:

```java
Object class
```

NOT Thread class.

---

# Project Structure

```text
producerconsumerdemo/
│
├── Main.java
│
├── buffer/
│   └── Buffer.java
│
├── producer/
│   └── Producer.java
│
└── consumer/
    └── Consumer.java
```

---

# Buffer Class

Buffer is shared resource between producer and consumer.

```java
private int data;
private boolean available = false;
```

---

# Meaning of available

| Value | Meaning              |
| ----- | -------------------- |
| false | Buffer empty         |
| true  | Buffer contains item |

---

# Producer Flow

```text
Check if buffer full
        |
If full -> wait()
        |
Else produce item
        |
notify consumer
```

---

# Consumer Flow

```text
Check if buffer empty
        |
If empty -> wait()
        |
Else consume item
        |
notify producer
```

---

# Understanding wait()

```java
wait();
```

Meaning:

```text
Current thread goes into waiting state
and releases monitor lock
```

---

# VERY IMPORTANT

When thread calls wait():

```text
1. Thread sleeps
2. Lock gets released
```

Why release lock?

Otherwise:
other thread could never enter synchronized method.

Deadlock would occur.

---

# Understanding notify()

```java
notify();
```

Meaning:

```text
Wake up one waiting thread
```

---

# Flow Example

Suppose consumer starts first.

Buffer empty.

Consumer executes:

```java
wait();
```

Consumer sleeps.

---

Producer produces item:

```java
data = value;
available = true;
```

Then:

```java
notify();
```

Consumer wakes up and consumes item.

---

# Why synchronized Needed?

wait() and notify() require thread to own monitor lock.

Therefore methods must be synchronized.

Example:

```java
public synchronized void produce()
```

---

# What is Monitor Lock?

Every Java object has internal monitor lock.

synchronized uses this lock.

Only one thread can hold lock at a time.

---

# Why while Loop Instead of if?

Correct:

```java
while(!available) {
    wait();
}
```

Wrong:

```java
if(!available) {
    wait();
}
```

---

# Why?

Because after waking up:
condition must be checked again.

This protects against:

```text
Spurious Wakeups
```

---

# Sequence Diagram

```text
Producer Thread
       |
       | produce item
       v

Buffer
       |
       | notify()
       v

Consumer Thread wakes up
       |
       | consume item
       v

notify producer
```

---

# Key Concepts Learned

| Concept       | Meaning                                 |
| ------------- | --------------------------------------- |
| wait()        | Thread sleeps and releases lock         |
| notify()      | Wakes one waiting thread                |
| synchronized  | Only one thread enters critical section |
| Shared Buffer | Common resource                         |
| Producer      | Creates data                            |
| Consumer      | Uses data                               |

---

# Important Interview Questions

## Q1. Why wait() inside synchronized block?

Because thread must own monitor lock before calling wait().

Otherwise:

```text
IllegalMonitorStateException
```

---

## Q2. Difference between sleep() and wait()?

| sleep()               | wait()                              |
| --------------------- | ----------------------------------- |
| From Thread class     | From Object class                   |
| Does NOT release lock | Releases lock                       |
| Used for delay        | Used for inter-thread communication |

---

## Q3. Why use while instead of if?

To recheck condition after wake-up.

---

## Q4. What does notify() do?

Wakes one waiting thread.

---

## Q5. Difference between notify() and notifyAll()?

| notify()         | notifyAll()               |
| ---------------- | ------------------------- |
| Wakes one thread | Wakes all waiting threads |

---

# Real World Usage

Producer Consumer pattern is used in:

* Kafka
* RabbitMQ
* Message Queues
* Order Processing
* Logging Systems
* Background Task Systems

---

# Golden Understanding

```text
Producer creates data

Consumer consumes data

wait() pauses thread safely

notify() wakes waiting thread

synchronized protects shared resource
```
