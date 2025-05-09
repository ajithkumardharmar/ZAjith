package Com.practice.leetcode;

public class ExcelColumnTitle {
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        
        while (columnNumber > 0) {
            columnNumber--; // Adjust because A starts from 1, not 0
            int remainder = columnNumber % 26;
            char c = (char) ('A' + remainder);
            sb.append(c);
            columnNumber = columnNumber / 26;
        }
        
        return sb.reverse().toString(); // Since we build from last to first
    }

    public static void main(String[] args) {
//        System.out.println(convertToTitle(1));   // Output: A
//        System.out.println(convertToTitle(28));  // Output: AB
//        System.out.println(convertToTitle(701)); // Output: ZY
        
        System.out.println(convertToNumber("A"));
        System.out.println(convertToNumber("AB"));
        System.out.println(convertToNumber("ZY"));
    }
    
    public static int convertToNumber(String columnTitle) {
    	int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            char c = columnTitle.charAt(i);
            int value = c - 'A' + 1; // 'A' → 1, 'B' → 2, ..., 'Z' → 26
            result = result * 26 + value;
        }
        return result;
    }
}

