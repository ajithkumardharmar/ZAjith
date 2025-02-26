package comtest;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestAk {
    public static void main(String[] args) {
        // Simulate an InputStream for the JSON input
        String jsonInput = "{\"data\":\"key=IAfpk, age=58, key=Wdm, age=68, Key=ksndfn8n, age =47\"}";
        InputStream inputStream = new java.io.ByteArrayInputStream(jsonInput.getBytes());

        try {
            // Read the InputStream into a string
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder jsonBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                jsonBuilder.append(line);
            }
            String json = jsonBuilder.toString();

            // Extract the 'data' field from the JSON manually
            String data = json.replaceAll(".*\"data\":\"([^\"]+)\".*", "$1");

            // Regular expression to extract age values
            Pattern pattern = Pattern.compile("age\\s*=\\s*(\\d+)");
            Matcher matcher = pattern.matcher(data);

            int count = 0;

            // Iterate through all matches
            while (matcher.find()) {
                int age = Integer.parseInt(matcher.group(1)); // Get the age value
                if (age > 50) {
                    count++;
                }
            }

            // Output the result
            System.out.println("Number of items with age greater than 50: " + count);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

