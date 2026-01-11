package oops;

class Print {
    void show(int a) {
        System.out.println("int: " + a);
    }

    void show(double a) {
        System.out.println("double: " + a);
    }
}

public class OverloadTest {
    public static void main(String[] args) {
        Print p = new Print();
        p.show(5);
        p.show(5.5);
    }
}
