
// // // // // import java.util.Scanner;

// // // // // class Upcast_example {

// // // // //     public void Message() {
// // // // //         System.out.println("In SUper class");
// // // // //     }

// // // // // }

// // // // // class Student extends Upcast_example {
// // // // //     @Override

// // // // //     public void Message() {
// // // // //         System.out.println("In Child  class");
// // // // //     }
// // // // // }

// // // // // public class Main {
// // // // //     public static void main(String[] args) {
// // // // //         Upcast_example up = new Student();
// // // // //         up.Message();
// // // // //     }
// // // // // }
// // // // class Person {
// // // //     public void printRecord() {
// // // //         System.out.println("Person.printRecord");
// // // //     }
// // // // }

// // // // class Employee extends Person {
// // // //     @Override
// // // //     public void printRecord() {
// // // //         System.out.println("Emp.printRecord");
// // // //     }
// // // // }

// // // // class Main {
// // // //     public static void main(String[] args) {
// // // //         Person p = new Employee(); // Upcasting
// // // //         p.printRecord(); // Dynamic method dispatch
// // // //     }
// // // // }

// // // // // class Upcast_example {
// // // // // public void Message() {
// // // // // System.out.println("In Superclass");
// // // // // }
// // // // // }

// // // // // class Student extends Upcast_example {
// // // // // @Override
// // // // // public void Message() {
// // // // // System.out.println("In Child class");
// // // // // }
// // // // // }

// // // // // public class Main {
// // // // // public static void main(String[] args) {
// // // // // Upcast_example upcasted = new Student(); // Upcasting Student to
// // // // // Upcast_example
// // // // // upcasted.Message(); // Calls the Message method from the superclass
// // // // // }
// // // // // }

// // // class Mumbai {
// // //     void Dispaly() {
// // //         System.out.println("hello ");
// // //     }

// // // }

// // // class Jhuhu extends Mumbai {
// // //     @Override
// // //     void Dispaly() {
// // //         System.out.println("BYE ");
// // //     }

// // // }

// // // /**
// // //  * Main
// // //  */
// // // public class Main {
// // //     public static void main(String[] args) {

// // //         Mumbai m = new Jhuhu();

// // //         m.Dispaly();
// // //     }

// // // }
// // // class personja {
// // //     public void printRecord() {
// // //         System.out.println(" Person.printrecord");
// // //     }
// // // }

// // // class Emp extends personja {
// // //     @Override
// // //     public void printRecord() {
// // //         System.out.println(" Per.printrecord");
// // //     }
// // // }

// // // class Main {
// // //     public static void main(String[] args) {
// // //         personja p = new Emp();
// // //         p.printRecord();

// // //     }
// // // // }
// class A {
//     public void print(double a) {
//         System.out.println("A.a.");
//     }
// }

// class B extends A {
//     public void print(int a) {
//         System.out.println("b.a.");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         A a = new B();
//         a.print(10.5);
//     }

// }
class A {
    public void print(double number) {
        System.out.println("A.print");
    }
}

class B extends A {
    public void print(float number) {
        System.out.println("B.print");
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new B(); // Upcasting
        a.print(10.5);
        a.print(5f);
    }
}

class Bank {
    int Get_int() {
        return 0;
    }
}

class Sbi extends Bank {
    int Get_int() {
        return 8;
    }
}

class IcIC extends Bank {
    int Get_int() {
        return 9;
    }
}

class Axis extends Bank {
    int Get_int() {
        return 10;
    }
}

class Main {
    public static void main(String[] args) {
        Bank b = new Axis();
        Bank b1 = new Sbi();
        Bank b2 = new IcIC();
        System.out.println(b.Get_int());
        System.out.println(b1.Get_int());
        System.out.println(b2.Get_int());
    }

}