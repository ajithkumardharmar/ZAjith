package Com.practice.Jun2025;

public class ReverseString {
	public static void main(String[] args) {
		
		String name ="Ajitkumar";
		long start = System.nanoTime();
		String result = "";
		for(int i=name.length()-1;i>=0;i--) {
			result += name.charAt(i);
		}
		System.out.println(result);
		long end = System.nanoTime();

		// Duration in nanoseconds
		long duration = end - start;
		System.out.println("Execution Time: " + duration + " ns");
		performanceBasedApproch(name);
	}

	private static void performanceBasedApproch(String name) {
		long start = System.nanoTime();
		char[] nameChar = name.toCharArray();
		String result = "";
		for(int i=nameChar.length-1;i>=0;i--) {
			result+=nameChar[i];
		}
		System.out.println(result);
		 long end = System.nanoTime();

	        // Duration in nanoseconds
	        long duration = end - start;
	        System.out.println("Execution Time: " + duration + " ns");
		
	}
}
