package oops;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class OverridingExample {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.sound();  // Calls Animal's version

        Animal myDog = new Dog();
        myDog.sound(); // Calls Dog's overridden version
    }
}
