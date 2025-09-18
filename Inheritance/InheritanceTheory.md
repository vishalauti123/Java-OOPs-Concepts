# Inheritance in Java

## Definition
Inheritance in Java is the process where one class **acquires (extends)** the properties and behaviors (fields and methods) of another class using the **extends** keyword.

---

## Purpose / Advantages
1. **Code Reusability** – Avoids rewriting the same code again and again.  
2. **Maintainability** – Improves readability and makes the project easier to maintain.  

---

## Types of Inheritance in Java
1. **Single Inheritance** – One child class inherits from one parent class.  
2. **Multilevel Inheritance** – A class is derived from another derived class.  
3. **Hierarchical Inheritance** – Multiple child classes inherit from one parent class.  

⚠️ **Note**: Java does not support *multiple inheritance* with classes (to avoid ambiguity). But it can be achieved using **interfaces**.

---

## Syntax
```java
class Parent {
    // code...
}

class Child extends Parent {
    // code...
}

 Real-Life Example =
👉 "A child inherits characteristics from parents (like surname, habits). Similarly in Java, a class inherits properties from another class."       

Importance point =
 1> whya java not support Multiple Inhertance
 Ans - to avoid AMBIGUITY
 NOte -  "But Multiple Inheritance achiev througth interface

 2> Can constructors be inherited?
(Answer → No, constructors are not inherited but parent constructor is always called first.)

 3> How is multiple inheritance achieved in Java?
(Answer → Using interfaces.)

:

🔹 Difference between this and super

1> this → refers to the current class object.
2> super → refers to the parent class object.

1> this() → calls constructor of the same class.
2> super() → calls constructor of the parent class.