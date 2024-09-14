import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ArrayCharacterPositionFinder {
    public static void main(String[] args) {
        /*
        Write a method that returns the positions of the desired letter in the given array.
         */
        Random random = new Random();
        String[] letters = {"A","B","C","A","D","D","B","C","A"}; // An example string array

        int[] positions = returnPositions(letters, "C");
        System.out.println(Arrays.toString(positions));


    }

    public static int[] returnPositions(String[] letters, String letter) {

        ArrayList<Integer> positionsList = new ArrayList<>();
        boolean isNotFound = true;

        for (int i = 0; i < letters.length; i++) {
            if (letter.equals(letters[i])) {
                positionsList.add(i+1);
                isNotFound = false;
            }
        }

        if (isNotFound) {
            System.out.println(letter + "not found");
            return null;
        } else {
            int[] positions = new int[positionsList.size()];
            for (int i = 0; i < positions.length; i++) {
                positions[i] = positionsList.get(i);
            }

            return positions;
        }


    }


}

