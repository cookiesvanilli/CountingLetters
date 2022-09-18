import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String line = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
                "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi " +
                "ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit " +
                "in voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
                "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia " +
                "deserunt mollit anim id est laborum.";

        Map<Character, Integer> amount = new HashMap<>();

        for (char symbol : line.toCharArray()) {
            if (Character.isLetter(symbol)) {
                if (!amount.containsKey(symbol)) {
                    amount.put(symbol, 1);
                } else {
                    amount.put(symbol, amount.get(symbol) + 1);
                }
            }
        }

        int maxValueInMap = (Collections.max(amount.values()));
        for (Map.Entry<Character, Integer> entry : amount.entrySet()) {
            if (entry.getValue() == maxValueInMap) {
                System.out.println("The most common letter: " + entry.getKey());
            }
        }
        int minValueInMap = (Collections.min(amount.values()));
        for (Map.Entry<Character, Integer> entry : amount.entrySet()) {
            if (entry.getValue() == minValueInMap) {
                System.out.println("The rarest letter: " + entry.getKey());
                break;
            }
        }
    }
}
