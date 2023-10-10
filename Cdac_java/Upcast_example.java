import java.util.Scanner;

public class Upcast_example {
    String name;
    int age;
    char gender;
    public int a = 5;

    Upcast_example() {

    }

    public Upcast_example(String name, int age, char gender) {

        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void Display() {
        System.out.println("Name is        " + this.name);
        System.out.println("Age is        " + this.age);
        System.out.println("Gender is      " + this.gender);
        System.out.println("=============================================================================");

    }

    void Message() {
        System.out.println("In SUper class");
    }

}

class Student extends Upcast_example {

    int studid;
    char grade;
    int a = 10;

    Student() {
        this(0, ' ');
    }

    Student(int studid, char grade) {
        this.studid = studid;
        this.grade = grade;

    }

    void DisplayStudentDetails() {
        System.out.println("this.studrntid is     " + studid);
        System.out.println("Grade is     " + grade);
        System.out.println(this.a);
        System.out.println(" " + super.a);

        System.out.println("=============================================================================");

    }

    void Message() {
        System.out.println("In Child  class");
    }

    public static void main(String[] args) {
        Student s = new Student(101, 'h');
        s.DisplayStudentDetails();

    }
}
