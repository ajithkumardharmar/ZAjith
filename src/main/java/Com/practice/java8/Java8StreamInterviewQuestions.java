package Com.practice.java8;


import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class Java8StreamInterviewQuestions {
	
	public static void main(String[] args) {
//		String[] names = {"Ajith","Kumar","Ravi","Siva","Ajith","Ram","Kani","Siva"};
//		countElementOccurrences(names);
    }

    // 1. Count each element's occurrence in a string array
    public static Map<String, Long> countElementOccurrences(String[] arr) {
        return Arrays.stream(arr)
                     .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    // 2. Find duplicate elements in a list
    public static Set<Integer> findDuplicates(List<Integer> list) {
        return list.stream()
                   .filter(i -> Collections.frequency(list, i) > 1)
                   .collect(Collectors.toSet());
    }

    // 3. Find first non-repeated character in a string
    public static Optional<Character> firstNonRepeatedChar(String input) {
        Map<Character, Long> charCount = input.chars()
                                              .mapToObj(c -> (char) c)
                                              .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        return charCount.entrySet().stream()
                        .filter(e -> e.getValue() == 1)
                        .map(Map.Entry::getKey)
                        .findFirst();
    }

    // 4. Sort list of strings by length
    public static List<String> sortByLength(List<String> list) {
        return list.stream()
                   .sorted(Comparator.comparingInt(String::length))
                   .collect(Collectors.toList());
    }

    // 5. Find max and min in a list
    public static Optional<Integer> findMax(List<Integer> list) {
        return list.stream().max(Integer::compare);
    }

    public static Optional<Integer> findMin(List<Integer> list) {
        return list.stream().min(Integer::compare);
    }

    // 6. Reverse a string
    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    // 7. Convert list of strings to uppercase
    public static List<String> toUpperCase(List<String> list) {
        return list.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

    // 8. Join strings with delimiter
    public static String joinWithComma(List<String> list) {
        return list.stream().collect(Collectors.joining(", "));
    }

    // 9. Sum of all digits in a number
    public static int sumDigits(int number) {
        return String.valueOf(number).chars().map(Character::getNumericValue).sum();
    }

    // 10. Get even numbers from a list
    public static List<Integer> getEvenNumbers(List<Integer> list) {
        return list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
    }

    // 11. Get common elements between two lists
    public static <T> List<T> commonElements(List<T> list1, List<T> list2) {
        return list1.stream().filter(list2::contains).collect(Collectors.toList());
    }

    // 12. Count vowels in a string
    public static long countVowels(String input) {
        return input.toLowerCase().chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
    }

    // 13. Partition list into even and odd numbers
    public static Map<Boolean, List<Integer>> partitionEvenOdd(List<Integer> list) {
        return list.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
    }

    // 14. Convert list to map with string length
    public static Map<String, Integer> listToMapWithLength(List<String> list) {
        return list.stream().collect(Collectors.toMap(Function.identity(), String::length));
    }

    // 15. Find longest string
    public static Optional<String> longestString(List<String> list) {
        return list.stream().max(Comparator.comparingInt(String::length));
    }

    // 16. Remove null and empty strings
    public static List<String> removeNullEmpty(List<String> list) {
        return list.stream().filter(s -> s != null && !s.isEmpty()).collect(Collectors.toList());
    }

    // 17. Frequency of each character in string
    public static Map<Character, Long> charFrequency(String input) {
        return input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    // 18. Square and filter list
    public static List<Integer> squareAndFilter(List<Integer> list) {
        return list.stream().map(i -> i * i).filter(i -> i > 100).collect(Collectors.toList());
    }

    // 19. Last element in list
    public static Optional<Integer> getLastElement(List<Integer> list) {
        return list.stream().reduce((first, second) -> second);
    }

    // 20. Skip and limit
    public static List<Integer> skipAndLimit(List<Integer> list, int skip, int limit) {
        return list.stream().skip(skip).limit(limit).collect(Collectors.toList());
    }

    // 21. Convert int array to list
    public static List<Integer> arrayToList(int[] arr) {
        return Arrays.stream(arr).boxed().collect(Collectors.toList());
    }

    // 22. Get unique characters from list of strings
    public static Set<Character> uniqueCharacters(List<String> list) {
        return list.stream().flatMapToInt(String::chars).mapToObj(c -> (char) c).collect(Collectors.toSet());
    }

    // 23. Find second highest number
    public static Optional<Integer> secondHighest(List<Integer> list) {
        return list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
    }

    // 24. Palindromes from list
    public static List<String> findPalindromes(List<String> list) {
        return list.stream().filter(s -> s.equals(new StringBuilder(s).reverse().toString())).collect(Collectors.toList());
    }

    // 25. Anagrams check
    public static boolean areAnagrams(String s1, String s2) {
        return Arrays.equals(s1.chars().sorted().toArray(), s2.chars().sorted().toArray());
    }

    // 26. Find average of a list
    public static OptionalDouble average(List<Integer> list) {
        return list.stream().mapToInt(i -> i).average();
    }

    // 27. Convert list to comma-separated string
    public static String listToCSV(List<String> list) {
        return String.join(",", list);
    }

    // 28. Find frequency of words in a string
    public static Map<String, Long> wordFrequency(String input) {
        return Arrays.stream(input.split("\\s+")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    // 29. Check if list contains only digits
    public static boolean containsOnlyDigits(List<String> list) {
        return list.stream().allMatch(s -> s.matches("\\d+"));
    }

    // 30. Flatten list of lists
    public static <T> List<T> flattenList(List<List<T>> nestedList) {
        return nestedList.stream().flatMap(Collection::stream).collect(Collectors.toList());
    }

    // 31. Group by string length
    public static Map<Integer, List<String>> groupByLength(List<String> list) {
        return list.stream().collect(Collectors.groupingBy(String::length));
    }

    // 32. Count words with length > 5
    public static long countLongWords(String sentence) {
        return Arrays.stream(sentence.split(" ")).filter(word -> word.length() > 5).count();
    }

    
}
