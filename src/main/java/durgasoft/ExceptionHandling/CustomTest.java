package durgasoft.ExceptionHandling;

public class CustomTest {
	public static void main(String[] args) throws CustomizedExceptionExample {
		int age=17;
		if(age>18) {
			throw new CustomizedExceptionExample("under 18 age is not allowing");
		}
	}
}
