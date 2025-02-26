package designer.practice;

public class Substring {
	public static void main(String[] args) {
		String name = "pfm_123_state_statelkp";

		System.out.print(name);name.substring(name.lastIndexOf("_")+1,name.length());
	}
}
