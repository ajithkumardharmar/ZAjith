package Com.practice.corejava.designPattern;

class Animal2 {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog2 extends Animal2 {
    void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat2 extends Animal2 {
    void makeSound() {
        System.out.println("Meow!");
    }
}

class AnimalFactory2 {
    public Animal2 createAnimal(String type) {
        if (type.equalsIgnoreCase("dog")) {
            return new Dog2();
        } else if (type.equalsIgnoreCase("cat")) {
            return new Cat2();
        }
        return null;
    }
}

public class FactoryPatternWithConcreteClass {
    public static void main(String[] args) {
        AnimalFactory2 factory = new AnimalFactory2();
        
        Animal2 animal = factory.createAnimal("dog");
        animal.makeSound();
        
        animal = factory.createAnimal("cat");
        animal.makeSound();
    }
}

