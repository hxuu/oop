import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        // Test sumOfEvenNumbers method
        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        int sumOfEvens = PartOne.sumOfEvenNumbers(numbersList);
        System.out.println("Sum of even numbers: " + sumOfEvens);

        // Test filterStringsByLength method
        LinkedList<String> stringsList = new LinkedList<>(Arrays.asList("Hello", "there", "world", "!", "Java"));
        LinkedList<String> filteredStrings = PartOne.filterStringsByLength(stringsList);
        System.out.println("Filtered strings: " + filteredStrings);

        // Test findCommonElements method
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));
        Set<Integer> commonElements = PartOne.findCommonElements(set1, set2);
        System.out.println("Common elements: " + commonElements);

        // Test countIntegers method
        int[] integerArray = { 1, 2, 3, 4, 5, 2, 3, 4, 5, 5 };
        Map<Integer, Integer> integerCountMap = PartOne.countIntegers(integerArray);
        System.out.println("Integer count map: " + integerCountMap);

        // Test PartTwo class
        PartTwo.main(args);
    }
}
