package Com.practice.corejava;
@FunctionalInterface
interface Addition{
	int add(int a);
	
}

@FunctionalInterface
interface Subraction{
	int sub(int a,int b);
}

public class LamdaExample  {
	public static void main(String[] args) {
		Addition a1 = (a)->(a+10);
		System.out.println(a1.add( 5));
		Subraction s1 = (p,q)->(p-q);
		System.out.println(s1.sub(8, 2));
	}
}
