import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class wordSplit_v1 {
    public static void main(String[] args) {
        String[] strArr = { "cat", "apple,bat,cat,goodbye,hello,yellow,why" };
        String result = "not possible";
        String target = strArr[0];
        String[] dictionary = strArr[1].split(",");
        Set<String> dictionarySet = new HashSet<>(Arrays.asList(dictionary));

        for (String word : dictionarySet) {
            if (target.startsWith(word)) {
                String remaining_target = target.substring(word.length());
                if (dictionarySet.contains(remaining_target) && !word.equals(remaining_target)) {
                    result = word + ", " + remaining_target;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
