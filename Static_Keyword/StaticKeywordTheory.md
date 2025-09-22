# Static Keyword in Java

## 🔹 Definition
The `static` keyword in Java is mainly used for **memory management**.  
It can be applied to **variables, methods, blocks, and nested classes**.  

When a member is declared `static`, it belongs to the **class itself** rather than to any object.  
This means **all objects share the same static member**.

---

## 🔹 Where static is used?

### 1. Static Variable
- Belongs to the class, not to objects.  
- Memory is allocated only once (when the class loads).  
- Used for **common properties** that are shared by all objects.  

💡 **Real-life Example:**  
- A school name is the same for all students → `static String schoolName`.  

---

### 2. Static Method
- Can be called without creating an object.  
- Can only access static variables directly.  
- Cannot use `this` or `super`.  

💡 **Real-life Example:**  
- Utility methods like `Math.max()` or `Math.sqrt()` are static.  

---

### 3. Static Block
- Executes only once when the class is first loaded into memory.  
- Often used for initializing static variables or resources.  

💡 **Real-life Example:**  
- Loading database drivers or application configuration at startup.  

---

### 4. Static Nested Class
- A class declared inside another class using `static`.  
- Does not need access to the outer class instance.  

💡 **Real-life Example:**  
- `Map.Entry` in Java Collections is a static nested class inside `Map`.  

---

## 🔹 Real-Life Analogy
Think about a **school**:  
- Every student has different **name** and **roll number**.  
- But **school name** is the same for all students.  

Instead of storing duplicate copies of the school name in every student object, we declare it **static** so that memory is used efficiently.  

---

## 🔹 Importance of static keyword in Real Projects
1. **Memory Efficiency**  
   - Shared values like *company name, school name, bank name* do not occupy memory multiple times.  

2. **Utility Functions**  
   - Many helper classes in Java (like `Math`, `Collections`) use static methods because they are independent of object state.  

3. **Configuration Initialization**  
   - Static blocks are useful for one-time setup like loading drivers, configuration files, or logging setup.  

---

## 🔹 Quick Recap
- `static` makes members belong to the class, not objects.  
- Saves memory and improves performance.  
- Widely used in real-world projects for **constants, utility methods, and configurations**.  
