import java.util.HashMap;

import easy.minAvgSmallestLargestElement;

public class validAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (char ch : s.toCharArray()) {
            if (!map1.containsKey(ch))
                map1.put(ch, 1);
            else
                map1.put(ch, map1.get(ch) + 1);
        }
        for (char ch : t.toCharArray()) {
            if (!map2.containsKey(ch))
                map2.put(ch, 1);
            else
                map2.put(ch, map2.get(ch) + 1);
        }
        System.out.println(map2);
        System.out.println(map1);
        if (map1.equals(map2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
