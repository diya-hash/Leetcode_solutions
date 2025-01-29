import java.util.HashSet;

public class containsDuplicate {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        HashSet<Integer> set = new HashSet<>();
        boolean isTrue = false;
        for (int n : nums) {
            if (set.contains(n)) {
                isTrue = true;
                break;
            } else {
                set.add(n);
            }
        }
        System.out.println(isTrue);
    }
}
