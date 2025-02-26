package durgasoft.declarationandmodifiers;

public class NativeModifiersExample {
	static {
		System.loadLibrary("nativeLib");
	}
	public native void test();
}

class Client{
	public static void main(String[] args) {
		NativeModifiersExample n = new NativeModifiersExample();
		n.test();
	}
}
