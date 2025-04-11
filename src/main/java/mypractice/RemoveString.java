package mypractice;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class RemoveString {
	public static void main(String[] args) throws Throwable {
		String n="/u01/monthlypatch/BLDR_INSTALL_PATH/logs/appwiselogs";
		String m=n.substring(0,n.indexOf("/appwiselogs"));
		System.out.println(m);
		PrintWriter pr = new PrintWriter("as.txt");
		pr.print("Hello");
		System.out.println(10/0);
	}
}
