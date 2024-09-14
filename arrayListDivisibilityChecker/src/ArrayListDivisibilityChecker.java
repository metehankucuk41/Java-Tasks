import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListDivisibilityChecker {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(2,3,4,5,6,7,8,9));
        System.out.println("Please enter a target number.");
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        System.out.println("Divisible numbers: " + findDivisibleNumbers(arrayList, target));
    }

    /**
     * Finds numbers in the given ArrayList that are divisible by the target number.
     *
     * @param arrayList the ArrayList of integers to be checked
     * @param targetNumber the number by which divisibility will be checked
     * @return a new ArrayList containing numbers divisible by the target number
     */
    public static ArrayList<Integer> findDivisibleNumbers(ArrayList<Integer> arrayList, int targetNumber) {
        ArrayList<Integer> divisibleNumbers = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % targetNumber == 0) {
                divisibleNumbers.add(arrayList.get(i));
            }
        }
        return divisibleNumbers;
    }
}
