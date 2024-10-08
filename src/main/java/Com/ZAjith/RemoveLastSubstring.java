package Com.ZAjith;

public class RemoveLastSubstring {
    public static void main(String[] args) {
        String input = "employeeinfoak_DUMMY$$secondlevelobjak2_parentinfo2$$secondlevelobjak_parentinfo";
        String substringToRemove = "$$";

        int lastIndex = input.lastIndexOf(substringToRemove);

        if (lastIndex != -1) {
            String output = input.substring(0, lastIndex) ;
            System.out.println("Input: " + input + "\nOutput: " + output);
        } else {
            System.out.println("Substring not found in the input string.");
        }
    }
}
