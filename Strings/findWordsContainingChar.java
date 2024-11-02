
import java.util.*;

class findWordsContainingChar {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> v = new ArrayList<Integer>();
        int index = 0;

        for (String i : words) {
            if (i.indexOf(x) != -1)
                v.add(index);
            index++;
        }
        return v;
    }
}