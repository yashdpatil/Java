// class Singleton {
//     private int num1;
//     private int num2;

//     private Singleton() {
//         this.num1 = 10;
//         this.num2 = 20;
//     }

//     private static Singleton reference;

//     public static Singleton getReference() {
//         if (reference == null)
//             reference = new Singleton();
//         return reference;
//     }

//     public int getNum1() {
//         return this.num1;
//     }

//     public int getNum2() {
//         return this.num2;
//     }
// }

// class Program {
//     public static void main(String[] args) {
//         Singleton s1 = Singleton.getReference();
//         System.out.println(s1.hashCode());
//         Singleton s2 = Singleton.getReference();
//         System.out.println(s2.hashCode());
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
        System.out.println(s1.hashCode());
        Singleton s2 = Singleton.getReference();
        System.out.println(getNum1());
        System.out.println(s2.hashCode());
    }

}