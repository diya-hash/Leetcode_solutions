import java.util.HashMap;

public class firstUniqueCharInString {
    public static void main(String[] args) {
        String s = "aabb";
        char[] chars = s.toCharArray();
        int[] freq = new int[26];
        int result = -1;
        for (char c : chars) {
            freq[c - 'a']++;
        }
        for (int i = 0; i < chars.length; i++) {
            if (freq[chars[i] - 'a'] == 1) {
                result = i;
            }
        }
        System.out.println(result);
    }
}
// HashMap<Character, Integer> map = new HashMap<>();
// char[] ch = s.toCharArray();

// for (int i = 0; i < n; i++) {
// if (!map.containsKey(ch[i])) {
// map.put(ch[i], 1);
// } else {
// map.put(ch[i], map.get(ch[i]) + 1);
// }
// }
// int result = -1;
// for (int i = 0; i < n; i++) {
// if (map.get(ch[i]) == 1) {
// result = i;
// break;
// }
// }
// System.out.println(result);