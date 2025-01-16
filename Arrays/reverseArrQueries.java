import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reverseArrQueries {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1, 0));
        List<List<Integer>> operations = new ArrayList<>();
        operations.add(Arrays.asList(0, 9));
        operations.add(Arrays.asList(4, 5));
        operations.add(Arrays.asList(3, 6));
        operations.add(Arrays.asList(2, 7));
        operations.add(Arrays.asList(1, 8));
        operations.add(Arrays.asList(0, 9));

        for (List<Integer> ops : operations) {
            System.out.println(ops);
            Collections.reverse(list.subList(ops.get(0), ops.get(1) + 1));
            System.out.println(list);
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
            System.out.print(arr[i] + " ");
        }
    }
}
