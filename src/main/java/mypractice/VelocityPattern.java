package mypractice;

	import java.util.HashSet;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

	public class VelocityPattern {
		 public static void main(String[] args) {
        String content = """
                $pfm228401_488516.name
                $pfm228402s
                .pfm5_331068.userName
                $pfm999_123456.email
                .pfm6_1234s
                $!pfm228401_488516
                $!pfm228402s
                $!pfm123456
            """;

            // Corrected regex to capture only valid prefixes ($, . or $!)
            String regex = "(?:\\$!|\\$|\\.)pfm\\d+(?:_\\d+|s)?";
            VelocityPattern main = new VelocityPattern();
            HashSet<String> extractedValues = main.extractValues(content, regex);

            System.out.println("Extracted Values: " + extractedValues);
        }

        public HashSet<String> extractValues(String content, String regex) {
            HashSet<String> result = new HashSet<>();
            try {
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(content);

                // Collect all matches into the result set
                while (matcher.find()) {
                    result.add(matcher.group());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return result;
        }
        }

