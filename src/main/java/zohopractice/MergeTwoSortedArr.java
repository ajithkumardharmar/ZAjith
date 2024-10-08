package zohopractice;

public class MergeTwoSortedArr {
	public static void main(String[] args) {
		int[] n = {1,3,5};
		int[] m = {2,4,6};
		int[] result =mergeTwoArr(n,m);
		System.out.println(" sorted arr : " );
		for(int i=0;i<result.length;i++) {
			System.out.print(" "+result[i]);
		}
	}
	public static int[] mergeTwoArr(int[] n,int[] m) {
		int[] r = new int[n.length+m.length];
		int nIdx =0;
		int mIdx =0;
		for(int i=0;i<r.length;i++){
			if(i%2==0) {
				r[i]=n[nIdx++];
			}else {
				r[i]=m[mIdx++];
			}
		}
		return r;
	}
}
