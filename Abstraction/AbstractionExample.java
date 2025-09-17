abstract class Shape 
{
    abstrat void drow(); // abstract method no body

    void message(); // normal method
    {
        System.out.println("Drawing shape ");
    }
}
// Concrete class
class Circle extends Shape
{
    void drow()
    {
        System.out.println("Drawing Circle");
    }
}
  //second Concrete class
class Rectangle extends Shape
{
    void drow()
    {
        System.out.println("Drawing Rectangle");    
    }
}
// main class 
class AbstractionExample
{
    publis static void main(String args[])
    {
        Shape s1 = new Circle();   // Abstraction in action
        Shape s2 = new Rectangle();

        s1.message();
        s1.drow();

        s2.message();
        s2.drow();
    }
}