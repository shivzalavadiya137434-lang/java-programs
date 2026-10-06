// Interface 1
interface Animal {
    void eat();
}

// Interface 2 extends Interface 1
interface Dog extends Animal {
    void bark();
}

// Class implementing the extended interface
class PetDog implements Dog {

    public void eat() {
        System.out.println("Dog is eating.");
    }

    public void bark() {
        System.out.println("Dog is barking.");
    }
}

// Main class
public class InterfaceExtend {
    public static void main(String[] args) {
        PetDog d = new PetDog();

        d.eat();
        d.bark();
    }
}