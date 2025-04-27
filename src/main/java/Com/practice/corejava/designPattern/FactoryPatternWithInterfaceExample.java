package Com.practice.corejava.designPattern;


interface Animals {
    void makeSound();
}

class Dogs implements Animals {
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cats implements Animals {
    public void makeSound() {
        System.out.println("Meow!");
    }
}

interface AnimalFactorys {
    Animals createAnimal();
}

class DogFactorys implements AnimalFactorys {
    public Animals createAnimal() {
        return new Dogs();
    }
}

class CatFactorys implements AnimalFactorys {
    public Animals createAnimal() {
        return new Cats();
    }
}

public class FactoryPatternWithInterfaceExample {
    public static void main(String[] args) {
        AnimalFactorys factory = new DogFactorys();
        Animals animal = factory.createAnimal();
        animal.makeSound();
        
        factory = new CatFactorys();
        animal = factory.createAnimal();
        animal.makeSound();
    }
}
