// Animal.java
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The Dog Barking.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The Cat quarrels.");
    }
}

class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The Cow Moo.");
    }
}

// Main.java
public class Test1 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        animal.makeSound();
        cat.makeSound();

        Dog dog = new Dog();
        dog.makeSound();

        Cow cow = new Cow();
        cow.makeSound();
    }
}
