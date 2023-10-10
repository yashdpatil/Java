public class Constructorr {
    private int a;
    private int b;
    static int c;
    static {
        c = 0;
    }

    Constructorr() {
        this(80, 90);

        // System.out.println(c);
    }

    Constructorr(int a, int b) {
        this.a = a;
        this.b = b;
        c++;
        // this.c = c;
    }

    public String toString() {
        return " a" + a + " b " + b;
    }

    void Displ() {
        System.out.println(c);
    }

    public static void main(String[] args) {
        Constructorr c = new Constructorr();
        Constructorr anotherC = new Constructorr(30, 40);
        Constructorr c8 = new Constructorr(10, 20);
        Constructorr c3 = new Constructorr(10, 20);
        Constructorr c9 = new Constructorr(10, 20);

        c.Displ();

        System.out.println("c" + c);

    }

}
