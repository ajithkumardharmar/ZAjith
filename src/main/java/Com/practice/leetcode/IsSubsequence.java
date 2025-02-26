package Com.practice.leetcode;

public class IsSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isSubsequence("abc","ahdblmc"));
		System.out.println(isSubsequence("axc","ahbgdc"));
	}
	public static boolean isSubsequence(String s, String t) {
        int i=0;
        int len = s.length();
        for(int j=0;j<t.length();j++){
            if(s.charAt(i)==t.charAt(j)){
                    i+=1;
            }
        }        
        return i==len; 
    }
}
