import java.util.HashMap;

public class romanToInteger {
    public static void main(String[] args) {
        String s = "LVIII";
        HashMap<Character, Integer> map = new HashMap<>();
        int result = 0;
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int temp = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (temp <= map.get(s.charAt(i))) {
                result += map.get(s.charAt(i));
            } else {
                result -= map.get(s.charAt(i));
            }
            temp = map.get(s.charAt(i));
        }
        System.out.println(result);
    }
}
