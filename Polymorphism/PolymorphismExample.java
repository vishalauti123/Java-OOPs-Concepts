// Polymorphism in Java
// Two types: Compile-time (Method Overloading) and Runtime (Method Overriding)

class Calculator {
    // Compile-time Polymorphism → Method Overloading
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Animal {
    void sound() {
        System.out.println("Animals make sounds");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class PolymorphismExaple {
    public static void main(String[] args) {
        // Compile-time Polymorphism
        Calculator calc = new Calculator();
        System.out.println("Addition of 2 numbers: " + calc.add(10, 20));
        System.out.println("Addition of 3 numbers: " + calc.add(10, 20, 30));

        // Runtime Polymorphism
        Animal a;
        a = new Dog(); // Reference variable of Animal → Object of Dog
        a.sound();

        a = new Cat(); // Reference variable of Animal → Object of Cat
        a.sound();
    }
}
