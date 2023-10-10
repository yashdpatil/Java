import java.util.Scanner;

public class Person {
    String name;
    int age;
    char gender;

    Person() {

    }

    public Person(String name, int age, char gender) {

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

}

class Student extends Person {

    int studid;
    char grade;

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
        System.out.println("=============================================================================");

    }

}

class Teacher extends Person {
    int Employeeid;
    String subject;

    Teacher() {

    }

    Teacher(int Employeeid, String subject) {
        this.Employeeid = Employeeid;
        this.subject = subject;

    }

    void DisplayTeacherDetails() {
        System.out.println("Employeeid is     " + Employeeid);
        System.out.println("subject  is      " + subject);
        System.out.println("=============================================================================");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=============================================================================");
        System.out.println("Person INFO : ");
        Person p = new Person("SHIVNATH KUMAR", 30, 'M');
        p.Display();

        System.out.println("student INFO : ");
        Student s = new Student(1011, 'A');
        s.DisplayStudentDetails();

        System.out.println("TEACHER INFO: ");
        Teacher t = new Teacher(101, "CPP");
        t.DisplayTeacherDetails();

    }

}
