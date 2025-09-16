Inheritance =
            "Inheritance in java is the process where one class accuries all   (extends) the properties and behaviors (fields and methods) of another class using extends key words "  

purpose/Advantageses  =
          1> code reusability 
          2>Maintainability and improve readability

Type of Inheritances in java
          1> Single Inheritance
          2> Multiple Inheritance
          3>Hierachical Inheritance

Syntax =
        class Parents
          {
             code-----
          }
        class Chield extends Parents
        {
            ---
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