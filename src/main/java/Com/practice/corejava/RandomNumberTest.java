package Com.practice.corejava;

import java.util.Random;

public class RandomNumberTest {
	public static void main(String[] args) { 
		Random randomNumber = new Random();
		String[] nameList = {"Ajith","Lington","vibin","muthu"};
		int length =randomNumber.nextInt(nameList.length);
		System.out.println(length);
		System.out.println(nameList[length]);
		Dog dog = new Dog();
		dog.size = 40;
	}
}

class Dog {
	int size ;
}

