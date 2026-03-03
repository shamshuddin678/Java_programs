package Oops_concepts;
// Constructor 
class Student{
    String name;
    int age;

    public void display(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student() // Default constructor 
    {
        System.out.println("This is a constructor");
    }


    Student(String name, int age) // Parameterized constructor
    {
        this.name = name;
        this.age = age;
    }
}

public class Second {
    public static void main(String[] args) {
        Student s = new Student("shamshuddin",20); // Here Student() is constructor.
        s.display();
    }
}
