package Com.practice.corejava;

public class TestArrays {
	public static void main(String[] args) {
		String[] islands = new String[4];
		int y =0;
		islands[0] ="Bermuda";
		islands[1] ="fiji";
		islands[2] ="Azores";
		islands[3] ="Columes";
		int[] index = new int[4];
		index[0] = 1;
		index[1] = 3;
		index[2] = 0;
		index[3] = 2;
		int ref;
		while (y < 4) {
			 ref = index[y];
			 System.out.print("island = ");
			 System.out.println(islands[ref]);
			 y = y + 1;
		 }
	}
}
