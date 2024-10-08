package Com.practice.leetcode;

public class ZigzagConversion {
    public String convert(String s, int numRows) {
        // Special case: If there's only one row, the zigzag is just the string itself
        if (numRows == 1) {
            return s;
        }

        // List to store each row in the zigzag pattern
        StringBuilder[] rows = new StringBuilder[Math.min(numRows, s.length())];
        for (int i = 0; i < rows.length; i++) {
            rows[i] = new StringBuilder();
        }

        // Variables to track the current row and direction (whether we are going down or up)
        int currentRow = 0;
        boolean goingDown = false;

        // Iterate through each character in the input string
        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);

            // Change direction when we reach the top or bottom row
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            // Move to the next row, either down or up based on direction
            currentRow += goingDown ? 1 : -1;
        }

        // Combine all rows into a single result string
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        ZigzagConversion solution = new ZigzagConversion();
        
        // Example 1
        String s1 = "PAYPALISHIRING";
        int numRows1 = 3;
        System.out.println(solution.convert(s1, numRows1)); // Output: "PAHNAPLSIIGYIR"
        
        // Example 2
        String s2 = "PAYPALISHIRING";
        int numRows2 = 4;
        System.out.println(solution.convert(s2, numRows2)); // Output: "PINALSIGYAHRPI"
        
        // Example 3
        String s3 = "A";
        int numRows3 = 1;
        System.out.println(solution.convert(s3, numRows3)); // Output: "A"
    }
}

