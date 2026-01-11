package strings;

public class LocalVariableTest {
    public void demo() {
        int localVar = 5;
        System.out.println("Local variable inside method: " + localVar);
    }

    public static void main(String[] args) {
        LocalVariableTest obj = new LocalVariableTest();
        obj.demo();    }
}
