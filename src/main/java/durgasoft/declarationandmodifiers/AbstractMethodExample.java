package durgasoft.declarationandmodifiers;

public abstract class AbstractMethodExample {
	//we can define method without implementation and child class must implement abstract method
	public abstract int getNoOfWheels();
}


class Bus extends AbstractMethodExample{

	@Override
	public int getNoOfWheels() {
		// TODO Auto-generated method stub
		return 7;
	}
	
}

class Auto extends AbstractMethodExample{
	
	@Override
	public int getNoOfWheels() {
		// TODO Auto-generated method stub
		return 3;
	}
	
}
//abstract class can contain zero abstract method
abstract class Van{
	
}