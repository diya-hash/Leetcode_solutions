import java.util.*;

public class adjacentSubarrayDetection1 {
    public static void main(String[] args) {
        int n[] = { 1, 2, 3, 4, 4, 4, 4, 5, 6, 7 };
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(-15);
        nums.add(19);
        int k = 1;
        boolean result = false;
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            boolean flag = false;
            if (k > 1) {
                for (int j = i; j < k - 1; j++) {
                    if (nums.get(j + 1) > nums.get(j)) {
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }
                }
                if (flag == true)
                    count++;
                if (count == 2) {
                    result = true;
                    break;
                }
            } else {
                if (nums.get(i + 1) > nums.get(i)) {
                    flag = true;
                    count++;
                    if (count == 1 && flag == true) {
                        result = true;
                        break;
                    }

                }
            }

        }
        System.out.println("count: " + count + "result: " + result);
    }

}
