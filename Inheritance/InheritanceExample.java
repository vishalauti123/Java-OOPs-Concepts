class Animals  // Parent class
{
    void eat()
    {
        System.out.println("Animals can eat");
    }
}

class Dog extends Animals // Chiled class
{
    void Bark()
    {
        System.out.println("Dog Barks");
    }
}

class InheritanceExample 
{
    public static void main(String args[])
    {
        Dog d = new Dog();
        d.eat();
        d.Bark();
    }
}

