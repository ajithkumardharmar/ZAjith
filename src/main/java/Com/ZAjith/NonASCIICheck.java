package Com.ZAjith;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class NonASCIICheck {
	public static void main(String[] args) {
        String b = "you’re done";
        String a = "you're done";
        String c ="Š";
        if (containsNonAscii(b)) {
            System.out.println("String contains non-ASCII characters");
        } else {
            System.out.println("String does not contain non-ASCII characters");
        }
        if (containsNonAscii(a)) {
            System.out.println("String contains non-ASCII characters");
        } else {
            System.out.println("String does not contain non-ASCII characters");
        }
        if (containsNonAscii(c)) {
            System.out.println("String contains non-ASCII characters");
        } else {
            System.out.println("String does not contain non-ASCII characters");
        }
    }

    private static boolean containsNonAscii(String s) {
        return s.matches(".*[^\\x00-\\x7F].*");
    }

}
