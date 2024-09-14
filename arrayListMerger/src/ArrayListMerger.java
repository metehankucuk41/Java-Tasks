import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMerger {
    public static void main(String[] args) {
        /*
        Create a method that get two arraylists as a parameters the
        return the array which has contains all elements in it.
         */
        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(4,5,6));

        System.out.println(mergeArrayLists(arrayList1, arrayList2));
    }

    /**
     * Merges two ArrayLists into one.
     *
     * @param a the first ArrayList to be merged
     * @param b the second ArrayList to be merged
     * @return a new ArrayList containing all elements from both input ArrayLists
     */
    public static ArrayList<Integer> mergeArrayLists(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> c = new ArrayList<>(a);
        c.addAll(b);
        return c;
    }
}
