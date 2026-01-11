package OOPS_;

/*
Overloading allows multiple methods within the same class to share the same name,
provided they have different parameter lists. This can be achieved by varying the number of parameters,
their data types, or both. Overloading is a form of compile-time polymorphism, also known as static polymorphism.
 */


public class Calculator {

    public static float add(float a, float b){
        return a+b;
    }
     public void add(int a, int b){
         System.out.println(a+b);
     }

     public void add(double a, double b){
        System.out.println(a+b);
    }

    public void add(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add(4,7);
        cal.add(3.2, 7.6);
        cal.add(4,8, 10);
        float sum = Calculator.add(2.0F, 3.0F);

    }
}
