import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * The MultiListMerger class provides a method to merge multiple lists of integers
 * into a single sorted list. It demonstrates the concept of merging and sorting
 * multiple lists.
 */
public class MultiListMerger {
    public static void main(String[] args) {

        List<List<Integer>> lists = new ArrayList<>();
        lists.add(Arrays.asList(1, 2, 5));
        lists.add(Arrays.asList(1, 4, 3));
        lists.add(Arrays.asList(2, 6));

        System.out.println(mergeMultiLists(lists));
    }

    /**
     * Merges multiple lists of integers into a single sorted list.
     *
     * This method takes a list of lists as input, merges all the individual
     * lists into a single list, and then sorts the resulting list in ascending order.
     *
     * @param lists the list of lists to be merged and sorted
     * @return a sorted ArrayList of integers containing all the elements from the input lists
     */
    public static ArrayList<Integer> mergeMultiLists(List<List<Integer>> lists) {

        ArrayList<Integer> list = new ArrayList<>();
        for (List<Integer> list1 : lists) {
            list.addAll(list1);
        }
        Collections.sort(list);
        return list;
    }
}
