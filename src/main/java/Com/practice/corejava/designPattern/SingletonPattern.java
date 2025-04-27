package Com.practice.corejava.designPattern;

class Singleton {
    private static Singleton instance;

    private Singleton() { }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}


public class SingletonPattern {
	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		
		Singleton s2 = Singleton.getInstance();
		
		if(s==s2) {
			System.out.println("Same object reference");
		}
	}
}
