import java.util.Scanner;

public class Getter_setter {
    int a;
    int b;
    int c;

    private Getter_setter() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    void Settera(int a) {
        this.a = a;

    }

    void Setterb(int b) {
        this.b = b;

    }

    void Setterc(int c) {
        this.c = c;

    }

    int Geta() {
        return this.a;
    }

    int Getb() {
        return this.b;
    }

    int Getc() {
        return this.c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Getter_setter gs = new Getter_setter();
        gs.Settera(sc.nextInt());
        gs.Setterc(sc.nextInt());
        gs.Setterb(sc.nextInt());
        System.out.print(gs.Geta() + " ");

        System.out.print(gs.Getb() + " ");

        System.out.print(gs.Getc() + " ");

    }
}