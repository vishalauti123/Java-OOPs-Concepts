
# Abstraction in Java

## 🔹 Definition
Abstraction in Java is the process of **hiding implementation details** and **showing only essential information** to the user.  
It focuses on *what to do*, not *how to do*.

---

## 🔹 Achieved By
- **Abstract Class** (using `abstract` keyword)  
- **Interface**  

  
 ## Key Points =
              Abstract class can have abstract methods (without body) and normal methods.  
              An interface is 100% abstract (till Java 7).  
              Abstraction focuses on "what to do", not "how to do".  

  ## Real-life Example =
              When you drive a car, you only know how to use steering and pedals you don’t know the internal implementation of engine.

     ## 🔹 Syntax

```java
// Abstract class
abstract class Vehicle {
    abstract void start();  // abstract method (no body)
    
    void fuel() {
        System.out.println("Vehicle needs fuel");
    }
}

// Interface
interface Engine {
    void run();  // abstract method
}    