import java.util.*;

public class PartOne {

    // Method to sum all even numbers in an ArrayList
    public static int sumOfEvenNumbers(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    // Method to filter strings of length less than 5 from a LinkedList
    public static LinkedList<String> filterStringsByLength(LinkedList<String> strings) {
        LinkedList<String> filteredList = new LinkedList<>();
        for (String str : strings) {
            if (str.length() >= 5) {
                filteredList.add(str);
            }
        }
        return filteredList;
    }

    // Method to find common elements between two sets
    public static Set<Integer> findCommonElements(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> commonElements = new HashSet<>(set1);
        commonElements.retainAll(set2);
        return commonElements;
    }

    // Method to count occurrences of each integer in an array and return a Map
    public static Map<Integer, Integer> countIntegers(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        return countMap;
    }

    // Main method to test the PartOne class
    public static void main(String[] args) {
    }
}
