// class Example {
//     private int num1 = 10;
//     private int num2 = 10;
//     private static Example ex;

//     private Example() {
//         this.num1 = 10;
//         this.num2 = 20;
//     }

//     static {
//         ex = new Example();
//     }

//     // public static Example getInstance() {
//     // return getReference();
//     // }

//     public static Example getReference() {
//         return ex;
//     }

//     public int getNum1() {
//         return this.num1;
//     }

//     public int getNum2() {
//         return this.num2;
//     }
// }

// class Static_single {
//     public static void main(String[] args) {
//         Example e = Example.getReference();
//         System.out.println(e.hashCode());
//         Example ee = Example.getReference();
//         System.out.println(ee.hashCode());
//         Example eee = Example.getReference();
//         System.out.println(eee.hashCode());
//     }

// }
class Singleton {
    private int num1;
    private int num2;
    private static Singleton reference;
    static {
        reference = new Singleton();
    }

    public static Singleton getReference() {
        return reference;
    }

    private Singleton() {
        this.num1 = 10;
        this.num2 = 20;
    }

    public int getNum1() {
        return this.num1;
    }

    public int getNum2() {
        return this.num2;
    }
}

class Program {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getReference();
        s1.getNum1();
        Singleton s2 = Singleton.getReference();
    }
}
