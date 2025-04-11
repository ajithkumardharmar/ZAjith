package durgasoft.oppsConcepts;

class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public void start() {
        System.out.println(type + " engine is starting...");
    }
}

class Car {
    private Engine engine;
    
    public Car(String engineType) {
    	//Engine object strongly associated with contatiner(parent) object 
        this.engine = new Engine(engineType); // Creating Engine inside Car
    }

    public void startCar() {
        engine.start();
        System.out.println("Car is running...");
    }
}

public class CompositionExample {
    public static void main(String[] args) {
        Car myCar = new Car("V8");
        myCar.startCar();
    }
}

