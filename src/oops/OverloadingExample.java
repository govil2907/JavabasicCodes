package oops;

class Calculator {
    // Method with one int parameter
    int add(int a) {
        return a + 0;
    }

    // Method with two int parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with three int parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class OverloadingExample {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("add(5): " + calc.add(5));
        System.out.println("add(5, 10): " + calc.add(5, 10));
        System.out.println("add(5, 10, 15): " + calc.add(5, 10, 15));
    }
}
