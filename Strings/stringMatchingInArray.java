import java.util.ArrayList;

public class stringMatchingInArray {
    public static void main(String[] args) {
        String[] words = { "leetcoder", "leetcode", "od", "hamlet", "am" };
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i == j)
                    continue;
                else {
                    if (words[i].contains(words[j]) == true) {
                        if (list.contains(words[j]))
                            continue;
                        else
                            list.add(words[j]);
                    }
                }
            }
        }
        System.out.println(list);
    }

}
