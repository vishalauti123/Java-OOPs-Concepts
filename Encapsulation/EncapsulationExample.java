// Encapsulation Example in Java
class Student {
    // private data members
    private String name;
    private int age;

    // getter and setter methods
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Vishal");
        s.setAge(24);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
