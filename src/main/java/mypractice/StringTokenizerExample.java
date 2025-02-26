package mypractice;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String text = "Java$$is$$fun";
        StringTokenizer tokenizer = new StringTokenizer(text,"$$"); // Default delimiter: space

        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken()); // Prints each token
        }
    }
}

