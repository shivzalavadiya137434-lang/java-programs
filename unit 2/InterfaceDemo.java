// Interface declaration
interface Animal {
    void sound();   // Abstract method
}

// Class implementing the interface
class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Another class implementing the interface
class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class InterfaceDemo {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound();
        a2.sound();
    }
}
