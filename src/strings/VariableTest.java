package strings;

public class VariableTest {
    // Static variable (shared across all instances)
    static int count = 0;

    // Instance variable (unique for each object)
    int id;

    // Constructor
    public VariableTest() {
        count++;       // Increments the static variable
        id = count;    // Assigns the incremented count to the instance variable
    }

    public void display() {
        // Local variable
        String message = "User ID is: ";
        System.out.println(message + id);
    }

    public static void main(String[] args) {
        VariableTest t1 = new VariableTest();
        t1.display();

        VariableTest t2 = new VariableTest();
        t2.display();

        VariableTest t3 = new VariableTest();
        t3.display();

        System.out.println("Total users created: " + count);
    }
}
