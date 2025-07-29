package Com.practice.July2025;

public class StringWordReverse {
	 public static void main(String[] args) {
		String input =" hello   world ";
		
		String[] inpArr=input.trim().split("\\s+");
		String output = "";
		for(int i=inpArr.length-1;i>=0;i--) {
			output+=inpArr[i]+" ";
		}
		System.out.println(output.trim());
	}
}
