package Com.practice.corejava;

public class MultipleObjectExamples {
	public static void main(String[] args) {
		Dogs dog1 = new Dogs();
		dog1.name ="bart";
		Dogs[] myDogs = new Dogs[3];
		myDogs[0] = new Dogs();
		myDogs[1] = new Dogs();
		myDogs[2] = dog1;
		System.out.println(myDogs[2].name);
		
	}
}

class Dogs{
	String name ;
}
