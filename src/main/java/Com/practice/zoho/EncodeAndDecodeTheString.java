package Com.practice.zoho;

public class EncodeAndDecodeTheString {
	public static void main(String[] args) {
		String n = "aaabbcddddd";
		encodeString(n);// output = a3b2c1d5
	}

	

	private static void encodeString(String n) {
		int count=1;
		StringBuilder s = new StringBuilder();
		for(int i=1;i<n.length();i++) {
			if(n.charAt(i)==n.charAt(i-1)) {
				count++;
			}else {
				s.append(n.charAt(i-1)).append(count);
				count =1;
			}
		}
		s.append(n.charAt(n.length()-1)).append(count);
		System.out.println(s.toString());
		
	}
}
