
// Java Static Variable
class Student {
    int studentId;        // individual property
    String studentName;   // individual property
    static String collegeName = "ABC College"; // shared by all students

    // Constructor
    Student(int id, String name) {
        this.studentId = id;
        this.studentName = name;
    }

    // Display student details
    void display() {
        System.out.println("ID: " + studentId + ", Name: " + studentName + ", College: " + collegeName);
    }
}

public class StaticExample {
    public static void main(String[] args) {
        // Create multiple student objects
        Student s1 = new Student(101, "Vishal");
        Student s2 = new Student(102, "Rahul");
        Student s3 = new Student(103, "Sneha");

        // Display info
        s1.display();
        s2.display();
        s3.display();

        // If we change college name once → it changes for all students
        Student.collegeName = "XYZ University";

        System.out.println("\nAfter changing college name:\n");

        s1.display();
        s2.display();
        s3.display();
    }
}
