import java.util.Arrays;
import java.util.HashSet;

public class wordsplit {
    public static void main(String[] args) {
        String[] strArr = { "hellocat", "apple,bat,cat,goodbye,hello,yellow,why" };
        boolean result = false;
        String output = "not possible";
        String word = strArr[0];
        String words = strArr[1];
        String[] dictionary = words.split(",");
        HashSet<String> dictionarySet = new HashSet<>(Arrays.asList(dictionary));
        System.out.println(dictionarySet);
        for (String s : dictionary) {
            if (word.startsWith(s)) {
                String word_remaining = word.substring(s.length());
                if (dictionarySet.contains(word_remaining) && !s.equals(word_remaining)) {
                    System.out.println(word_remaining + " " + s);
                    output = s + ", " + word_remaining;
                    result = true;
                    break;
                    // return true;
                }
            }
        }
        System.out.println(output);
    }

}
