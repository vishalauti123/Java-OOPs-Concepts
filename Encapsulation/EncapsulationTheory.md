# 🔒 Encapsulation in Java

## 📘 Definition
Encapsulation in Java is the process of **wrapping data (variables) and methods into a single unit (class)**.  
It also restricts **direct access** to some fields and provides control using **getter and setter methods**.  
This is also called **Data Hiding**.

---

## ✅ Advantages / Purpose
1. **Data Hiding** → Protects data from unauthorized access.  
2. **Improved Security** → Only controlled access is allowed.  
3. **Code Reusability** → Classes can be reused easily.  
4. **Flexibility & Maintainability** → Internal changes do not affect external code.  

---

## 📝 Syntax
```java
class ClassName {
    private datatype variable;

    // getter
    public datatype getVariable() {
        return variable;
    }

    // setter
    public void setVariable(datatype variable) {
        this.variable = variable;
    }
}

🌍 Real-Life Examples

ATM Machine → User presses buttons and sees balance, but actual code/logic is hidden.

Car → Driver can accelerate or brake, but internal engine working is hidden.

⭐ Important Points

Achieved by making variables private and providing public getter/setter.

Helps in loose coupling between objects.

One of the 4 OOP principles (Encapsulation, Inheritance, Polymorphism, Abstraction).

Provides validation inside setters to control values.