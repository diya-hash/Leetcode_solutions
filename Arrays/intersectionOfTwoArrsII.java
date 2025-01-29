import java.util.ArrayList;
import java.util.HashMap;

public class intersectionOfTwoArrsII {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 1 };

        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int len = 0;

        for (int i = 0; i < nums1.length; i++) {
            if (map1.containsKey(nums1[i])) {
                map1.put(nums1[i], map1.get(nums1[i]) + 1);
            } else {
                map1.put(nums1[i], 1);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            if (map2.containsKey(nums2[i])) {
                map2.put(nums2[i], map2.get(nums2[i]) + 1);
            } else {
                map2.put(nums2[i], 1);
            }
        }

        if (map1.size() <= map2.size()) {
            map1.forEach(
                    (key, value) -> {
                        if (map2.containsKey(key)) {
                            for (int i = 0; i < Math.min(map2.get(key), map1.get(key)); i++) {
                                list.add(key);
                            }
                        }
                    });
        } else {
            map2.forEach(
                    (key, value) -> {
                        if (map1.containsKey(key)) {
                            for (int i = 0; i < Math.min(map2.get(key), map1.get(key)); i++) {
                                list.add(key);
                            }
                        }
                    });
        }

        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            array[i] = list.get(i);
    }
}
