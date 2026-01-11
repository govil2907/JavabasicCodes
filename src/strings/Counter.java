package strings;

    public class Counter {

        static int staticCount = 0;  // Static variable
        int instanceCount = 0;       // Instance variable

        public void increment() {
            staticCount++;
            instanceCount++;
        }

        public void display() {
            System.out.println("Static count: " + staticCount + ", Instance count: " + instanceCount);
        }

        public static void main(String[] args) {
            Counter c1 = new Counter();
            Counter c2 = new Counter();

            c1.increment();
            c1.display();  // ?

            c2.increment();
            c2.display();  // ?

            c1.display();  // ?
        }
    }

