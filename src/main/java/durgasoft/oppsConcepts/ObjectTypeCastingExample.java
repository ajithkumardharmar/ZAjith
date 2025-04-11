package durgasoft.oppsConcepts;

public class ObjectTypeCastingExample {
	public static void main(String[] args) {
		Object o = new String("Ajith");
		StringBuffer sb = (StringBuffer)o;
		System.out.println(sb.toString());
	}
}
