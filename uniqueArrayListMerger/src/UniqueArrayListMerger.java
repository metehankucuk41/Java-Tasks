import java.util.ArrayList;
import java.util.Arrays;

public class UniqueArrayListMerger {
    public static void main(String[] args) {
        /*
        Create a method that get two arrays as a parameters then return
        the arraylist which has contains unique elements in it.
         */
        int[] array1 = {1,2,3,4};
        int[] array2 = {4,5,6};

        System.out.println(uniqueCombiner(array1, array2));

    }

    /**
     * Merges two integer arrays into a single ArrayList containing only unique elements.
     *
     * @param array1 the first array to be merged
     * @param array2 the second array to be merged
     * @return an ArrayList containing unique elements from both input arrays
     */
    public static ArrayList<Integer> uniqueCombiner(int[] array1, int[] array2) {
        ArrayList<Integer> mergedList = new ArrayList<>();

        for (int i = 0; i < array1.length; i++) {
            mergedList.add(array1[i]);
        }

        for (int i = 0; i < array2.length; i++) {
            if(!mergedList.contains(array2[i])) {
                mergedList.add(array2[i]);
            }
        }

        return mergedList;
    }
}
