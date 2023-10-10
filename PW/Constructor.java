public class Constructor {
    int x, y;

    Constructor() {
        System.out.println("i am in constructor");

    }

    static int sum(int a, int b) {
        return (a + b);
    }

    public static void main(String[] args) {
        new Constructor();
        System.out.println(sum(40, 20));

    }

}
