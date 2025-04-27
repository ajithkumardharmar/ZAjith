package Com.practice.corejava.designPattern;

abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow!");
    }
}

abstract class AnimalFactory {
    abstract Animal createAnimal();
}

class DogFactory extends AnimalFactory {
    Animal createAnimal() {
        return new Dog();
    }
}

class CatFactory extends AnimalFactory {
    Animal createAnimal() {
        return new Cat();
    }
}

public class FactoryPatternWithAbstractClass {
    public static void main(String[] args) {
        AnimalFactory factory = new DogFactory();
        Animal animal = factory.createAnimal();
        animal.makeSound();
        
        factory = new CatFactory();
        animal = factory.createAnimal();
        animal.makeSound();
    }
}

