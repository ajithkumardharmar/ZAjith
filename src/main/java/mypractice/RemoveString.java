package mypractice;

public class RemoveString {
	public static void main(String[] args) {
		String n="/u01/monthlypatch/BLDR_INSTALL_PATH/logs/appwiselogs";
		String m=n.substring(0,n.indexOf("/appwiselogs"));
		System.out.println(m);
		
	}
}
