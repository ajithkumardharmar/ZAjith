package Com.dailycodebuffer.SOLID;

class CalculatorBad {
	public int calculate(String operation, int a, int b) {
		switch (operation) {
		case "add":
			return a + b;
		case "sub":
			return a - b;
		// If we want to add "mul", we must modify this class
		default:
			throw new IllegalArgumentException("Invalid operation");
		}
	}
}

public class OpenClosePrinciple {

//-------------------------------------------------------------------------------

	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		int result1 = calculator.compute(new Addition(), 10, 5); // Output: 15
		int result2 = calculator.compute(new Subtraction(), 10, 5); // Output: 5

		// Add new "Multiplication" class without changing Calculator
	}

}

//Step 1: Common interface
interface Operation {
	int apply(int a, int b);
}

// Step 2: Concrete implementations
class Addition implements Operation {
	public int apply(int a, int b) {
		return a + b;
	}
}

class Subtraction implements Operation {
	public int apply(int a, int b) {
		return a - b;
	}
}

// Step 3: Calculator uses abstraction
class Calculator {
	public int compute(Operation operation, int a, int b) {
		return operation.apply(a, b);
	}
}
