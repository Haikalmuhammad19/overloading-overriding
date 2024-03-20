class Animal {
    void sound() {
        System.out.println("Bunyi hewan...");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow...");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Woof...");
    }
}

public class AnimalTest {
    public static void main(String args[]) {
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();
        animal1.sound();
        animal2.sound();
    }
}
