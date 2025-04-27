package Com.practice.corejava.designPattern;

//File: DecoratorPatternTest.java

interface Car {
 void assemble();
}

class BasicCar implements Car {
 public void assemble() {
     System.out.print("Basic Car");
 }
}

class CarDecorator implements Car {
 protected Car car;

 public CarDecorator(Car car) {
     this.car = car;
 }

 public void assemble() {
     car.assemble();
 }
}

class SportsCar extends CarDecorator {
 public SportsCar(Car car) {
     super(car);
 }

 public void assemble() {
     super.assemble();
     System.out.print(" + Sports Car features");
 }
}

class LuxuryCar extends CarDecorator {
 public LuxuryCar(Car car) {
     super(car);
 }

 public void assemble() {
     super.assemble();
     System.out.print(" + Luxury Car features");
 }
}

public class DecoratorPatternTest {
 public static void main(String[] args) {
     Car sportsCar = new SportsCar(new BasicCar());
     sportsCar.assemble();  // Output: Basic Car + Sports Car features

     System.out.println();

     Car luxurySportsCar = new LuxuryCar(new SportsCar(new BasicCar()));
     luxurySportsCar.assemble();  // Output: Basic Car + Sports Car features + Luxury Car features
 }
}


