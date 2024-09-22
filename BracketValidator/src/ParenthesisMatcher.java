import java.sql.Array;
import java.util.*;

public class ParenthesisMatcher {

    /**
     * Main method that initializes a list of strings with different types of parentheses
     * and checks each string to validate the parentheses sequence using the bracketValidator method.
     * If the string contains only valid parentheses characters, it proceeds to validate them.
     *
     * @param args Command-line arguments (not used in this program)
     */
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("()", "()[]{}", "(]", "([)]", "{[]}"));
        Map<String, String> parenthesisMap = new HashMap<>();
        parenthesisMap.put("(", ")");
        parenthesisMap.put("{", "}");
        parenthesisMap.put("[", "]");

        for (String s : arrayList) {
            if (hasIllegalChar(s)) {
                System.out.println(s + " " + bracketValidator(s, parenthesisMap));
            }
        }
    }

    /**
     * Validates if the input string has a valid sequence of matching opening and closing parentheses.
     * Uses a stack to track opening parentheses and ensures proper closing order.
     *
     * @param s The input string containing parentheses
     * @param parenthesisMap A map containing matching pairs of opening and closing parentheses
     * @return True if the string contains valid parentheses order, false otherwise
     */
    public static boolean bracketValidator(String s, Map<String, String> parenthesisMap) {

        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            String sub = s.substring(i, i + 1);
            if (parenthesisMap.containsKey(sub)) {
                stack.push(parenthesisMap.get(sub));
            } else if (!stack.isEmpty() && stack.peek().equals(parenthesisMap.get(sub))) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }


    /**
     * Checks if the input string contains only valid parentheses characters.
     * Invalid characters are those that are not part of the predefined set of parentheses.
     *
     * @param input The input string to be checked
     * @return True if the string contains only valid parentheses characters, false otherwise
     */
    public static boolean hasIllegalChar(String input) {

        char[] illegalChars = {'(',')','[',']','{','}'};

        boolean hasIllegalChar = false;

        for (int i = 0; i < input.length(); i++) {
            boolean isIllegal = false;
            for (int j = 0; j < illegalChars.length; j++) {
                if (input.charAt(i) == illegalChars[j]) {
                    isIllegal = true;
                }
            }
            if(!isIllegal) {
                return false;
            }
        }

        return true;

    }




}
