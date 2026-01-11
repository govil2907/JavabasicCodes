package OOPS_;

/* Overriding in Java is a feature that allows a subclass to provide a specific implementation of a method that
is already defined in its superclass. It's a key aspect of polymorphism, enabling objects of different classes
to respond to the same method call in their unique ways.
 */

class Animal{
    public void makeSound(){
        System.out.println("Generic Animal Sound");
    }

    public void eatFood(){
        System.out.println("Eat Food");
    }
}

class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Woof");
    }
}

class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
public class Forest {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.makeSound();
        a2.makeSound();
        a1.eatFood();
    }

}
